
package salonsystmng;

public class reception extends user{
private int salary;

    public reception(String firstName, String lastName, String ID, String password, String email, String phone,int salary) {
        super(firstName, lastName, ID, password, email, phone);
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    } 
}
    