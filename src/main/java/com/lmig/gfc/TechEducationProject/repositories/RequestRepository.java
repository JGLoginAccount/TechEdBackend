package com.lmig.gfc.TechEducationProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.TechEducationProject.models.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

}