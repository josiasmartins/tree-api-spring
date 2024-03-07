package com.josiasmartins.forest.domain.entity.models;

import com.josiasmartins.forest.domain.entity.Tree;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TreeDTO {

    private String name;

    private String typeTree;

    public TreeDTO(Tree tree) {
        this.name = tree.getName();
        this.typeTree = tree.getTypeTree();
    }

}
