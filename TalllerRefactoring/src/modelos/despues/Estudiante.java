/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.despues;

import java.util.ArrayList;

/**
 *
 * @author
 */
public class Estudiante extends UsuarioEspol{
    private String matricula;
   
    public Estudiante(String matricula, String facultad, String nombre, String apellido, int edad, String direccion, String telefono, ArrayList<Paralelo> paralelos) {
        super(facultad, nombre, apellido, edad, direccion, telefono, paralelos);
        this.matricula = matricula;
    }

    public String getMatricula() {
        
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
  
}
