package com.mamun.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        // Student st = new Student();

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter : ");
        // int id=sc.nextInt();

        Session session=factory.openSession();
       
        Student student=(Student)session.get(Student.class, 101);
        System.out.println(student.getName());
        System.out.println(student.getCity());
        

        session.close();
        factory.close();
        
    }
    
}
