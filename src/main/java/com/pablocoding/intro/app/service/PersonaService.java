package com.pablocoding.intro.app.service;
//aqui definimos los metodos que vamos a utilizar en el servicio
import com.pablocoding.intro.app.entity.Persona;
import java.util.List;
public interface PersonaService {
    //metodos abrstractos
    //metodo que devuelva listado de objetos persona
    List<Persona> listapersonas();

    //metodo que inserta una persona
    void insertaPersona();
}
