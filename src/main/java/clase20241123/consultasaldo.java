/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase20241123;

/**
 *
 * @author Dell 5421
 */
public class consultasaldo extends transcacion {
    private int cuentaConsulta; 

    public consultasaldo(int cuentaConsulta, float monto, int cuenta_origen, int cuenta_destino, String tipo_transcacion) {
        super(monto, cuenta_origen, cuenta_destino, tipo_transcacion);
        this.cuentaConsulta = cuentaConsulta;
    }

    public int getCuentaConsulta() {
        return cuentaConsulta;
    }

    public void setCuentaConsulta(int cuentaConsulta) {
        this.cuentaConsulta = cuentaConsulta;
    }
    
    
}
