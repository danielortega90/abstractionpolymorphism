/*

 */
package abstractionpolymorphism;

/**
 *
 * @author Daniel CAVS
 */
public class PioneroX extends Spacecraft {

    //class attributes
    public double years;
    // builder

    public PioneroX(double years) {
        this.years = 1.6;
    }

    public PioneroX() {
        this.push = 26;
        this.weight = 258;
        this.transport = 0.4;
         this.years = 1.6;

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
