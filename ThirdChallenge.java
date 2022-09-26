public class ThirdChallenge {
    public static double employeeSalary(double numberOfDaysWorked, 
                                        double hourlyRate, 
                                        int vacationdays){
        
        double weeklyHours = numberOfDaysWorked * 8;
        double unpaidTime = vacationdays * hourlyRate * 8;
        double grossSalary = (weeklyHours * hourlyRate * 52) - unpaidTime;

        System.out.println("You earned " + grossSalary);
        return grossSalary;

    }

    public static void main(String[] args){
        employeeSalary(5, 15,8);
    }
}
