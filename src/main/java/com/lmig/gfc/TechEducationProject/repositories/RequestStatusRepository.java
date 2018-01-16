package com.lmig.gfc.TechEducationProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.TechEducationProject.models.RequestStatus;

@Repository
public interface RequestStatusRepository extends JpaRepository<RequestStatus,Long>{

}
