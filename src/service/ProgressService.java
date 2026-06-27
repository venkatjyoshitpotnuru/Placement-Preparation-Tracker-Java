package service;

import java.util.ArrayList;

import model.Company;
import model.StudentProgress;

public class ProgressService {

    private ArrayList<Company> companies;

    // Constructor
    public ProgressService() {

        companies = new ArrayList<>();

        companies.add(new Company("TCS", 50));
        companies.add(new Company("Wipro", 55));
        companies.add(new Company("Infosys", 60));
        companies.add(new Company("Cognizant", 65));
        companies.add(new Company("Capgemini", 70));
        companies.add(new Company("Accenture", 75));
        companies.add(new Company("IBM", 80));
        companies.add(new Company("Deloitte", 85));
        companies.add(new Company("Amazon", 90));
        companies.add(new Company("Microsoft", 95));
    }

    // Calculate Placement Readiness Score
    public double calculateReadinessScore(StudentProgress progress) {

        double total = progress.getDsaScore()
                + progress.getJavaScore()
                + progress.getAptitudeScore()
                + progress.getProjectScore();

        return total / 4.0;
    }

    // Find Weak Area
    public String findWeakArea(StudentProgress progress) {

        int minScore = progress.getDsaScore();
        String weakArea = "DSA";

        if (progress.getJavaScore() < minScore) {
            minScore = progress.getJavaScore();
            weakArea = "Java";
        }

        if (progress.getAptitudeScore() < minScore) {
            minScore = progress.getAptitudeScore();
            weakArea = "Aptitude";
        }

        if (progress.getProjectScore() < minScore) {
            weakArea = "Projects";
        }

        return weakArea;
    }

    // Recommendation Engine
    public String getRecommendation(StudentProgress progress) {

        String weakArea = findWeakArea(progress);

        if (weakArea.equals("DSA")) {
            return "Focus on DSA. Solve LeetCode problems every day.";
        }

        else if (weakArea.equals("Java")) {
            return "Improve Java fundamentals, OOP and Collections.";
        }

        else if (weakArea.equals("Aptitude")) {
            return "Practice aptitude daily and improve quantitative reasoning.";
        }

        else {
            return "Build more real-world projects to strengthen your portfolio.";
        }
    }

    // Placement Status
    public String getPlacementStatus(StudentProgress progress) {

        double score = calculateReadinessScore(progress);

        if (score >= 80)
            return "Ready for Placements";

        else if (score >= 60)
            return "Almost Ready";

        else
            return "Needs Improvement";
    }

}