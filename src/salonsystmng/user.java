package salonsystmng;

public class user {
private String firstName;  
private String lastName; 
private String ID;
private String password;
private String email;
private String phone;

    public user(String firstName, String lastName, String ID, String password, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.password = password;
        this.email = email;
        this.phone = phone;
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void getinfo() {
        System.out.println("_______________________________________________");
        System.out.println("First NAME:"+getFirstName()+"\n"
                          +"last NAME :"+getLastName()+"\n"
                          +"ID        :"+getID()+"\n"
                          +"PASSWORD  :"+getPassword()+"\n"
                          +"EMAIL     :"+getEmail()+"\n"
                          +"PHONE     :"+getPhone()+"\n");
        System.out.println("_______________________________________________");
    }   
}