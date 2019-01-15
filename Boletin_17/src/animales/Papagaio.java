/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Papagaio extends boletin_17.SuperClases.Aves implements boletin_17.Interfaces.IPodeVolar{

    @Override
    public void volar() {
        System.out.println("volando");
    }
    
}
