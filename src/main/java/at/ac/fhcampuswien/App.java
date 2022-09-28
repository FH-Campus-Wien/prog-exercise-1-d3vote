package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals(){
        int sum;
        char num1 = (int) 'Z';
        int num2 = 0xFace;
        int num3 = 012;
        long num4 = (int) 80L;
        float num5 = (int) 44e-1f;
        float num6 = (int) 5.5f;
        double num7 = (int) 8.88e1;
        double num8 = (int) 99.9;
        sum = (int) (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8);
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = Integer.sum(x, y);
        System.out.println(sum);
  }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before Swap:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println("n1 > n2");
        }
        if (n2 > n1){
            System.out.println("n1: " + n1 + System.lineSeparator() + "n2: " + n2 + System.lineSeparator() + "n2 > n1");
        }
        if (n1 == n2){
            System.out.println("n2 == n1");
        } else {
            return;
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner sc = new Scanner(System.in);
        int revenue = Integer.parseInt(sc.nextLine());
        System.out.println("Enter annual Revenue: " + revenue);

        if (revenue >= 100000){
            System.out.println("Invalid Revenue");
        }
        if (revenue < 0){
            System.out.println("Invalid Revenue");
        }
        if (revenue >= 0 && revenue < 20000){
            System.out.println("Poor Sales Revenue");
        }
        if (revenue >= 20000 && revenue < 50000){
            System.out.println("Average Sales Revenue");
        }
        if (revenue >= 50000 && revenue < 80000){
            System.out.println("Good Sales Revenue");
        }
        if (revenue >= 80000 && revenue < 100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}