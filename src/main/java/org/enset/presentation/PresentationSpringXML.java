package org.enset.presentation;

import org.enset.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class PresentationSpringXML {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IMetier metier =(IMetier)context.getBean("metier");
        System.out.println("a travers Spring XML"+metier.compute());

    }






}
