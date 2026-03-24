package com.example.biblotecaduoc.service;

import  com.example.biblotecaduoc.model.Libro;
import  com.example.biblotecaduoc.repository.LibroRepository;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Service;
import  java.util.List;



@Service
public class LibrosService {

    @Autowired
    private LibroRepository LibroRepository;


    public List <Libro> getLibros() {
        return LibroRepository.obtenLibros();

    }

    public Libro saveLibro (Libro libro) {

        return LibroRepository.guardar(libro);

    }

    public Libro getLibroId(int id)  {

        return LibroRepository.buscarporId(id);
    }

    public Libro updateLibro(Libro libro)  {
        return LibroRepository.actualizar(libro);

    }

    public String deleteLibro(int id ) {

        LibroRepository.eliminar(id);
        return "Productor Eliminado";
    }


}
