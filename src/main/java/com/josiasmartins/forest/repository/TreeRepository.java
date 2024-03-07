package com.josiasmartins.forest.repository;

import com.josiasmartins.forest.domain.entity.Tree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository extends JpaRepository<Tree, Integer> {
}
