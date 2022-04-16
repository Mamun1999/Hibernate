package com.mamun.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        // Student st = new Student();
        // st.setId(101);
        // st.setName("Mamun");
        // st.setCity("Rangpur");

        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID: ");
        int input=sc.nextInt();
        System.out.println("Enter name: ");
        String name=sc.next();

        System.out.println("Enter city: ");
        String city=sc.next();

        Student st=new Student(input,name,city);
        

       
        
        
        //System.out.println(st);

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
        session.beginTransaction();
         session.save(st);
         //We only use transaction when we nee d to save data
        
    
        // Query query=session.createNamedQuery("from Student");
        // List<Student> fetch=query.list();
     
        // session.getTransaction().commit();
        tx.commit();

        session.close();

    }
}
