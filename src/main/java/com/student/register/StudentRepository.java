package com.student.register;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;




@RepositoryRestResource(collectionResourceRel ="students",path ="students")
public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Query("select s from Student s where s.startingPoint=?1 and s.endPoint=?2")
    List<Student> getAllBystartingPointAndendPoint(String startingPoint,String endPoint);
}
