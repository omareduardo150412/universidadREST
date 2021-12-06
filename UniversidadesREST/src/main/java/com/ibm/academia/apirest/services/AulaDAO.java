package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.enums.Pizarron;


public interface AulaDAO extends GenericoDAO<Aula>
{
	public Iterable<Aula> buscarAulaPorTipoPizarron(Pizarron tipoPizarron);
	public Iterable<Aula> buscarAulaPorNombrePabellon(String nombrePabellon);
	public Aula buscarAulaPorNumero(Integer numeroAula); 
	
}
