package com.lmig.gfc.TechEducationProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.TechEducationProject.models.MentorProfile;
import com.lmig.gfc.TechEducationProject.models.Skills;
import com.lmig.gfc.TechEducationProject.models.User;

@Repository

public interface ProfileRepository extends JpaRepository<MentorProfile, Long> {
	public List<MentorProfile> findAllByMentorSkills(Skills skill);
	
	public MentorProfile findAllBymentorNnumber(String nNumber);

}
