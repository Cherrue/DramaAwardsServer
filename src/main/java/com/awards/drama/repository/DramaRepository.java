package com.awards.drama.repository;

import com.awards.drama.entity.DramaEntity;
import com.awards.drama.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DramaRepository extends JpaRepository<DramaEntity, Integer> {
}
