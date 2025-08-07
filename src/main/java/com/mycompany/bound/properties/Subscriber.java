/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bound.properties;

/**
 *
 * @author WANITTRA
 */
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Subscriber implements PropertyChangeListener{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(name + " live result: " + evt.getNewValue());
    }
    
}
