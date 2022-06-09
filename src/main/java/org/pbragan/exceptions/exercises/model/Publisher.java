package org.pbragan.exceptions.exercises.model;

import java.util.Objects;

public class Publisher {

    private Integer publisherId;
    private String name;
    private String mail;
    private CountryEnum country;

    public Publisher(Integer publisherId, String name, String mail, CountryEnum country) {
        this.publisherId = publisherId;
        this.name = name;
        this.mail = mail;
        this.country = country;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public CountryEnum getCountry() {
        return country;
    }

    public void setCountry(CountryEnum country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return publisherId.equals(publisher.publisherId) && name.equals(publisher.name) && mail.equals(publisher.mail) && country == publisher.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherId, name, mail, country);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherId=" + publisherId +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", country=" + country +
                '}';
    }
}
