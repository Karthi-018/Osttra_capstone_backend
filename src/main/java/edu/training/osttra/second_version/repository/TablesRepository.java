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

    public String getSelectedColumnName(String tableName)
    {
        Query query = entityManager.createNativeQuery("SELECT c.column_name\n" +
                "FROM information_schema.table_constraints tc \n" +
                "JOIN information_schema.constraint_column_usage AS ccu USING (constraint_schema, constraint_name) \n" +
                "JOIN information_schema.columns AS c ON c.table_schema = tc.constraint_schema\n" +
                "  AND tc.table_name = c.table_name AND ccu.column_name = c.column_name\n" +
                "WHERE constraint_type = 'PRIMARY KEY' and tc.table_name = :tableName");
        query.setParameter("tableName",tableName);
        return query.getSingleResult().toString();
    }
}
