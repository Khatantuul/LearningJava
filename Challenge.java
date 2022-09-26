import java.util.Scanner;

public class Challenge {
    public static void main(String[] args){
        String question = "When was Java released?";
        int choice_one = 1990;
        int choice_two = 1987;
        int choice_three = 1995;

        Scanner scan = new Scanner(System.in);

        System.out.println(question);
        System.out.println(choice_one);
        System.out.println(choice_two);
        System.out.println(choice_three);

        System.out.println("Please tyoe the correct answer?");

        int answer = scan.nextInt();

        // if(answer != choice_three){
        //     System.out.println("Please try again");
        //     answer = scan.nextInt();
        // } else {
        //     System.out.println("Congrats");
        // }

        while(answer != choice_three){
            System.out.println("Please try again");
            answer = scan.nextInt();
        }
        System.out.println("Congrats");
}
}
