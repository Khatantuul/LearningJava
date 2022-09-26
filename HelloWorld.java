import java.time.chrono.IsoChronology;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat){
            System.out.println("Playing current song");
            System.out.println("Would you like to take the song off of repeat? If so, answer yes");
            String userInput = input.nextLine();

            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
        }

        System.out.println("Playing next song");

        
    }
}