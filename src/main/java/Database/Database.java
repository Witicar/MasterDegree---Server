package Database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Database {

    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;

    protected void startDatabase() {
        entityManagerFactory = Persistence.
                createEntityManagerFactory("hospital_oracle");
        entityManager = entityManagerFactory.createEntityManager();
    }

    protected void closeDatabase() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
