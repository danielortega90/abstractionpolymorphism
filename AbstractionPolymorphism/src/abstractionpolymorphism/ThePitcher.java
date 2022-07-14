/*

 */
package abstractionpolymorphism;

/**
 *
 * @author Daniel CAVS
 */
public class ThePitcher extends Spacecraft {

    // builder
    public ThePitcher() {
        this.push = 3060;
        this.weight = 2400;
        this.transport = 100;

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
