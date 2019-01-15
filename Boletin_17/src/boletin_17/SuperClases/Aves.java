/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17.SuperClases;

import boletin_17.Boletin_17.*;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Aves implements boletin_17.Interfaces.IPodeCamiñar{

    @Override
    public void camiñar() {
        System.out.println("Caminando aviarmente");    
    }
    
}
