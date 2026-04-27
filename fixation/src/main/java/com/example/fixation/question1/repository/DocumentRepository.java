package com.example.fixation.question1.repository;

import com.example.fixation.question1.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {}
