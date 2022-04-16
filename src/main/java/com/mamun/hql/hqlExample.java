package com.mamun.hql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



import com.mamun.hibernate.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class hqlExample {

   public static void main(String[] args) {
         Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session s=factory.openSession();

        // String query="from Student";
        //  Query q = s.createQuery(query);
        
        // String query="from Student where city='Dhaka'";
        //  Query q = s.createQuery(query);

        
      //   Scanner sc=new Scanner(System.in);
      //   System.out.println("Enter city name :");
      //   String city=sc.next();
      //   System.out.println("Enter Student name :");
      //   String name=sc.next();
      //   // String query="from Student where city=:x";
      //   String query="from Student as s where s.city=:x and s.name=:n";
       
      //    Query q = s.createQuery(query);
         
      //    q.setParameter("x", city);
      //    q.setParameter("n", name);





      //    List<Student> list=q.list();

      //    for(Student student: list){
      //       //  System.out.println(student.getName()+":"+student.getCity());
      //       System.out.println(student);
      //    }

          System.out.println("------------------------------------");

          //Delete query
       Transaction tx=s.beginTransaction();

      // Query q2=s.createQuery("delete from Student where city=:x");
      //   q2.setParameter("x", "Cumila");
      // int delete= q2.executeUpdate();
      // System.out.println("Deleted");
      // System.out.println(delete);

      //update query

      Query q3=s.createQuery("update Student s set s.city=:x where s.name=:n");
      q3.setParameter("x", "Noaga" );
      q3.setParameter("n", "Naim");

      int r=q3.executeUpdate();
      System.out.println(r+" Updated");
      tx.commit();
//inner join

      Query q4=s.createQuery("select q.question,q.questionId,a.answer from Question as q INNER JOIN q.answer as a");
      List<Object[]>list=q4.getResultList();

      for(Object[] arr:list){
         System.out.println(Arrays.toString(arr));
      }
s.close();
factory.close();
        
   }

}
