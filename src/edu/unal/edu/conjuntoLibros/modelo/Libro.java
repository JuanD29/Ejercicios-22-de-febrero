package edu.unal.edu.conjuntoLibros.modelo;


import edu.unal.edu.conjuntoLibros.modelo.Autor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Libro {
    private String titulo; 
    private int numero_de_paginas;
    private int calificacion;
    
    //Asociacion: Cardinalidad 0..1 ó 1
    
    private Autor autor; 

    public Libro(String titulo, int numero_de_paginas) {
        this.titulo = titulo;
        this.numero_de_paginas = numero_de_paginas;
        this.calificacion = calificacion;
        this.autor = autor;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero_de_paginas() {
        return numero_de_paginas;
    }

    public void setNumero_de_paginas(int numero_de_paginas) {
        this.numero_de_paginas = numero_de_paginas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    
    
}
