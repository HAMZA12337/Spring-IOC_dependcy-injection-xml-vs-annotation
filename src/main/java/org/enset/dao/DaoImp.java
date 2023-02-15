package org.enset.dao;

import dao.IDao;
import org.springframework.stereotype.Component;




@Component("dao")
public class DaoImp implements IDao {
    @Override
    public double getValue() {
        System.out.println("a travers la base de donnee");

        return Math.random()*19;
    }
}
