package com.lmig.gfc.TechEducationProject.repositories;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.TechEducationProject.models.Skills;


@Repository
public interface skillsRepository extends JpaRepository<Skills,Long> {

	
	@Query("SELECT max(id) FROM Skills WHERE skills in (:skill)")
	public Long  findOneByString(@Param("skill") String skill);


}
