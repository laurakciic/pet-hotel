/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurakciic.pethotel.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Laura
 */

// MappedSuperClass - nasljedivat ce ju ostale 
// nema tablicu - ne pisemo @Entity
// abstract - jer ju necemo koristiti pa dajemo do znanja da se ne moze koristiti
// instanca ove klase nego neke klase koja nasljeduje abstract Entitet klasu

@MappedSuperclass                   
public abstract class Entitet {     
                                    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
