package edu.school21.service;

import edu.school21.model.HeroDto;
import edu.school21.repository.HeroRepositoryImpl;
import lombok.Data;

import java.sql.SQLException;
import java.util.List;

@Data
public class HeroService {
    private final HeroRepositoryImpl heroRepository;

    public HeroService() {
        this.heroRepository = new HeroRepositoryImpl();
    }

    public HeroDto findByName (String name) throws SQLException {
        return heroRepository.findByName(name);
    }
    public HeroDto findById (Integer id) throws SQLException {
        return heroRepository.findById(id);
    }
    public List<HeroDto> findAll() throws SQLException {
        return heroRepository.findAll();
    }
    public void save(HeroDto entity) throws SQLException {
        heroRepository.save(entity);
    }
    public void update(HeroDto entity) throws SQLException {
        heroRepository.update(entity);
    }
    public void delete(HeroDto entity) throws SQLException {
        heroRepository.delete(entity);
    }
}
