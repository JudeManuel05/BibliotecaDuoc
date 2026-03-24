package com.example.biblotecaduoc.repository;



import com.example.biblotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository

public class LibroRepository {

    // Arreglo que guardara todos los libros
    private List<Libro> listaLibros = new ArrayList<>();


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
    
    public Libro actualizar(Libro lib) {
        int id = 0;
        int idPosicion = 0;
        

        for (int i = 0; i <listaLibros.size(); i++ ) {

            if (listaLibros.get(i).getId() == lib.getId()) {

                id = lib.getId();
                idPosicion = i;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listaLibros.set(idPosicion, libro1);

        return libro1;

    }

    public void eliminar (int id) {

        //alternativa 1 
        Libro  libro = buscarporId(id);
        if (libro != null) {
            listaLibros.remove(libro); 
        }

        //alternativa 2
        int idPosicion = 0;
        for (int i = 0; i < listaLibros.size(); i++){

            if (listaLibros.get(i).getId() == i ) {
                idPosicion  = i;
                break;
            }
        }
        if (idPosicion > 0) {
            listaLibros.remove(idPosicion);
        }

        //otra alternativa 
        listaLibros.removeIf( x -> x.getId() == id);
    }

}
