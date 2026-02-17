import java.util.Scanner;

class Arraydoub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = 5;
        int subjects = 3; 

        String[] subjectNames = {"Tamil", "English", "Dance"};
        int[][] marks = new int[students][subjects];

       
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.print(subjectNames[j] + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

     
        System.out.print("Student\t");
        for (String subject : subjectNames) {
            System.out.print(subject + "\t");
        }
        System.out.println("Sum\tAverage");

        
        for (int i = 0; i < students; i++) {
            int sum = 0;
            System.out.print("S" + (i + 1) + "\t");
            for (int j = 0; j < subjects; j++) {
                System.out.print(marks[i][j] + "\t");
                sum += marks[i][j];
            }
            double average = (double) sum / subjects;
            System.out.println(sum + "\t" + average);
        }
    }
}
