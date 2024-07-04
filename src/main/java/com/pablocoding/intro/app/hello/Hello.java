package com.pablocoding.intro.app.hello;

import com.pablocoding.intro.app.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class Hello {
    @Autowired
    Persona persona;
    @GetMapping("/saludar")

    public List <Persona> saludar() {

        List<Persona> listaPersona = new ArrayList<>();

       /* Persona persona = new Persona("Pablo", "Garcia", "aa@bb.com", 123456789);
       Persona persona2 = new Persona("Hassy", "Bouce", "ccc@cc.com", 98765432);
        Persona persona3 = new Persona("Juan", "Perez", "vv@vv.com", 123456789);
        Persona persona4 = new Persona("Maria", "Gomez", "cc@cc.com", 987654321);

        listaPersona.add(persona);
        listaPersona.add(persona2);
        listaPersona.add(persona3);
        listaPersona.add(persona4);
        */
        persona.setApellido("Sanchez");
        persona.setNombre("Frascasio");
        persona.setEmail("www@gmail.com");
        persona.setTelefono(99998888);
        listaPersona.add(persona);
        return listaPersona;
    }
}