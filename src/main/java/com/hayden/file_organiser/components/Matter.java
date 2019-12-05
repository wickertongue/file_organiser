package com.hayden.file_organiser.components;

public class Matter {
    private Long id;
    private String description;
    private FeeEarner feeEarner;

    public Matter(String description, FeeEarner feeEarner) {
        this.description = description;
        this.feeEarner = feeEarner;
    }

    public FeeEarner getFeeEarner() {
        return feeEarner;
    }

    public void setFeeEarner(FeeEarner fee_earner) {
        this.feeEarner = fee_earner;
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
}
