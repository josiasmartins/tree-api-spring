package com.josiasmartins.forest.controllers;

import com.josiasmartins.forest.domain.entity.Tree;
import com.josiasmartins.forest.domain.entity.models.TreeDTO;
import com.josiasmartins.forest.services.TreeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/tree")
public class TreeController {

    @Autowired
    private TreeServiceImpl treeService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tree createTree(@RequestBody TreeDTO treeDTO) {
        return this.treeService.createThree(treeDTO);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Tree getId(@PathVariable("id") Integer id) {
        return this.treeService.getById(id)
                .map(tree -> tree)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Arvore não encotrado"));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Tree> getAll() {
        return this.treeService.getAll();
    }


}
