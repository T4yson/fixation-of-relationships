package com.example.fixation.question1.controller;

import com.example.fixation.question1.model.Document;
import com.example.fixation.question1.service.DocumentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documents")
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentService documentService;

    @PostMapping
    public ResponseEntity<Document> create(@RequestBody @Valid Document document) {
        return ResponseEntity.status(HttpStatus.CREATED).body(documentService.save(document));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Document> get(@PathVariable Long id) {
        return ResponseEntity.ok(documentService.findById(id));
    }
}
