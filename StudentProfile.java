public class StudentProfile {
    
    String firstName;
    String lastName;
    int graduationYear;
    double GPA;
    String declaredMajor;

    public StudentProfile(String firstName, String lastName, 
                            int graduationYear, double GPA, String declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = graduationYear;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public void calculateGraduation(){
        this.graduationYear = this.graduationYear++;
    }

}
