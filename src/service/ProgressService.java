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

    public String getRecommendation(StudentProgress progress) {
        String weakArea = findWeakArea(progress);
        if (weakArea.equals("DSA")) {
            return "Focus on improving your DSA skills. Consider revisiting fundamental concepts and practicing more problems.";
        } else if (weakArea.equals("Java")) {
            return "Focus on improving your Java skills. Review core Java concepts and work on coding exercises.";
        } else if (weakArea.equals("Aptitude")) {
            return "Focus on improving your Aptitude skills. Practice quantitative, logical reasoning, and verbal ability questions.";
        } else {
            return "Focus on improving your Project skills. Work on enhancing your project quality and presentation.";
        }
    }

}
