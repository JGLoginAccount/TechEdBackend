package com.lmig.gfc.TechEducationProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.TechEducationProject.models.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

	@Query("SELECT u.userNameFirst, u.userNameLast, u.userOffice, u.userDepartment, u.userMarket, "
			+ "ms.mentorSkillSetExperience, mp.mentorTimeFrameAvailable, mp.mentorContactMethod, "
			+ "mp.mentorBestContact FROM " + "MentorProfile mp, masterUser u, Request r, MentorSkills ms WHERE "
			+ "mp.mentorAvailability = 'YES' AND :menteeSkillRequested in (ms.mentorSkillSetExperience)")
	public List<Object[]> getResults(@Param("menteeSkillRequested") String menteeSkillRequested );

}
