/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author gabri
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        int a = 5;
        System.out.println(a);

        Circulo cir1 = new Circulo();
        cir1.setRadio(8);
        System.out.println(cir1.getRadio());

        System.out.println(cir1.perimetro());
        System.out.println(cir1.area());

        /*
        Circulo cir2 = new Circulo(5);
        System.out.println(cir2.radio);
        */
        
         Coche coche = new Coche("Ethan", "Tani", "Kami", "Aolani");

        // Cada persona se presenta
        coche.presentarse();
    }
}
    


    
       


