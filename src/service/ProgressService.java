package service;

import model.StudentProgress;

public class ProgressService {
    public double calculateReadinessScore(StudentProgress progress) {
        double total = progress.getDsaScore() + progress.getJavaScore() +
                progress.getAptitudeScore() + progress.getProjectScore();
        return total / 4; // Assuming equal weightage for all subjects
    }

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

}
