package com.josiasmartins.forest.domain.entity.models;

import com.josiasmartins.forest.domain.entity.Tree;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class TreeDTO {

    private String name;

    private String typeTree;

    public TreeDTO(Tree tree) {
        this.name = tree.getName();
        this.typeTree = tree.getTypeTree();
    }

}
