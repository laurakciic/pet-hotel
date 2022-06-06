/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurakciic.pethotel.utility;

import java.math.BigDecimal;
import laurakciic.pethotel.model.Smjestaj;
import laurakciic.pethotel.model.VlasnikZivotinje;
import laurakciic.pethotel.model.Zaposlenik;
import laurakciic.pethotel.model.Zivotinja;
import org.hibernate.Session;

/**
 *
 * @author Laura
 */
public class PocetniInsert {
    
    public static void izvedi(){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Zaposlenik luka = insertZaposlenik("Luka", "Roncevic", "81591177529", "+385979364699", new BigDecimal(8000.00));
        Zaposlenik ivan = insertZaposlenik("Ivan", "Kovacic", "46350556072", "+385979364688", new BigDecimal(8000.00));
        Zaposlenik mato = insertZaposlenik("Mato", "Lauš", "27104446442", "+385979364677", new BigDecimal(8000.00));
        Zaposlenik borna = insertZaposlenik("Borna", "Tobler", "71552378543", "+385979364666", new BigDecimal(8000.00));
        Zaposlenik ivona = insertZaposlenik("Ivona", "Damjanovic", "33753146244", "+385979364655", new BigDecimal(8000.00));
        
        session.beginTransaction();
        
        session.save(luka);
        session.save(ivan);
        session.save(mato);
        session.save(borna);
        session.save(ivona);
        
        Smjestaj psi_regular = insertSmjestaj("Psi - regular", "4x4", "Do 2 psa", "1.9. - any", new BigDecimal(40));
        Smjestaj psi_premium = insertSmjestaj("Psi - premium", "8x8", "Do 4 psa", "1.9. - any", new BigDecimal(50));
        Smjestaj macke_regular = insertSmjestaj("Macke - regular", "3x3", "Do 2 macke", "1.9. - any", new BigDecimal(30));
        Smjestaj macke_premium = insertSmjestaj("Macke - premium", "6x6", "Do 4 macke", "any", new BigDecimal(40));
        Smjestaj ptica = insertSmjestaj("Ptica", "2x2", "Iskljucivo 1x kavez po ptici", "any", new BigDecimal(30));
        Smjestaj gmaz = insertSmjestaj("Gmaz", "2x2", "Iskljucivo 1x kavez po gmazu", "15.8. - any", new BigDecimal(30));
        
        session.save(psi_regular);
        session.save(psi_premium);
        session.save(macke_regular);
        session.save(macke_premium);
        session.save(ptica);
        session.save(gmaz);
        
        VlasnikZivotinje v_ivan = insertVlasnik("Ivan", "Tvrdojevic", "+385992179099", "26921345306");
        VlasnikZivotinje v_karlo = insertVlasnik("Karlo", "Madzarevic", "+385992179088", "78091660402");
        VlasnikZivotinje v_hana = insertVlasnik("Hana", "Tvrdojevic", "+385992179077", "87492741923");
        VlasnikZivotinje v_kristian = insertVlasnik("Kristian", "Madzarevic", "+385992179066", "52965041479");
        
        session.save(v_ivan);
        session.save(v_karlo);
        session.save(v_hana);
        session.save(v_kristian);       
        
        session.getTransaction().commit();      
        
        session.beginTransaction();
        
        Zivotinja macka1 = insertZivotinja("Lujo", "Macka", "Maine Coon", v_hana);
        Zivotinja pas1 = insertZivotinja("Kai", "Pas", "Greyhound", v_ivan);
        Zivotinja ptica1 = insertZivotinja("Miki", "Ptica", "Papiga", v_karlo);
        Zivotinja gmaz1 = insertZivotinja("Sony", "Guster", "Iguana", v_kristian);

        session.save(macka1);
        session.save(pas1);
        session.save(ptica1);
        session.save(gmaz1);        
        
        session.getTransaction().commit();      
        
        /*Faker faker = new Faker(); 
        
        String[] oibi = {"44879378548","38714462960","48653367511",
            "07463739447","55376858772","57121746664","45088797644","97067197029",
            "36388448333","13633152331"};
        
        VlasnikZivotinje vlasnik;
        List<VlasnikZivotinje> vlasnici = new ArrayList<>();
        
        for (int i = 0; i < 4; i++){
            
            vlasnik = new VlasnikZivotinje();
            vlasnik.setIme(faker.name().firstName());
            vlasnik.setPrezime(faker.name().lastName());
            vlasnik.setOib(oibi[i]);
            
            session.save(vlasnik);
        }*/
        
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
    
    private static Smjestaj insertSmjestaj(String naziv, String dimenzije, String namjena, String dostupnost, BigDecimal cijena) {
        
        Smjestaj smjestaj = new Smjestaj();
        
        smjestaj.setNaziv(naziv);
        smjestaj.setDimenzije(dimenzije);
        smjestaj.setNamjena(namjena);
        smjestaj.setDostupnost(dostupnost);
        smjestaj.setCijena(cijena);
        
        return smjestaj;
    }
    
    private static VlasnikZivotinje insertVlasnik(String ime, String prezime, String kontakt_telefon, String oib) {
        
        VlasnikZivotinje vlasnik = new VlasnikZivotinje();
        
        vlasnik.setIme(ime);
        vlasnik.setPrezime(prezime);
        vlasnik.setOib(oib);
        vlasnik.setKontakt_telefon(kontakt_telefon);
        
        return vlasnik;
    }
    
    private static Zivotinja insertZivotinja(String ime, String vrsta, String pasmina, VlasnikZivotinje vlasnik){
        
        Zivotinja zivotinja = new Zivotinja();
        
        zivotinja.setIme(ime);
        zivotinja.setVrsta(vrsta);
        zivotinja.setPasmina(pasmina);
        zivotinja.setVlasnik(vlasnik);
        
        return zivotinja;
    }
}
