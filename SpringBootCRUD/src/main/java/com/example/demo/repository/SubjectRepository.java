package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.Subject;

//this interface will extend from CRUD repository intergfaces which has all method like delete , save
public interface SubjectRepository extends CrudRepository<Subject, Integer>{ //entity class n its primary key data type

}
