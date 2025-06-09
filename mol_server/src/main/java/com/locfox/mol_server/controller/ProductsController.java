package com.locfox.mol_server.controller;

import com.locfox.mol_server.entity.Molecule;
import com.locfox.mol_server.entity.dto.ReactionDto;
import com.locfox.mol_server.entity.neo4j.ReactionNode;
import com.locfox.mol_server.repository.MolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductsController {

    private MolRepository molRepository;

    @Autowired
    public ProductsController(MolRepository molRepository) {
        this.molRepository = molRepository;
    }

    @GetMapping("products")
    public ResponseEntity<?> search(@RequestBody List<String> molecules, @RequestParam(defaultValue = "false") boolean asText) {
        List<Molecule> molecule;
        try {
            molecule = Molecule.of(molecules);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }

        var list = ReactionDto.<ReactionNode>from(molRepository.findAllProducts(molecule), ReactionDto::from);

        if (asText) {
            return ResponseEntity.ok(list.stream().map(Object::toString).collect(Collectors.joining("\n")));
        }

        return ResponseEntity.ok(list);
    }

}
