/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.expedia;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class HotelsOffersHandler implements Serializable {
    private String name;

    /**
     * Creates a new instance of NameHandler
     */
    public HotelsOffersHandler() {
        name = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
