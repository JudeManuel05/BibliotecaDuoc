package com.example.biblotecaduoc.controller;

import com.example.biblotecaduoc.model.Libro;
import com.example.biblotecaduoc.service.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/api/v1/Libros")

public class LibroController {

    @Autowired
    private LibrosService LibrosService;


    @GetMapping
    public List <Libro> listaLibros() {
        return LibrosService.getLibros();
    }

    @PostMapping
    public Libro AgregarLibro(@RequestBody Libro libro){

        return LibrosService.saveLibro(libro);
    }
    

    @GetMapping("{id}")
    public Libro busLibro (@PathVariable int id){

        return LibrosService.getLibroId(id);
    }

    @PutMapping("{id}")
    public Libro actualizaLibro(@PathVariable int id, @RequestBody Libro libro){
        
        return LibrosService.updateLibro(libro) ;
    }

    @DeleteMapping("{id}")
    public String EliminarLibro(@PathVariable int id) {

        return LibrosService.deleteLibro(id);
    }
}






