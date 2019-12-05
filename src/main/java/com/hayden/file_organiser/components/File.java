package com.hayden.file_organiser.components;

public class File {
    private Long id;
    private String description;
    private String dateOpened;
    private String dateClosed;
    private String status;
    private Location location;

    public File(String description, String dateOpened, String dateClosed, String status, Location location) {
        this.description = description;
        this.dateOpened = dateOpened;
        this.dateClosed = dateClosed;
        this.status = status;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }

    public String getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(String dateClosed) {
        this.dateClosed = dateClosed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
