/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Dell 5421
 */
public class Gato extends Animal {
    
    public Gato(String pelo, String boca, String cola, String ojo, Integer patas) {
        super(pelo, boca, cola, ojo, patas);
    }
    @Override
    public void sonido(){
        System.out.println("El GAto maulla");
                
    }
    
    
}
