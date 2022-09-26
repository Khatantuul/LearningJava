public class Main {
    public static void main(String[] args){

        Shirt no1 = new Shirt("blue", 'S');

        System.out.println("You have a shirt that is " + no1.color + " and in size " + no1.size);

        Shirt.putOn();

    }
}
