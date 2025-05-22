/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package par_1c124.pkg20250522.pereyrasoleaisha;

/**
 *
 * @author Aisha
 */
public class Exploracion extends Nave {
    private String tipoMision;

    public Exploracion(String tipoMision, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    public String getTipoMision() {
        return tipoMision;
    }

    public void setTipoMision(String tipoMision) {
        this.tipoMision = tipoMision;
    }

   
    }



