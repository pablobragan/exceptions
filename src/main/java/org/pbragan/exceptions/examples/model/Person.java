package org.pbragan.exceptions.examples.model;

import java.util.List;
import java.util.Objects;

public class Person {

    private Long id;

    private String name;

    private List<Clothes> clothes;

    private Mood mood;

    private PersonState state;

    public Mood getMood() {
        return mood;
    }

    public Person setMood(Mood mood) {
        this.mood = mood;
        return this;
    }

    public PersonState getState() {
        return state;
    }

    public Person setState(PersonState state) {
        this.state = state;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Person setId(Long id) {
        this.id = id;
        return this;
    }

    public List<Clothes> getClothes() {
        return clothes;
    }

    public Person setClothes(List<Clothes> clothes) {
        this.clothes = clothes;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clothes=" + clothes +
                ", mood=" + mood +
                ", state=" + state +
                '}';
    }
}
