import java.sql.SQLOutput;
import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Root Calculator of Quadratic Equations!");
        System.out.println("ax^2 + bx + c = 0");

        System.out.print("Please enter a = ");
        int a = input.nextInt();

        System.out.print("Please enter b = ");
        int b = input.nextInt();

        System.out.print("Please enter c = ");
        int c = input.nextInt();

        QuadraticEquation calculation = new QuadraticEquation(a,b,c);

        if (calculation.getDiscriminant() > 0){
            System.out.println("Discriminant is " + calculation.getDiscriminant());
            System.out.println("The equation has two roots Root 1 : " + calculation.getRoot1() + " Root 2 : " + calculation.getRoot2());
        }
        else if (calculation.getDiscriminant() == 0){
            System.out.println("Discriminant is " + calculation.getDiscriminant());
            System.out.println("The equation has only one root Root : " + calculation.getRoot1());
        }
        else {
            System.out.println("Discriminant is " + calculation.getDiscriminant());
            System.out.println("The equation has no root!");
        }
    }
}