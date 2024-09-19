/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.composite;

/**
 *
 * @author localadmin
 */
public class CompositeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Component hd = new Leaf(4000,"HDO");
        Component mouse = new Leaf(500,"Mouse");
        Component monitor = new Leaf(8000,"Monitor");
        Component RAM = new Leaf(2000,"RAM");
        Component CPU = new Leaf(25000,"CPU");
        
        composite peripheral = new composite("Peripheral");
        composite cabinet = new composite("Cabinet");
        composite motherboard = new composite("MotherBoard");
        composite computer = new composite("Computer");
        
        motherboard.addComponent(CPU);
        motherboard.addComponent(RAM);
        
        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);
        cabinet.addComponent(hd);
        cabinet.addComponent(motherboard);
        
        computer.addComponent(peripheral);
        computer.addComponent(cabinet);
        
        computer.showPrice();
        
        // TODO code application logic here
    }
    
}
