package com.film.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.film.models.Ocjena;

public interface OcjenaRepository extends JpaRepository<Ocjena, Long>  {
	
	//public S save(Ocjena ocjena);

}
