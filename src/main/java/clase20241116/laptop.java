/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase20241116;

/**
 *
 * @author Dell 5421
 */
public class laptop extends producto{
    private String pantalla; 
    private String teclado; 

    public laptop(String pantalla, String teclado, String color, String marca, String modelo) {
        super(color, marca, modelo);
        this.pantalla = pantalla;
        this.teclado = teclado;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

   
    
}
