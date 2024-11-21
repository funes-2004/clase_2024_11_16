/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase20241123;

/**
 *
 * @author Dell 5421
 */
public class depositos extends transcacion {
    
    private float montoDeposito; 
    private int cuentaDestino; 
    private String referenciaDeposito; 

    public depositos(float montoDeposito, int cuentaDestino, String referenciaDeposito, float monto, int cuenta_origen, int cuenta_destino, String tipo_transcacion) {
        super(monto, cuenta_origen, cuenta_destino, tipo_transcacion);
        this.montoDeposito = montoDeposito;
        this.cuentaDestino = cuentaDestino;
        this.referenciaDeposito = referenciaDeposito;
    }

    public float getMontoDeposito() {
        return montoDeposito;
    }

    public void setMontoDeposito(float montoDeposito) {
        this.montoDeposito = montoDeposito;
    }

    public int getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(int cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public String getReferenciaDeposito() {
        return referenciaDeposito;
    }

    public void setReferenciaDeposito(String referenciaDeposito) {
        this.referenciaDeposito = referenciaDeposito;
    }
    
    
}
