/*
.
 */
package abstractionpolymorphism;

import java.util.Scanner;

/**
 *
 * @author Daniel CAVS
 */
public class Menu {

    //class attributes
    int a, e, b, c, d;
    Scanner sc;

    // builder
    public Menu() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        sc = new Scanner(System.in);
    }
    //methods  

    public void menuprincipal() {
        do {
            System.out.println("Seleccione la opción:");
            System.out.println("=====================================");

            System.out.println(" 1- Crear Nave");//OK

            System.out.println(" 2- Si desea salir del programa");//OK

            e = sc.nextInt();
            if (e == 1) {
                nave();
            } else if (e == 2) {
                System.exit(0);
            } else {

                System.out.println("\nIngreso una opcion no valida \n\n");
                menuprincipal();
            }
        } while (e != 2);

    }

    private void nave() {
        do {
            System.out.println("Seleccione la opción:");
            System.out.println("=====================================");

            System.out.println(" 1- Crear Nave MarinerX");//OK
            System.out.println(" 2- Crear Nave PioneroX");//OK
            System.out.println(" 3- Crear Nave SaturnV");//OK
            System.out.println(" 4- Crear Nave ThePitcher");//OK
            System.out.println(" 5- Si desea Volver al menu del programa");//OK
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("------------");
                    createMarinex();
                    break;
                case 2:
                    System.out.println("------------");
                    createPionerox();

                    break;
                case 3:
                    System.out.println("------------");
                    createSaturnv();
                    break;
                case 4:
                    System.out.println("------------");
                    createThepitcher();
                    break;
                case 5:
                    menuprincipal();
            }
            while (a != 5);
        } while (true);
    }

    private void createMarinex() {

        MarinerX s = new MarinerX();
        System.out.println(" 1- Mostar su aceleracion ");//OK
        System.out.println(" 2- Mostar cuando llegara a la luna ");//OK
        System.out.println(" 3- Si desea Volver al menu del programa");//OK
        b = sc.nextInt();

        do {
            switch (b) {
                case 1:

                    s.showSpeed();
                    b = 3;

                    break;
                case 2:
                    s.beInTheMoon();
                    b = 3;
                    break;

                default:
                    System.out.println("ingreso opcion icorrecta ");

            }
        } while (b != 3);
        nave();
    }

    private void createPionerox() {

        PioneroX p = new PioneroX();
        System.out.println(" 1- Mostar su aceleracion ");//OK
        System.out.println(" 2- Mostar cuando llegara a la luna ");//OK
        System.out.println(" 3- Si desea Volver al menu del programa");//OK
        b = sc.nextInt();

        do {
            switch (b) {
                case 1:

                    p.showSpeed();
                    b = 3;

                    break;
                case 2:
                    p.beInTheMoon();
                    b = 3;
                    break;

                default:
                    System.out.println("ingreso opcion icorrecta ");

            }
        } while (b != 3);
        nave();
    }

    private void createThepitcher() {

        ThePitcher t = new ThePitcher();
        System.out.println(" 1- Mostar su aceleracion ");//OK
        System.out.println(" 2- Mostar cuando pesa la nave ");//OK
        System.out.println(" 3- Si desea Volver al menu del programa");//OK
        b = sc.nextInt();

        do {
            switch (b) {
                case 1:

                    t.showSpeed();
                    b = 3;

                    break;
                case 2:
                    t.showWeitht();
                    b = 3;
                    break;

                default:
                    System.out.println("ingreso opcion icorrecta ");

            }
        } while (b != 3);
        nave();
    }

    private void createSaturnv() {

        SaturnV v = new SaturnV();
        System.out.println(" 1- Mostar su aceleracion ");//OK
        System.out.println(" 2- Mostar cuando pesa la nave ");//OK
        System.out.println(" 3- Si desea Volver al menu del programa");//OK
        b = sc.nextInt();

        do {
            switch (b) {
                case 1:

                    v.showSpeed();
                    b = 3;

                    break;
                case 2:
                    v.showWeitht();
                    b = 3;
                    break;

                default:
                    System.out.println("ingreso opcion icorrecta ");

            }
        } while (b != 3);
        nave();
    }

}
