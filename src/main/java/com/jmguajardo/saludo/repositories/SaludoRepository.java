package com.jmguajardo.saludo.repositories;

import com.jmguajardo.saludo.models.entities.Saludo;
import com.jmguajardo.saludo.models.entities.Tipo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaludoRepository extends JpaRepository<Saludo, Long>{
    
    Saludo findByTipo(Tipo tipo);
}
