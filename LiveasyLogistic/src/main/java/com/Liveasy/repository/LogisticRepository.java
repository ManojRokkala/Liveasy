package com.Liveasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Liveasy.entity.LogisticEntity;

@Repository
public interface LogisticRepository extends JpaRepository<LogisticEntity, String> {

}
