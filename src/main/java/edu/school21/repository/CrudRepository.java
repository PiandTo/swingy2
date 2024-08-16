package edu.school21.repository;

import java.sql.SQLException;
import java.util.List;

public interface CrudRepository<T> {
    T findByName (String name) throws SQLException;
    T findById (Integer id) throws SQLException;
    List<T> findAll() throws SQLException;
    void save(T entity) throws SQLException;
    void update(T entity) throws SQLException;
    void delete(T entity) throws SQLException;
}
