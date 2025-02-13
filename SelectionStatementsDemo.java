// SelectionStatementsDemo.java
public class SelectionStatementsDemo {
    public static void main(String[] args) {
        // Declare the student score variable
        int studentScore = 82;

        // One-Way if Statement
        if (studentScore >= 60) {
            System.out.println("You passed the exam!");
        }

        // Two-Way if-else Statement
        if (studentScore >= 90) {
            System.out.println("Excellent performance!");
        } else {
            System.out.println("Keep improving!");
        }

        // Nested if Statements
        if (studentScore >= 60) {
            if (studentScore >= 90) {
                System.out.println("Grade: A");
            } else {
                if (studentScore >= 75) {
                    System.out.println("Grade: B");
                } else {
                    System.out.println("Grade: C");
                }
            }
        } else {
            System.out.println("Grade: F");
        }

        // Multi-way if-else Chain
        if (studentScore >= 90) {
            System.out.println("Multi-way Grade: A");
        } else if (studentScore >= 80) {
            System.out.println("Multi-way Grade: B");
        } else if (studentScore >= 70) {
            System.out.println("Multi-way Grade: C");
        } else if (studentScore >= 60) {
            System.out.println("Multi-way Grade: D");
        } else {
            System.out.println("Multi-way Grade: F");
        }
    }
}
