package com.example.travelers.repos;

import com.example.travelers.entity.SenderRequestsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SenderRequestsRepository extends JpaRepository<SenderRequestsEntity, Long> {
    List<SenderRequestsEntity> findAllByBoardId(Long id);
}
