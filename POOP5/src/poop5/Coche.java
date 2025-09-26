/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author gabri
 */
public class Coche {
     // ATRIBUTOS
    String chofer;
    String copiloto;
    String traseroIzq;
    String traseroDer;

    // CONSTRUCTORES
    public Coche() {
    }

    public Coche(String chofer, String copiloto, String traseroIzq, String traseroDer) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.traseroIzq = traseroIzq;
        this.traseroDer = traseroDer;
    }

    // MÉTODO donde cada ocupante se presenta
    public void presentarse() {
        System.out.println("Me llamo " + chofer + " y soy el chofer.");
        System.out.println("Me llamo " + copiloto + " y soy el copiloto.");
        System.out.println("Me llamo " + traseroIzq + " y voy en la parte trasera izquierda.");
        System.out.println("Me llamo " + traseroDer + " y voy en la parte trasera derecha.");
    }
}
