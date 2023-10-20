package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Project Started!..." );
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();

        Student s1 = new Student();
        s1.setId(104);
        s1.setName("Vivek");
        s1.setCity("Ahmedabad");

        Address a1 = new Address();
        a1.setStreet("ThakkarNagar");
        a1.setCity("Ahmedabad");
        a1.setOpen(false);
        a1.setX(15.30);
        a1.setAddedDate(new Date());

        File file = new File("src/main/resources/temo.png");
        byte[] data = new byte[(int) file.length()];

        FileInputStream fis = new FileInputStream(file);
        fis.read(data);
        fis.close();

        a1.setImage(data);

        System.out.println(s1);

        Transaction transaction = session.beginTransaction();
        session.save(s1);
        session.save(a1);
        transaction.commit();
        session.close();
        System.out.println("Done");

    }
}
