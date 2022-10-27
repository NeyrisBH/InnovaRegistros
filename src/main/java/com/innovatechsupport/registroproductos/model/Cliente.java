package com.innovatechsupport.registroproductos.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data //GET AND SETTER
@NoArgsConstructor //CONSTRUCTOR DEFAULT
@RequiredArgsConstructor //CONTRUCTOR CON PARAMETROS
@Entity
public class Cliente implements Serializable {
    @Id
    private Integer id;
    @NonNull
    private String nombres;
    private String apellidos;
    private String email;
    private Integer telefono;
    private String direccion;

    public Cliente(Integer id, String nombres, String apellidos, String email, Integer telefono, String direccion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}

