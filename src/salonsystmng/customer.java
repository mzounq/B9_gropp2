package salonsystmng;

/**
 *
 * @author Real-mkq
 */
public class customer extends user {

    public customer(String firstName, String lastName, String ID, String password, String email, int phone) {
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
