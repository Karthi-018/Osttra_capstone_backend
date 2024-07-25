package edu.training.osttra.second_version.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TablesRepository {

    @Autowired
    private EntityManager entityManager;

    public List<String> getAllTables()
    {
        Query query = entityManager.createNativeQuery("SELECT tablename FROM pg_catalog.pg_tables WHERE schemaname='MyTables'");
        return query.getResultList();
    }

    public List<String> getTableAllColumns(String tableName)
    {
        Query query = entityManager.createNativeQuery("SELECT column_name   FROM information_schema.columns  WHERE table_name   = :tableName");
        query.setParameter("tableName",tableName);
        return query.getResultList();
    }
}
