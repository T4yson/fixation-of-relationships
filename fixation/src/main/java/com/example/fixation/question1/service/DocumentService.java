package com.example.fixation.question1.service;

import com.example.fixation.question1.model.Document;
import com.example.fixation.question1.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentService {

    private final DocumentRepository documentRepository;

    public Document save(Document document) {
        return documentRepository.save(document);
    }

    public Document findById(Long id) {
        return documentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Document not found with id: " + id));
    }
}
