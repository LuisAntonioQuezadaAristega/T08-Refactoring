/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.despues;

/**
 *
 * 
 */
public class Notas {
    private int examen;
    private int deberes;
    private int lecciones;
    private int talleres;
      
    
   public double CacularNotaTeorico(){
       return (examen + deberes+lecciones)*0.8;
   }
    
   public double CalcularNotaPractico(){
       return talleres*0.2;
   }
   
}
