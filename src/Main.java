import model.StudentProgress;
import service.ProgressService;

public class Main {
    public static void main(String[] args) {
        StudentProgress progress = new StudentProgress(80, 75, 60, 90);
        ProgressService service = new ProgressService();
        double readinessScore = service.calculateReadinessScore(progress);
        String weakArea = service.findWeakArea(progress);
        String recommendation = service.getRecommendation(progress);
        String placementStatus = service.getPlacementStatus(progress);
        System.out.println(progress);
        System.out.println("\nPlacement Readiness Score: "
                + readinessScore + "%");
        System.out.println("Weak Area: " + weakArea);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Placement Status: " + placementStatus);
    }
}