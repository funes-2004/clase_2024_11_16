/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseVehiculo;

/**
 *
 * @author Dell 5421
 */
public class Vehiculo {
    private String Marca;
    private String Modelo;
    private int anio; 

    public Vehiculo(String Marca, String Modelo, int anio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}
