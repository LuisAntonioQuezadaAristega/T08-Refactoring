/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.despues;

/**
 *
 * @author
 */
public class Materia {
    private String codigo;
    private String nombre;
    private String facultad;
    private Notas notas;
    private double notaTeorico;
    private double notaPractico;
    private double notaFinal;

    public Materia(String codigo, String nombre, String facultad, double notaTeorico, double notaPractico, double notaFinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.facultad = facultad;
         notaTeorico=0;
         notaPractico=0;
         notaFinal=0;
    }
  
   
   
     
    private void CalcularNota(){
        notaTeorico = notas.CacularNotaTeorico();
        notaPractico = notas.CalcularNotaPractico();
    }
    private void notaFinal(){
        notaFinal = notaTeorico + notaPractico;
    }
    public String getCodigo() {
       
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

   
    }
    
    

