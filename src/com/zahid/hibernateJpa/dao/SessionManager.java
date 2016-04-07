package com.zahid.hibernateJpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Zahid Iqbal Tushar.
 */
public class SessionManager {

    public static EntityManager getEntityManager(){
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("HibernateJpaEntityManager");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }
}
