/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurakciic.pethotel.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Laura
 */

// JPA - Java Persistance API - radi s Hibernateom
// pomocu anotacija kazemo da se radi o entitetu 
@Entity
@Table(name="zaposlenik")
public class Zaposlenik {
    
    @Id                                                     // kljuc
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String ime;               // za svako privatno svojstvo (koje ima pripadajuci getter & setter)
    private String prezime;           // kreira se kolona u tablici 
    private String oib;
    private BigDecimal placa;
    private Integer kontakt_telefon;
    
    // po principu ucahurivanja

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public BigDecimal getPlaca() {
        return placa;
    }

    public void setPlaca(BigDecimal placa) {
        this.placa = placa;
    }

    public Integer getKontakt_telefon() {
        return kontakt_telefon;
    }

    public void setKontakt_telefon(Integer kontakt_telefon) {
        this.kontakt_telefon = kontakt_telefon;
    }
    
}
