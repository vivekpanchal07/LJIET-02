package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started" );

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session mysession = sf.openSession();
        Transaction mytrans = mysession.beginTransaction();

        student2 s1 = new student2();
        s1.setRoll_no(1);
        s1.setName("Vivek");
        s1.setAddress("Abad");

        mysession.save(s1);
        mytrans.commit();
        System.out.println("Student Added ");
        mysession.close();
    }
}
