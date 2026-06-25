package model;

public class Company {

    private String companyName;
    private double minimumScore;

    public Company(String companyName, double minimumScore) {
        this.companyName = companyName;
        this.minimumScore = minimumScore;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getMinimumScore() {
        return minimumScore;
    }

    @Override
    public String toString() {
        return companyName + " (Minimum Score: " + minimumScore + ")";
    }
}