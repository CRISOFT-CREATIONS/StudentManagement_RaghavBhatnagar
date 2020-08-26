package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entity.VirtualClass;

public interface ClassRepository extends JpaRepository<VirtualClass, Long> {

}
