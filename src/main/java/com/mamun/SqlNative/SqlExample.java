package com.mamun.SqlNative;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SqlExample {
  public static void main(String[] args) {
      
    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
     Session session=sessionFactory.openSession();

      String q="select * from Student";
       NativeQuery nq=session.createSQLQuery(q);

       List<Object[]> list=nq.list();

       for(Object[] student:list){
        //    System.out.println(Arrays.toString(student));
        System.out.println(student[1]+": "+student[2]);
       }
       


     session.close();
     sessionFactory.close();

  }

}
