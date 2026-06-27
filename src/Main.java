import model.StudentProgress;
import service.ProgressService;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                ProgressService service = new ProgressService();

                System.out.print("Enter DSA Score: ");
                int dsa = sc.nextInt();

                System.out.print("Enter Java Score: ");
                int javaScore = sc.nextInt();

                System.out.print("Enter Aptitude Score: ");
                int aptitude = sc.nextInt();

                System.out.print("Enter Project Score: ");
                int project = sc.nextInt();

                StudentProgress progress = new StudentProgress(
                                dsa,
                                javaScore,
                                aptitude,
                                project);

                double readinessScore = service.calculateReadinessScore(progress);

                String weakArea = service.findWeakArea(progress);

                String recommendation = service.getRecommendation(progress);

                String placementStatus = service.getPlacementStatus(progress);

                System.out.println("\n" + progress);

                System.out.println("\nPlacement Readiness Score: "
                                + readinessScore + "%");

                System.out.println("Weak Area: " + weakArea);

                System.out.println("Recommendation: "
                                + recommendation);

                System.out.println("Placement Status: "
                                + placementStatus);

                service.checkEligibleCompanies(progress);

                sc.close();
        }
}