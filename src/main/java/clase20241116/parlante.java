/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase20241116;

/**
 *
 * @author Dell 5421
 */
public class parlante extends producto{
    private String sonido;
    private String rendimiento;

    public parlante(String sonido, String rendimiento, String color, String marca, String modelo) {
        super(color, marca, modelo);
        this.sonido = sonido;
        this.rendimiento = rendimiento;
    }

 

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }
    
    
}
