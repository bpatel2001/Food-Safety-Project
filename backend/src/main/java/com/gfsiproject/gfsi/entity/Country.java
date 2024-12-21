package com.gfsiproject.gfsi.entity;

public class Country {
    private String country;
    private double overall;
    private double affordability;
    private double availability;
    private double quality;
    private double sustainability;
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

    public double getOverall() {
        return overall;
    }

    public void setOverall(double overall) {
        this.overall = overall;
    }

    public double getAffordability() {
        return affordability;
    }

    public void setAffordability(double affordability) {
        this.affordability = affordability;
    }

    public double getAvailability() {
        return availability;
    }

    public void setAvailability(double availability) {
        this.availability = availability;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    public double getSustainability() {
        return sustainability;
    }

    public void setSustainability(double sustainability) {
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
    
    public Country(String country, double overall, double affordability, double availability, double quality, double sustainability, int overallrank, int affordabilityrank, int availabilityrank, int qualityrank, int sustainabilityrank) {
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

