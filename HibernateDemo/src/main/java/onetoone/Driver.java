package onetoone;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Driver {
    EntityManagerFactory ef = Persistence.createEntityManagerFactory("Persistence");
    EntityManager em = ef.createEntityManager();
}
