package Task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {

    public static void main(String[] args) throws Exception{
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session mysession = sf.openSession();
        Transaction mytrans = mysession.beginTransaction();

        Passport passport = new Passport();
        passport.setPassportNumber("A123456");

        Citizen citizen = new Citizen();
        citizen.setName("Vivek");


        mysession.save(citizen);
        mytrans.commit();
        System.out.println("Citizen Added");
        mysession.close();


    }




}
