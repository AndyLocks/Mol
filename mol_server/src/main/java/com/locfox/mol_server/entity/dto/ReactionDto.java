package com.locfox.mol_server.entity.dto;

import com.locfox.mol_server.entity.neo4j.MoleculeNode;
import com.locfox.mol_server.entity.neo4j.ReactionNode;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public record ReactionDto(List<MoleculeDto> reagents, MoleculeDto product) {

    public static ReactionDto from(ReactionNode reactionNode) {
        return new ReactionDto(
                MoleculeDto.<MoleculeNode>from(reactionNode.getReagents(), MoleculeDto::from),
                MoleculeDto.from(reactionNode.getProduct()));
    }

    public static <U> ReactionDto from(U object, Function<U, ReactionDto> function) {
        return function.apply(object);
    }

    public static <U> List<ReactionDto> from(Collection<U> molecules, Function<U, ReactionDto> function) {
        return molecules.stream()
                .map(function)
                .toList();
    }

    @Override
    public String toString() {
        return reagents + " -> " + product;
    }

}
