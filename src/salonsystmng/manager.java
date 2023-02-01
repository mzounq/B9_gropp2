package salonsystmng;



public class manager extends user{
   private int salary;
    private String power;
 

    public manager(String firstName, String lastName, String ID, String password, String email, String phone,String power,int salary) {
        super(firstName, lastName, ID, password, email, phone);
        this.power = power;
        this.salary = salary;
    }

 
    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}


    
