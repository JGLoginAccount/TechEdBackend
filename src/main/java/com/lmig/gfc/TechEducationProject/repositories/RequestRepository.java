package com.lmig.gfc.TechEducationProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.TechEducationProject.models.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

	@Query("SELECT id FROM Request WHERE nNumber in (:nNumber)")
	public List<Long>  findAllByString(@Param("nNumber") String nNumber);
	
	@Query("SELECT count(id) FROM Request WHERE nNumber in (:nNumber)")
	public int  sumofRequests(@Param("nNumber") String nNumber);
	
	
	@Query("SELECT max(id) FROM Request WHERE nNumber in (:nNumber)")
	public int  maxRequest(@Param("nNumber") String nNumber); 


	
	
}
