package edu.school21.repository;

import edu.school21.config.ConnectionBD;
import edu.school21.model.HeroDto;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.Set;

public class HeroRepositoryImpl implements CrudRepository<HeroDto> {
    public ConnectionBD connectionBD = new ConnectionBD();

    @Override
    public HeroDto findByName(String name) throws SQLException {
        HeroDto hero = new HeroDto();
        Connection conn = connectionBD.connect();
        Statement statement = conn.createStatement();
        String script = "SELECT * from heroes where name = '" + name + "';";
        try {
            ResultSet rs = statement.executeQuery(script);
            while (rs.next())
            {
                hero.setId(rs.getLong(1));
                hero.setName(rs.getString(2));
                hero.setHeroClass(rs.getString(3));
                hero.setLevel(rs.getInt(4));
                hero.setExperience(rs.getInt(5));
                hero.setAttack(rs.getInt(6));
                hero.setDefense(rs.getInt(7));
                hero.setHp(rs.getInt(8));
            }
            rs.close();
            conn.close();
        } catch (SQLException e){
            e.getMessage();
        }
        return hero;
    }

    @Override
    public HeroDto findById(Integer id) throws SQLException {
        HeroDto hero = new HeroDto();
        Connection conn = connectionBD.connect();
        Statement statement = conn.createStatement();
        String script = "SELECT * from heroes where id = '" + id + "';";
        try {
            ResultSet rs = statement.executeQuery(script);
            while (rs.next())
            {
                hero.setId(rs.getLong(1));
                hero.setName(rs.getString(2));
                hero.setHeroClass(rs.getString(3));
                hero.setLevel(rs.getInt(4));
                hero.setExperience(rs.getInt(5));
                hero.setAttack(rs.getInt(6));
                hero.setDefense(rs.getInt(7));
                hero.setHp(rs.getInt(8));
            }
            rs.close();
            conn.close();
        } catch (SQLException e){
            e.getMessage();
        }
        return hero;
    }

    @Override
    public ArrayList<HeroDto> findAll() throws SQLException {
        ArrayList<HeroDto> list = new ArrayList<>();
        Connection conn = connectionBD.connect();
        Statement statement = conn.createStatement();
        String script = "SELECT * from heroes";
        try {
            ResultSet rs = statement.executeQuery(script);
            while (rs.next())
            {
                HeroDto hero = new HeroDto();
                hero.setId(rs.getLong(1));
                hero.setName(rs.getString(2));
                hero.setHeroClass(rs.getString(3));
                hero.setLevel(rs.getInt(4));
                hero.setExperience(rs.getInt(5));
                hero.setAttack(rs.getInt(6));
                hero.setDefense(rs.getInt(7));
                hero.setHp(rs.getInt(8));
                list.add(hero);
            }
            rs.close();
            conn.close();
        } catch (SQLException e){
            e.getMessage();
        }
        return list;
    }

    @Override
    public void save(HeroDto hero) throws SQLException {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<HeroDto>> constraintViolations = validator.validate(hero);

        for (ConstraintViolation<HeroDto> constr: constraintViolations) {
            StringBuilder stringBuilder = new StringBuilder("property: ");
            stringBuilder.append(constr.getMessage());
            System.out.println(stringBuilder.toString());
            return ;
        }

        Connection conn = connectionBD.connect();
        String script = "INSERT INTO heroes (name, hero_classes, level, experience, attack, defense, hp) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(script);
            ps.setString(1, hero.getName());
            ps.setString(2, hero.getHeroClass());
            ps.setInt(3, hero.getLevel());
            ps.setInt(4, hero.getExperience());
            ps.setInt(5, hero.getAttack());
            ps.setInt(6, hero.getDefense());
            ps.setInt(7, hero.getHp());
            ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(HeroDto entity) throws SQLException {

    }

    @Override
    public void delete(HeroDto entity) throws SQLException {

    }
}
