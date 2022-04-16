package com.mamun.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    
    public static void main(String[] args) {
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
       
        Student s1=new Student(107,"Nitu","Feni");

        Certificate c=new Certificate("Js","24 hours");
        s1.setCerti(c);

    

        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(s1);

        tx.commit();

    

        session.close();
        factory.close();
        
    }
    
}
