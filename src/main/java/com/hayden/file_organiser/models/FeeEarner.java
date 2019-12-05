package com.hayden.file_organiser.models;

public class FeeEarner {
    private Long id;
    private String name;

    public FeeEarner(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
