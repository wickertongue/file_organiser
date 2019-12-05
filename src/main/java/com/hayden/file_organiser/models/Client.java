package com.hayden.file_organiser.models;

import java.util.ArrayList;

public class Client {
    private Long id;
    private String forename;
    private String surname;
    private ArrayList<Matter> matters;

    public Client(String forename, String surname, ArrayList<Matter> matters) {
        this.forename = forename;
        this.surname = surname;
        this.matters = matters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Matter> getMatters() {
        return matters;
    }

    public void setMatters(ArrayList<Matter> matters) {
        this.matters = matters;
    }
}
