/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseCajero;

/**
 *
 * @author Dell 5421
 */
public class transcacion {
    private String monto; 
    private String  cuenta_origen; 
    private String  cuenta_destino; 
    private String tipo_transcacion;

    public transcacion(String monto, String cuenta_origen, String cuenta_destino, String tipo_transcacion) {
        this.monto = monto;
        this.cuenta_origen = cuenta_origen;
        this.cuenta_destino = cuenta_destino;
        this.tipo_transcacion = tipo_transcacion;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getCuenta_origen() {
        return cuenta_origen;
    }

    public void setCuenta_origen(String cuenta_origen) {
        this.cuenta_origen = cuenta_origen;
    }

    public String getCuenta_destino() {
        return cuenta_destino;
    }

    public void setCuenta_destino(String cuenta_destino) {
        this.cuenta_destino = cuenta_destino;
    }

    public String getTipo_transcacion() {
        return tipo_transcacion;
    }

    public void setTipo_transcacion(String tipo_transcacion) {
        this.tipo_transcacion = tipo_transcacion;
    }

   
}
