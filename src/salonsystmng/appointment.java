package salonsystmng;

public class appointment {

    private String reservationID;
    private String reservationDate;
    private user cust;
    private String service;
    private String paymentMethod;

    public appointment(String reservationID, String reservationDate, user cust, String service, String paymentMethod) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        this.cust = cust;
        this.service = service;
        this.paymentMethod = paymentMethod;
    }

    public void setReservationID(String reservationDate, user cust) {
        this.reservationID = (cust.getID() +"_"+ reservationDate);
    }

    public void setReservationDate(String month, String day) {
        
        this.reservationDate = (month+"-"+day);
    }

    public void setCus(user cust) {
        this.cust = cust;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void availableDate() {
        System.out.println("_______________________________________________\n"
                          +"                   Jan 2023                 \n"+
                           "_______________________________________________");
        System.out.println("SUN    MON    TUES    WEDNS    THUR    FRI    SAT\n"
                         + " 1      2       3      4        5      6       7\n"
                         + " 8      9       10     11       12     13      14\n"
                         + " 15    16       17     18       19     20      21\n"
                         + " 22    23       24     25       26     27       28\n"
                         + " 29    30       31\n");
    }

}
