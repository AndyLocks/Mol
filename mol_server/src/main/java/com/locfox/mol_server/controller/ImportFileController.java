package com.locfox.mol_server.controller;

import com.locfox.mol_server.repository.MolRepository;
import com.locfox.mol_server.service.MolLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class ImportFileController {

    private MolLanguageService molLanguageService;
    private MolRepository molRepository;

    @Autowired
    public ImportFileController(MolLanguageService molLanguageService, MolRepository molRepository) {
        this.molLanguageService = molLanguageService;
        this.molRepository = molRepository;
    }

    @PostMapping("import")
    public ResponseEntity<Void> importFile(@RequestParam("file") MultipartFile file) throws IOException {
        if (file.isEmpty()) return ResponseEntity.badRequest().build();

        molRepository.save(molLanguageService.convertToGraph(file.getInputStream()));

        return ResponseEntity.ok(null);
    }

}
