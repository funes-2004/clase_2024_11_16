/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase20241123;

/**
 *
 * @author Dell 5421
 */
public class retiros extends transcacion{
   private float montRetiro; 
   private int cuentaOrigen;
   private String motivoRetiro;

    public retiros(float montRetiro, int cuentaOrigen, String motivoRetiro, float monto, int cuenta_origen, int cuenta_destino, String tipo_transcacion) {
        super(monto, cuenta_origen, cuenta_destino, tipo_transcacion);
        this.montRetiro = montRetiro;
        this.cuentaOrigen = cuentaOrigen;
        this.motivoRetiro = motivoRetiro;
    }

    public float getMontRetiro() {
        return montRetiro;
    }

    public void setMontRetiro(float montRetiro) {
        this.montRetiro = montRetiro;
    }

    public int getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(int cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public String getMotivoRetiro() {
        return motivoRetiro;
    }

    public void setMotivoRetiro(String motivoRetiro) {
        this.motivoRetiro = motivoRetiro;
    }
    
   
    
    
        
    
    
    
}
