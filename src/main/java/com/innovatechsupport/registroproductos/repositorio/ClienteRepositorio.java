package com.innovatechsupport.registroproductos.repositorio;

import com.innovatechsupport.registroproductos.model.entitys.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Repository
@RepositoryRestResource(path = "clientes", collectionResourceRel = "clientes")

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
}
