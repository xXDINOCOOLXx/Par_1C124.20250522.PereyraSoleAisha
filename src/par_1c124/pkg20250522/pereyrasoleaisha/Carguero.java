/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c124.pkg20250522.pereyrasoleaisha;

/**
 *
 * @author Aisha
 */
public class Carguero extends Nave {
    public int capacidadCarga;

    public Carguero(int capacidadCarga, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }
    
    
}
