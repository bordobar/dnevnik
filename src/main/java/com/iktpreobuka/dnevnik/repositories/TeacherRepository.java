package com.iktpreobuka.dnevnik.repositories;

import org.springframework.data.repository.CrudRepository;

import com.iktpreobuka.dnevnik.entities.TeachingEntity;

public interface TeacherRepository extends CrudRepository<TeachingEntity, Integer> {

}
