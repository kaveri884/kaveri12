import java.util.Scanner;

class ArrayInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter subjects:");
    int n = sc.nextInt();
 
    int[] marks = new int[n];

    
    for (int i = 0; i < n; i++) {
      System.out.println("Enter marks for subject " + (i+1) + ":");
      marks[i] = sc.nextInt();
    }

    
    System.out.println("Marks entered:");
    for (int i = 0; i < n; i++) {
      System.out.println("Subject " + (i+1) + ": " + marks[i]);
    }
	
	int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += marks[i]; 
    }

   
    double average = (double) sum / n;

    System.out.println("Total Marks: " + sum);
    System.out.println("Average Marks: " + average);
  }
}
 
 
	
 