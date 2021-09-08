/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication385herencia;

/**
 *
 * @author Invitado
 */
public class Datos 
{
    
     public static int numeroRandom(int desde, int hasta)//para edad, legajo y dni
    {
        return (int)(Math.random()*(hasta-desde+1)+desde);
          
    }
 
}
