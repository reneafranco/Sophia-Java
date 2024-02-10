package Model;

public class Employee {

    private String firstName;

    private String lastName;

    private String jobTitle;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ageWithCompany=" + ageWithCompany +
                '}';
    }

    private int ageWithCompany;

    public Employee(String firstName,String lastName, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.ageWithCompany = age;
    }

    public Employee(String firstName, String lastName, String jobTitle, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.ageWithCompany = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return ageWithCompany;
    }

    public void setAge(int age) {
        this.ageWithCompany = age;
    }
}
