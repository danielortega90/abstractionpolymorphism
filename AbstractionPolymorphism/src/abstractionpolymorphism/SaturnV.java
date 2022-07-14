/*
 
 */
package abstractionpolymorphism;

/**
 *
 * @author Daniel CAVS
 */
public class SaturnV extends Spacecraft {

    // builder
    public SaturnV() {
        this.push = 3500;
        this.weight = 2900;
        this.transport = 118;

    }

    //methods  
    public void showSpeed() {
        System.out.println("its acceleration is :" + push);
        this.push = this.push;
    }

    public void showWeitht() {
        System.out.println("the weight of the ship is: " + weight);
        this.weight = this.weight;
    }

    @Override
    public void stopSpeed() {
        push = 0;
    }
}
