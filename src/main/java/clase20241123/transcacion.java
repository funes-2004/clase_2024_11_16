/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase20241123;

/**
 *
 * @author Dell 5421
 */
public class transcacion {
    float monto; 
    int cuenta_origen; 
    int cuenta_destino; 
    String tipo_transcacion;

    public transcacion(float monto, int cuenta_origen, int cuenta_destino, String tipo_transcacion) {
        this.monto = monto;
        this.cuenta_origen = cuenta_origen;
        this.cuenta_destino = cuenta_destino;
        this.tipo_transcacion = tipo_transcacion;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getCuenta_origen() {
        return cuenta_origen;
    }

    public void setCuenta_origen(int cuenta_origen) {
        this.cuenta_origen = cuenta_origen;
    }

    public int getCuenta_destino() {
        return cuenta_destino;
    }

    public void setCuenta_destino(int cuenta_destino) {
        this.cuenta_destino = cuenta_destino;
    }

    public String getTipo_transcacion() {
        return tipo_transcacion;
    }

    public void setTipo_transcacion(String tipo_transcacion) {
        this.tipo_transcacion = tipo_transcacion;
    }
    
    
     
    
}
