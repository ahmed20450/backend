package com.example.ehote.repositories;

import com.example.ehote.entities.Prestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestationRepository extends JpaRepository<Prestation,Long> {
}
