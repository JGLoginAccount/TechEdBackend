package com.lmig.gfc.TechEducationProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.TechEducationProject.models.MentorProfile;

@Repository

public interface ProfileRepository extends JpaRepository<MentorProfile, Long> {

}
