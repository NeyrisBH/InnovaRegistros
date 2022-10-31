package com.innovatechsupport.registroproductos.model.entitys;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
    @GeneratedValue
    private Integer id;
    @NonNull
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String email;
    private double telefono;
    private String direccion;

    public Cliente(String identificacion, String nombres, String apellidos, String email, double telefono, String direccion) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}

