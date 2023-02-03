package com.uamcc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uamcc.entitys.EgresadoEntity;
import com.uamcc.repositorys.EgresadoRepository;

@Service
public class EgresadoService {
	@Autowired
	private EgresadoRepository repo;

	public Iterable<EgresadoEntity> getAll() {
		return repo.findAll();
	}
}
