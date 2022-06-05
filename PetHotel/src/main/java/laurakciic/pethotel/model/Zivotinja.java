/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurakciic.pethotel.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Laura
 */

@Entity
public class Zivotinja extends Entitet{
    
    private String ime;
    private String vrsta;
    private String pasmina;

    @ManyToOne
    private VlasnikZivotinje vlasnik;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getPasmina() {
        return pasmina;
    }

    public void setPasmina(String pasmina) {
        this.pasmina = pasmina;
    }

    public VlasnikZivotinje getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(VlasnikZivotinje vlasnik) {
        this.vlasnik = vlasnik;
    }
    
    
}
