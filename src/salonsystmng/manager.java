package salonsystmng;


public class manager extends user{

    public manager(String firstName, String lastName, String ID, String password, String email, String phone) {
        super(firstName, lastName, ID, password, email, phone);
    }

    
 public boolean login(String ID, String password) {
        if ((this.getID().equals(ID)) && this.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }

    }


    
}
