import java.util.Scanner;

public class Second{
    public static void main(String[] args){

        System.out.println("Pick a number between 1 and 10");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if(choice < 5){
            System.out.println("Enjoy the good luck your friend brings!");
        } else{
            System.out.println("Your shoe selection will make you happy today!");
        }
    }
}