/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurakciic.pethotel.model;

import java.math.BigDecimal;
import javax.persistence.Entity;

/**
 *
 * @author Laura
 */

@Entity
public class Zaposlenik extends Osoba{   
                                       
    // za svako privatno svojstvo (koje ima pripadajuci getter & setter)
    // kreira se kolona u tablici 
    
    private String oib;
    private BigDecimal placa;
    
    // po principu ucahurivanja
    
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
    
    
}
