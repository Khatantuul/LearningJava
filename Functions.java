public class Functions {
    public static double calculateTotalMealPrice(double listedMealPrice, double tiprate, double taxrate){
        double tips = tiprate * listedMealPrice;
        double tax = taxrate * listedMealPrice;
        
        double totalMealPrice = listedMealPrice + tips + tax;
        System.out.println("Your group total would be: " + totalMealPrice);
        return totalMealPrice;
    }

    public static void main(String[] args){
        double groupTotal = calculateTotalMealPrice(50, .2, .08);

        double individualCost = groupTotal/2;

        System.out.println("You have to pay " + individualCost);

    }
}
