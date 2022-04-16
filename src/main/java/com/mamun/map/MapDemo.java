package com.mamun.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    
    public static void main(String[]args){

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // Question q=new Question();
        // q.setQuestionId(101);
        // q.setQuestion("Hibernate is related to ?");

        // Answer answer1=new Answer();
        // answer1.setAnswerId(10);
        // answer1.setAnswer("Python");
        // answer1.setQuestion(q);

        // Answer answer2=new Answer();
        // answer2.setAnswerId(11);
        // answer2.setAnswer("Java");
        // answer2.setQuestion(q);

        // Answer answer3=new Answer();
        // answer3.setAnswerId(12);
        // answer3.setAnswer("js");
        // answer3.setQuestion(q);

        // List<Answer> ansList=new ArrayList<Answer>();
        // ansList.add(answer1);
        // ansList.add(answer2);
        // ansList.add(answer3);
        // q.setAnswer(ansList);

        Session session=factory.openSession();

        Question question=(Question)session.get(Question.class, 101);
        System.out.println(question.getQuestion());

        // for(Answer ans: question.getAnswer()){
        //     System.out.println(ans.getAnswer()); 
        // }
        
        // Transaction tx=session.beginTransaction();

        // session.save(q);
        // session.save(answer1);
        // session.save(answer2);
        // session.save(answer3);
      

        // tx.commit();

    

        session.close();
        factory.close();
        
        
        
        


    }

    
}
