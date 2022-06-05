/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurakciic.pethotel.utility;

import java.math.BigDecimal;
import laurakciic.pethotel.model.Zaposlenik;
import org.hibernate.Session;

/**
 *
 * @author Laura
 */
public class PocetniInsert {
    
    public static void izvedi(){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Zaposlenik luka = insertZaposlenik("Luka", "Roncevic", "2619712299", "+385979364699", new BigDecimal(8000.00));
        Zaposlenik ivan = insertZaposlenik("Ivan", "Kovacic", "2619712288", "+385979364688", new BigDecimal(8000.00));
        
        session.beginTransaction();
        session.save(luka);
        session.save(ivan);
        session.getTransaction().commit();      // dobit ce ID
    }
    
    private static Zaposlenik insertZaposlenik(String ime, String prezime, String oib, String kontakt_telefon, BigDecimal placa){
        
        Zaposlenik zaposlenik = new Zaposlenik();
        
        zaposlenik.setIme(ime);
        zaposlenik.setPrezime(prezime);
        zaposlenik.setOib(oib);
        zaposlenik.setKontakt_telefon(kontakt_telefon);
        zaposlenik.setPlaca(placa);
        
        return zaposlenik;
    }
}
