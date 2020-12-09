package com.camilabatista.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camilabatista.cursomc.domain.Cliente;
import com.camilabatista.cursomc.repositories.ClienteRepository;
import com.camilabatista.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);					
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: " + id +
				" Tipo: " + Cliente.class.getName()));
	}

}
