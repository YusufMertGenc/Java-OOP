
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account accounts [] = new Account [10];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i,50);
        }

        Menu (accounts,input);


    }


    public static void Menu(Account accounts[], Scanner input){

        System.out.println("Welcome to GNC BANK ");


        System.out.print("Enter an account id: ");
        int id = input.nextInt();



        if (id < 0 || id > accounts.length) {
            System.out.println("Wrong Account ID!");
        }


        else{
            System.out.println("Login Succesful " + accounts[id].getDateCreated());
            System.out.println("Main Menu : ");

            int choice;
            do{
                System.out.print("1: check balance\n" +
                        "2: withdraw\n" +
                        "3: deposit\n" +
                        "4: exit\n" +
                        "Enter a choice:");
                choice = input.nextInt();

                if (choice == 1){
                    System.out.println("The balance is " + accounts[id].getAccountBalance());
                }
                else if (choice == 2){
                    System.out.print("Enter an amount to withdraw: ");
                    double withdraw = input.nextDouble();

                    accounts[id].withdraw(withdraw);

                }
                else if (choice == 3){
                    System.out.print("Enter an amount to deposit: " );
                    double deposit = input.nextDouble();

                    accounts[id].deposit(deposit);
                }
                else if (choice == 4){
                    System.out.println("Have a nice day\n" +
                            "GNC BANK ");
                }
                else
                    System.out.println("Wrong entry please try again!");


            }while (choice != 4);
        }

    }




}
