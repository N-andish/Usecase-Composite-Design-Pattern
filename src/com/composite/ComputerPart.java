/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.composite;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author localadmin
 */
public class ComputerPart {
    
}
interface Component{
    void showPrice();
}
class Leaf implements Component{
    int price;
    String name;
    
    public Leaf(int price,String name){
        super();
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price);
        
    }


}
class composite implements Component{
    String name;    
    List<Component> Components = new ArrayList();
    
    public composite(String name){
        super();
        this.name= name;
    }
    
    public void addComponent(Component com){
        Components.add(com);
        
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component c : Components){
            c.showPrice();
        }
        
    }
    
}