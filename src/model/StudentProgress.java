package model;

public class StudentProgress {

    private int dsaScore;
    private int javaScore;
    private int aptitudeScore;
    private int projectScore;

    public StudentProgress(int dsaScore,
            int javaScore,
            int aptitudeScore,
            int projectScore) {

        this.dsaScore = dsaScore;
        this.javaScore = javaScore;
        this.aptitudeScore = aptitudeScore;
        this.projectScore = projectScore;
    }

    public int getDsaScore() {
        return dsaScore;
    }

    public int getJavaScore() {
        return javaScore;
    }

    public int getAptitudeScore() {
        return aptitudeScore;
    }

    public int getProjectScore() {
        return projectScore;
    }

    @Override
    public String toString() {
        return "DSA Score: " + dsaScore +
                "\nJava Score: " + javaScore +
                "\nAptitude Score: " + aptitudeScore +
                "\nProject Score: " + projectScore;
    }
}