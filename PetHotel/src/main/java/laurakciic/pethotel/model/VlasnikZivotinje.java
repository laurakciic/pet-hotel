/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurakciic.pethotel.model;

import javax.persistence.Entity;

/**
 *
 * @author Laura
 */

@Entity
public class VlasnikZivotinje extends Osoba{               
 
    private String oib;

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }
  
    
}
