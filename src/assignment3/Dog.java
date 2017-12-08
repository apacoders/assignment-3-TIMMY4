/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Ryan.Wanner
 */
public class Dog extends Animal {
    
    public Dog(int numberOfLegs, String speakParameter) {
        super(numberOfLegs, speakParameter);
    }

    @Override
    public void walkTo(int x, int y) {
        System.out.println("Walking");
        System.out.println("Waggiing Tail");
        this.xCordinate=x;
        this.yCordinate=y;
    }
    @Override
    public String toString() {
        return "Dog";
    }
    
}
