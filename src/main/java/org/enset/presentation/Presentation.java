package org.enset.presentation;

import dao.IDao;
import org.enset.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //-l'injection des dependeces
        // couplage fort
        // l'instanciation statique
//        DaoImp2 dao = new DaoImp2();
//        MetierImp2 metier= new MetierImp2();
//         metier.setDao(dao);
//        System.out.println("la valeur obtenu "+metier.compute());

// l'instanciation dyanamique
        Scanner scanner =new Scanner(new File("config.txt"));
        String daoClassName= scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
       IDao dao= (IDao) cDao.newInstance();
        System.out.println(dao.getValue());

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier =(IMetier)cMetier.newInstance();

      Method method=cMetier.getMethod("setDao",IDao.class);

      //metier.setDao(dao)
      method.invoke(metier,dao);

        System.out.println("Result"+metier.compute());



    }
}
