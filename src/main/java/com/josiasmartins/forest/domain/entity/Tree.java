package com.josiasmartins.forest.domain.entity;

import com.josiasmartins.forest.domain.entity.models.TreeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tree")
public class Tree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tree")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "type_tree")
    private String typeTree;

    public Tree(TreeDTO treeDTO) {
        this.name = treeDTO.getName();
        this.typeTree = treeDTO.getTypeTree();
    }


}
