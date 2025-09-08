import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("CSE131 Grade for: ");
            String name = in.next();
            System.out.println("Number of studios attended: ");
            int studiosAttended = in.nextInt();
            double weightedStudioGrade = (studiosAttended/8.0)*0.15;
            System.out.println("Weighted studio grade (out of 15): " + weightedStudioGrade + "%");
            System.out.println("Average quiz grade: ");
            double averageQuizGrade = (double)in.nextInt()/100;
            double weightedQuizGrade = averageQuizGrade*0.25;
            System.out.println("Weighted quiz grade: " + weightedQuizGrade);
            System.out.println("Average exam grade: ");
            double averageExamGrade = (double)in.nextInt()/100;
            double weightedExamGrade = averageExamGrade*0.60;
            System.out.println("Weighted exam grade: " + weightedExamGrade);
            double totalGrade = weightedStudioGrade + weightedQuizGrade + weightedExamGrade;
            System.out.println("Total Grade: " + totalGrade);




    }
}
