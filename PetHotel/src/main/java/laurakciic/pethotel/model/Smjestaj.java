/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurakciic.pethotel.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Laura
 */

@Entity
public class Smjestaj extends Entitet{
    
    private String naziv;
    private String dimenzije;
    private String namjena;
    private Date dostupnost;
    private BigDecimal cijena;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getDimenzije() {
        return dimenzije;
    }

    public void setDimenzije(String dimenzije) {
        this.dimenzije = dimenzije;
    }

    public String getNamjena() {
        return namjena;
    }

    public void setNamjena(String namjena) {
        this.namjena = namjena;
    }

    public Date getDostupnost() {
        return dostupnost;
    }

    public void setDostupnost(Date dostupnost) {
        this.dostupnost = dostupnost;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }
    
    
}
