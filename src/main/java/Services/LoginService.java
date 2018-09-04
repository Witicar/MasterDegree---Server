package Services;

import Database.Database;

import javax.persistence.*;

public class LoginService extends Database {

    public String getLoginData(String login) {
        Query query;
        String response = null;

        startDatabase();
        entityManager.getTransaction().begin();
        query = entityManager.createQuery("select patient.password from Patient patient where patient.login =: login");
        query.setParameter("login", login);
        try{
            response = query.getSingleResult().toString();
        }
        catch (NoResultException e) {
        }
        finally {
            entityManager.getTransaction().commit();
            closeDatabase();
            return response;
        }
    }
}
