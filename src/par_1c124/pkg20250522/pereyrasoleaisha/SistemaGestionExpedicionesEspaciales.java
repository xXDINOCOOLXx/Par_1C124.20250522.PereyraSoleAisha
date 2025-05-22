/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c124.pkg20250522.pereyrasoleaisha;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aisha
 */
public class SistemaGestionExpedicionesEspaciales {
    public ArrayList <Nave> naves = new ArrayList<>();
    Scanner input = new Scanner(System.in);
     private Nave ingresoDatos() {

        Nave nave;

        System.out.println("Tipo de nave a ingresar:\n 1-Exploracion\n 2-Carguero\n 3-Crucero Estelar: ");
        int tipoNave = input.nextInt();
        System.out.println("Nombre: ");
        String nombre = input.next();
        System.out.println("Capacidad de tripulación: ");
        int capacidadTripulacion = input.nextInt();
        System.out.println("Año de lanzamiento: ");
        int anioLanzamiento = input.nextInt();

        switch(tipoNave) {
            case 1:
                System.out.println("Tipo de misión: ");
                String tipoMision = input.nextLine();
                nave = new Exploracion(tipoMision ,nombre, capacidadTripulacion , anioLanzamiento);
                break;
                
            case 2:
                System.out.println("Capacidad de carga: ");
                int capacidadCarga = input.nextInt();
                nave = new Carguero(capacidadCarga, nombre, capacidadTripulacion , anioLanzamiento);
                break;

            case 3:
                System.out.println("Cantidad de pasajeros: ");
                int cantidadPasajeros = input.nextInt();
                nave = new cruceroEstelar(nombre, capacidadTripulacion , anioLanzamiento, cantidadPasajeros);
                break;

            default:
                nave = null;
                break;
        }

        return nave;
    };

    private boolean verificarNave(Nave nave) {
        for(Nave n: naves) {
            if (n.equals(naves)) {
                return true;
            }
        }
        return false;
    }
    
    public void agregarNave() {
        Nave nave = ingresoDatos();
        if(verificarNave(nave)) {
            System.out.println("La nave ya estaba registrada.");
        } else{
            naves.add(nave);
            System.out.println("Se agregó la nave.");
        }
    };
    
    public void mostrarNaves() {
        for(Nave n : naves) {
            System.out.println(n);
        }
    };

    public void iniciarExploracion() {
        for(Nave n : naves) {
            if(n instanceof Carguero) {
                System.out.println(n.getNombre() + " es una carguero y no puede participar en misiones");
            } else {
                System.out.println(n.getNombre() + " inicia exploración.");
            }  
        }
    }
}
