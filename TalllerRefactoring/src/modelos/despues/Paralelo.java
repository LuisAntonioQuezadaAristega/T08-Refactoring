/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.despues;

import java.util.ArrayList;
import modelos.Ayudante;
import modelos.Materia;

/**
 *
 * @author 
 */
class Paralelo {
    public int numero;
    public Materia materia;
    public modelos.Profesor profesor;
    public ArrayList<modelos.Estudiante> estudiantes;
    public Ayudante ayudante;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public modelos.Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(modelos.Profesor profesor) {
        this.profesor = profesor;
    }
    
    //Imprime el listado de estudiantes registrados
    public void mostrarListado(){
        //No es necesario implementar
    }
}
