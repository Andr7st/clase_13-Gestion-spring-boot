package com.devheroes.sb.app.controllers;

import com.devheroes.sb.app.entities.Users;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersControllers {

    List<Users> users = new ArrayList<>();

    @GetMapping("/api/usuarios")
    public List<Users> listUsers() {

        users.add(new Users(1,"Andrés", "Developer", "777", "email@dir.to"));
        users.add(new Users(2,"E8", "Equipo  DevHeroes", "777", "e8@devheroes.to"));
        users.add(new Users(3,"E8 - Andy", "Project Manager", "777", "e8@devheroes.to"));
        users.add(new Users(4,"Lucas My", "Master FullStack", "777", "e8@atl.academy"));
        users.add(new Users(5,"E8 - Luis", "Experto", "777", "e8@devheroes.to"));
        users.add(new Users(6,"E8 - Segura", "Desarrollador", "777", "e8@devheroes.to"));
        users.add(new Users(7,"E8 - Raul", "Goleador 10", "777", "e8@devheroes.to"));
        users.add(new Users(8,"E8 - Jorge", "Maestro", "777", "e8@devheroes.to"));
        users.add(new Users(9,"E8 - Franco", "Developer", "777", "e8@devheroes.to"));
        users.add(new Users(10,"E8 - Elian", "Developer", "777", "e8@devheroes.to"));

        return users;
    }

    @DeleteMapping("/api/usuarios/{id}")
    public void eliminarUsuario(@PathVariable String id) {

        for (Users user : users) {
            if (id.equals(user.getId().toString())) {
                users.remove(user);
            }
        }

        // Usuario usuarioEncontrado = usuarios.stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }

    @PostMapping("/api/usuarios")
    public void addUser(@RequestBody Users u) {
        users.add(u);
    }

}
