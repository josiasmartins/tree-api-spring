package com.josiasmartins.forest.services;

import com.josiasmartins.forest.domain.entity.Tree;
import com.josiasmartins.forest.domain.entity.models.TreeDTO;
import com.josiasmartins.forest.repository.TreeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreeServiceImpl {

    @Autowired
    private TreeRepository treeRepository;


    @Transactional
    public Tree createThree(TreeDTO treeDTO) {
        Tree converteDtoInTree = new Tree(treeDTO);
        return this.treeRepository.save(converteDtoInTree);
    }

    public Optional<Tree> getById(Integer id) {
        return this.treeRepository.findById(id);
    }

    public List<Tree> getAll() {
        return this.treeRepository.findAll();
    }


}
