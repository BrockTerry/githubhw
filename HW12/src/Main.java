import java.util.Scanner;

public class Main {
    public static void main(String[] args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int firstnum = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondnum = input.nextInt();
        int sum = firstnum + secondnum;
        System.out.println("The sum equals: " + sum);



    }
}