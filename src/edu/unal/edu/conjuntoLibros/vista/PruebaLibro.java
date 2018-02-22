/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author Estudiante
 */


package edu.unal.edu.conjuntoLibros.vista;
import edu.unal.edu.conjuntoLibros.modelo.Autor;
import edu.unal.edu.conjuntoLibros.modelo.Libro;

import java.util.Scanner;
        

public class PruebaLibro {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Nombre Autor");
        String nombre = teclado.next();
        
        //Dependencia
        Autor autor = new Autor (nombre, "Marquez", "245172");
        Libro libro = new Libro ("Cien annios de soledad", 300);
        //asociando el  libro con el autor
        libro.setAutor(autor);
        //
        String autorLibro=libro.getAutor().getNombre();
        System.out.println(autorLibro);
        
        
    }
}
