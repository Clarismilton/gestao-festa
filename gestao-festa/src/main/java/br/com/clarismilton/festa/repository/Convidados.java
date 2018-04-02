package br.com.clarismilton.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.clarismilton.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
