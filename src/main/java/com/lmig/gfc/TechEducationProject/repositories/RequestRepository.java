package com.lmig.gfc.TechEducationProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.TechEducationProject.models.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

	@Query("select DISTINCT s.skills, u.lastName, u.firstName, mp.mentorTimeFrameAvailable, mp.mentorContactMethod, mp.mentorBestContact from appUsers u,  MentorProfile mp,  Skills s  where skills=(:menteeSkillRequested) AND mentor_availability='yes'")
	public List<Object[]> getResults(@Param("menteeSkillRequested") String menteeSkillRequested );

	
	
}
