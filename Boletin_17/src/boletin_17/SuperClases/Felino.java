/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17.SuperClases;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Felino extends Mamifero implements boletin_17.Interfaces.IpodeNadar{

    @Override
    public void nadar() {
        System.out.println("nadando felinamente");
    }
    
}
