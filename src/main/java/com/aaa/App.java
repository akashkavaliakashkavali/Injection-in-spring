package com.aaa;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        akash result = (akash) context.getBean("akash");  // this is byname and
//        akash result = context.getBean(akash.class); // this is bytype
        result.run();

        System.out.println(result.getAge());

//        laptop result1 = (laptop) context.getBean("laptop");
//        result1.compile();
    }
}