/*
     taller de abstraction polymorphism.
 */
package abstractionpolymorphism;

/**
 *
 * @author Daniel CAVS
 */
//Claas abstract
public abstract class Spacecraft {
    //class attributes   

    public double push;
    public double weight;
    public double transport;

    // builder
     public Spacecraft() {
        this.push = 0;
        this.weight = 0;
        this.transport = 0;
    }
     

    //methods  
    public abstract void showSpeed();

    public void stopSpeed() {
        this.push = 0;
    }
}
