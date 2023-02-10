package com.example.demo.repository;

import com.example.demo.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<Human, String> {
}
