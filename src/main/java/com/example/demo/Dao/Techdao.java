package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Tech;


@RepositoryRestResource(collectionResourceRel = "tech",path="tech")
public interface Techdao extends JpaRepository<Tech, Integer>
{

}
