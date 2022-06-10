package org.pbragan.exceptions.examples.model;

import java.util.Objects;

public class Clothes {
    private Long id;
    private String description;

    public Long getId() {
        return id;
    }

    public Clothes setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Clothes setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothes)) return false;
        Clothes clothes = (Clothes) o;
        return Objects.equals(id, clothes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
