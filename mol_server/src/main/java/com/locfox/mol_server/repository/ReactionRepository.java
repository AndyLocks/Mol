package com.locfox.mol_server.repository;

import com.locfox.mol_server.entity.neo4j.ReactionNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface ReactionRepository extends Neo4jRepository<ReactionNode, String> {

    Optional<ReactionNode> findOneById(String id);

}
