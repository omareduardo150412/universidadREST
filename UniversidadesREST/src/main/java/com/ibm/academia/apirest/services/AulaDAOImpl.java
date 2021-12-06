package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.enums.Pizarron;
import com.ibm.academia.apirest.repositories.AulaRepository;
@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula,AulaRepository> implements AulaDAO{
    @Autowired
	public AulaDAOImpl(AulaRepository repository) {
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Aula buscarAulaPorNumero(Integer numeroAula) 
	{
		return repository.buscarAulaPorNumero(numeroAula);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Aula> buscarAulaPorTipoPizarron(Pizarron tipoPizarron) 
	{
		return repository.buscarAulaPorTipoPizarron(tipoPizarron);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Aula> buscarAulaPorNombrePabellon(String nombrePabellon) 
	{
		return repository.buscarAulaPorNombrePabellon(nombrePabellon);
	}

	

}
