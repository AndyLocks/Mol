package com.locfox.mol_server.service;

import com.locfox.mol_server.entity.Molecule;
import org.jgrapht.graph.DefaultEdge;

import java.util.Objects;
import java.util.Set;

public class ReactionEdge extends DefaultEdge {

    public Set<Molecule> reagents() {
        return (Set<Molecule>) getSource();
    }

    public Molecule product() {
        return ((Set<Molecule>) getTarget()).toArray(new Molecule[1])[0];
    }

    @Override
    public String toString() {
        return reagents().toString() + " -> " + product().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        var other = (ReactionEdge) o;

        return Objects.equals(this.reagents(), other.reagents()) &&
                Objects.equals(this.product(), other.product());
    }

    @Override
    public int hashCode() {
        return Objects.hash(product(), reagents());
    }

}
