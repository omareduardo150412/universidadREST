package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.entities.Pabellon;
import com.ibm.academia.apirest.repositories.PabellonRepository;
@Service
public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon,PabellonRepository>  implements PabellonDAO{

	@Autowired
	public PabellonDAOImpl(PabellonRepository repository) 
	{
		super(repository);

	}

	@Override
	@Transactional(readOnly= true)
	public Iterable<Pabellon> buscarPabellonPorLocalidad(String localidad)
	{
		return repository.buscarPabellonPorLocalidad(localidad);
	}

	@Override
	@Transactional(readOnly= true)
	public Iterable<Pabellon> buscarPabellonPorNombre(String nombre) {
		return repository.buscarPabellonPorNombre(nombre);
	}

}
