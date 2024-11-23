/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseVehiculo;

/**
 *
 * @author Dell 5421
 */
public class barco {
    private float longitud; 
    private int capacidad; 
    private String Gps; 

    public barco(float longitud, int capacidad, String Gps) {
        this.longitud = longitud;
        this.capacidad = capacidad;
        this.Gps = Gps;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getGps() {
        return Gps;
    }

    public void setGps(String Gps) {
        this.Gps = Gps;
    }

    
    
}
