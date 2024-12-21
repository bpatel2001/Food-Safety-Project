package com.gfsiproject.gfsi.entity;

public class Country {
    private String country;
    private int overall;
    private int affordability;
    private int availability;
    private int quality;
    private int sustainability;
    private int overallrank;
    private int affordabilityrank;
    private int availabilityrank;
    private int qualityrank;
    private int sustainabilityrank;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getAffordability() {
        return affordability;
    }

    public void setAffordability(int affordability) {
        this.affordability = affordability;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getSustainability() {
        return sustainability;
    }

    public void setSustainability(int sustainability) {
        this.sustainability = sustainability;
    }

    public int getOverallrank() {
        return overallrank;
    }

    public void setOverallrank(int overallrank) {
        this.overallrank = overallrank;
    }

    public int getAffordabilityrank() {
        return affordabilityrank;
    }

    public void setAffordabilityrank(int affordabilityrank) {
        this.affordabilityrank = affordabilityrank;
    }

    public int getAvailabilityrank() {
        return availabilityrank;
    }

    public void setAvailabilityrank(int availabilityrank) {
        this.availabilityrank = availabilityrank;
    }

    public int getQualityrank() {
        return qualityrank;
    }

    public void setQualityrank(int qualityrank) {
        this.qualityrank = qualityrank;
    }

    public int getSustainabilityrank() {
        return sustainabilityrank;
    }

    public void setSustainabilityrank(int sustainabilityrank) {
        this.sustainabilityrank = sustainabilityrank;
    }
    
    public Country(String country, int overall, int affordability, int availability, int quality, int sustainability, int overallrank, int affordabilityrank, int availabilityrank, int qualityrank, int sustainabilityrank) {
        super();
        this.country = country;
        this.overall = overall;
        this.affordability = affordability;
        this.availability = availability;
        this.quality = quality;
        this.sustainability = sustainability;
        this.overallrank = overallrank;
        this.affordabilityrank = affordabilityrank;
        this.availabilityrank = availabilityrank;
        this.qualityrank = qualityrank;
        this.sustainabilityrank = sustainabilityrank;
    }

    public Country(){
        super();
    }

    
    @Override
    public String toString() {
        return "Country [country=" + country + ", overall=" + overall + ", affordability=" + affordability
                + ", availability=" + availability + ", quality=" + quality + ", sustainability=" + sustainability
                + ", overallrank=" + overallrank + ", affordabilityrank=" + affordabilityrank + ", availabilityrank="
                + availabilityrank + ", qualityrank=" + qualityrank + ", sustainabilityrank=" + sustainabilityrank + "]";
    }
    
}

