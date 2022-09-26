import java.util.Scanner;

public class SecondChallenge {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input base value");
        int base = scan.nextInt();

        while(base <= 0){
            System.out.println("Please input valid number larger than 0");
            base = scan.nextInt();
        }

        System.out.println("Please input height value");
        int height = scan.nextInt();

        while(height <= 0){
            System.out.println("Please input valid number larger than 0");
            height = scan.nextInt();
        }

        int area = (base * height)/2; 
        System.out.println("the area is: " + area);
        System.out.println("Just test");

    }
}
