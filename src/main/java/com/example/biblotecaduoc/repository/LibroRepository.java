package com.example.biblotecaduoc.repository;


import com.example.biblotecaduoc.BiblotecaduocApplication;
import com.example.biblotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository

public class LibroRepository {



    private final BiblotecaduocApplication biblotecaduocApplication;
    // Arreglo que guardara todos los libros
    private List<Libro> listaLibros = new ArrayList<>();


    LibroRepository(BiblotecaduocApplication biblotecaduocApplication) {
        this.biblotecaduocApplication = biblotecaduocApplication;
    }


    // Metodo que retorna todos los libros 
    public List<Libro> obtenLibros() {
        return listaLibros;
    }


    // buscar libro por ID
    public Libro buscarporId(int id){
        for (Libro libro : listaLibros){
            if (libro.getId() == id){
                return libro;
            }
        }
        return null;
    }


    // buscar Libro por su ISBN

    public Libro buscarporIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Guardar Libro 
    public Libro  guardar(Libro lib){
        listaLibros.add(lib);
        return lib;
    }


    // Actualizar Libro 
    
    public Libro actualizar(libro lib){
        int id = 0;
        int idPosicion = 0;
        

        for (int i = 0; i <ArrayLibros.size)();
    }

    




}
