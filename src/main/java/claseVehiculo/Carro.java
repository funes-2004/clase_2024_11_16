/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseVehiculo;

/**
 *
 * @author Dell 5421
 */
public class Carro {
    private int puerta; 
    private int llantas; 
    private int motor; 

    public Carro(int puerta, int llantas, int motor) {
        this.puerta = puerta;
        this.llantas = llantas;
        this.motor = motor;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }
    
    
}
