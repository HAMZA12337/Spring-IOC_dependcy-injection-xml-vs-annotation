package org.enset.metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImp implements IMetier {

    // Couplage faible
    @Autowired
    private IDao  dao =null;

    @Override
    public double compute() {


        double result=dao.getValue();
        return result;
    }

    // Injecter dans la variable dao un objet

//    public void setDao(IDao dao) {
//        this.dao = dao;
//    }
}
