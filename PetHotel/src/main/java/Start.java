
import laurakciic.pethotel.utility.HibernateUtil;
import laurakciic.pethotel.utility.PocetniInsert;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Start {
    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory().openSession();
        
        PocetniInsert.izvedi();     // nije potreban openSession jer je sadrzan u izvedi()
    }
}
