/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurakciic.pethotel.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Laura
 */

@Entity
public class Usluga extends Entitet {
    
    private String opis;
    private Date trajanje;
    private BigDecimal cijena;
    
    @OneToOne
    private Zivotinja zivotinja;
    
    @ManyToOne
    private Zaposlenik zaposlenik;
    
    @ManyToOne
    private Smjestaj smjestaj;

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Date getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Date trajanje) {
        this.trajanje = trajanje;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Zivotinja getZivotinja() {
        return zivotinja;
    }

    public void setZivotinja(Zivotinja zivotinja) {
        this.zivotinja = zivotinja;
    }

    public Zaposlenik getZaposlenik() {
        return zaposlenik;
    }

    public void setZaposlenik(Zaposlenik zaposlenik) {
        this.zaposlenik = zaposlenik;
    }

    public Smjestaj getSmjestaj() {
        return smjestaj;
    }

    public void setSmjestaj(Smjestaj smjestaj) {
        this.smjestaj = smjestaj;
    }
    
    
}
