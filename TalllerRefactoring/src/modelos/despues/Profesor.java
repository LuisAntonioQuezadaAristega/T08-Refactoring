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
public class Profesor extends UsuarioEspol{
    private String codigo;
    private int añosdeTrabajo;
    private double BonoFijo;

    public Profesor(String codigo, String facultad, String nombre, String apellido, int edad, String direccion, String telefono, ArrayList<Paralelo> paralelos) {
        super(facultad, nombre, apellido, edad, direccion, telefono, paralelos);
        this.codigo = codigo;
    }

    public double calcularSueldo(){
        double sueldo=0;
        sueldo= añosdeTrabajo*600 +BonoFijo;
        return sueldo;
    }  
    
}
