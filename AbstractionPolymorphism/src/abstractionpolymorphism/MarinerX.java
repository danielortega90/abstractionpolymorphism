/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionpolymorphism;

/**
 *
 * @author Daniel CAVS
 */
public class MarinerX extends Spacecraft {
    //class attributes

    public double years;

    // builder
    public MarinerX(double years) {
        this.years = 1.3;
    }

    public MarinerX() {
        this.push = 65.79;
        this.weight = 1093;
        this.transport = 0.6;

    }

    //methods  
    public void beInTheMoon() {
        System.out.println("Will reach the moon in :" + years + " years");
        this.years = this.years;
    }

    @Override
    public void stopSpeed() {
        push = 0;
    }

    @Override
    public void showSpeed() {
        System.out.println("its acceleration is :" + push + " ");
        this.push = this.push;
    }
}
