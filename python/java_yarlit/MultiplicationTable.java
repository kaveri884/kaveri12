import java.util.Scanner;

class MultiplicationTable {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Enter a number multiplication table:");
        int x = scan.nextInt();

        System.out.println("Multiplication table for " + x + ":");
        for (int y = 1; y <= 10; y++) {
            int z = x * y;
            System.out.println(x + " x " + y + " = " + z);
        }

        scan.close();*/
		
        int balance = 20000;
        char choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n---ATM Menu---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.print("Choose option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    int dep = sc.nextInt();
                    balance += dep;
                    System.out.println("Updated Balance: " + balance);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int wd = sc.nextInt();
                    if (wd <= balance) {
                        balance -= wd;
                        System.out.println("Updated Balance: " + balance);
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;

                default:
                    System.out.println("Invalid option");
            }

            System.out.print("Do you want another operation? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you! Have a nice day.");
        sc.close();
    }
}

   

