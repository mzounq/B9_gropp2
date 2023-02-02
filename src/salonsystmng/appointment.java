package salonsystmng;

import java.util.Scanner;

public class appointment {

    Scanner s = new Scanner(System.in);
    private int service[] = new int[7];
    private String reservationDate;
    private user cust;

    public appointment(String reservationDate, user cust) {
        this.reservationDate = reservationDate;
        this.cust = cust;
    }

    
    
    

    public boolean checkService(int i) {
        boolean found = false;
        for (int j = 0; j < service.length; j++) {
            if (service[j] == i) {
                found = true;
            }
        }
        return found;
    }

    public void getService() {
        for (int j = 0; j < service.length; j++) {
            if (service[j] != 0) {
                System.out.println(service[j]);
            }
        }
    }

    public void availableDate() {
        System.out.println("_______________________________________________\n"
                + "                   Jan 2023                 \n"
                + "_______________________________________________");
        System.out.println("SUN    MON    TUES    WEDNS    THUR    FRI    SAT\n"
                + " 1      2       3      4        5      6       7\n"
                + " 8      9       10     11       12     13      14\n"
                + " 15    16       17     18       19     20      21\n"
                + " 22    23       24     25       26     27       28\n"
                + " 29    30       31\n");

        System.out.println("Enter the date you want to Booking");
        System.out.println("choose number 0 if you want to Exit");
        String x = s.next();
        if (!"0".equals(x)) {
            reservationDate = x;
            System.out.println("your Booking dOne");
            System.out.println("_______________________________________");
        }
    }

    public void serviecesList() {
        int a = 20;
        System.out.println("_________________\n"
                + "                   SERVICE LIST                 \n"
                + "_________________");
        System.out.println("                 NAILS                 |Price\n\n"
                + "1 | classic mani&ped                   |200 RS\n"
                + "2 | nail color                         | 30 RS\n"
                + "3 | french nail color                  | 40 RS\n"
                + "_________________\n"
                + "                 HAIR CUT              |Price\n\n"
                + "4 | trimming                           |100 RS\n"
                + "5 | styling                            |250 RS\n"
                + "_________________\n"
                + "                 HAIR STYLING          |Price\n\n"
                + "6 | short or medium length             |200 RS\n"
                + "7 | long length                        |300 RS\n");
        System.out.println("________________________________________");
        System.out.println("choose the service you want by its number");
        System.out.println("choose number 0 if you want to Exit");
        for (int i = 0; i <= a; i++) {
            int x = s.nextInt();
            switch (x) {
                case 1: {
                    if (checkService(x) == false) {
                        service[i] = x;
                    } else {
                        System.out.println("you choosed this service befor");
                    }
                }
                break;
                case 2: {
                    if (checkService(x) == false) {
                        service[i] = x;
                    } else {
                        System.out.println("you choosed this service befor");
                    }
                }
                break;
                case 3: {
                    if (checkService(x) == false) {
                        service[i] = x;
                    } else {
                        System.out.println("you choosed this service befor");
                    }
                }
                break;
                case 4: {
                    if (checkService(x) == false) {
                        service[i] = x;
                    } else {
                        System.out.println("you choosed this service befor");
                    }
                }
                break;
                case 5: {
                    if (checkService(x) == false) {
                        service[i] = x;
                    } else {
                        System.out.println("you choosed this service befor");
                    }
                }
                break;
                case 6: {
                    if (checkService(x) == false) {
                        service[i] = x;
                    } else {
                        System.out.println("you choosed this service befor");
                    }
                }
                break;
                case 7: {
                    if (checkService(x) == false) {
                        service[i] = x;
                    } else {
                        System.out.println("you choosed this service befor");
                    }
                }
                break;
                case 0:
                    a = -1;
            }
        }
    }

    public void displayBill(user cust) {
        System.out.println("<><><><><><><><><><><><><><><><><><><>");
        System.out.println("NAME: " + cust.getFirstName() + "           Date: 2023/1/" + reservationDate);
        int x;
        int sum = 0;
        for (int i = 0; i < service.length; i++) {
            x = service[i];
            switch (x) {
                case 1: {
                    System.out.println("| classic mani&ped                   200 RS|");
                    sum += 200;
                }
                break;
                case 2: {
                    System.out.println("| nail color                          30 RS|");
                    sum += 30;
                }
                break;
                case 3: {
                    System.out.println("| french nail color                   40 RS|");
                    sum += 40;
                }
                break;
                case 4: {
                    System.out.println("| trimming                           100 RS|");
                    sum += 100;
                }
                break;
                case 5: {
                    System.out.println("| styling                            250 RS|");
                    sum += 250;
                }
                break;
                case 6: {
                    System.out.println("| short or medium length             200 RS|");
                    sum += 200;
                }
                break;
                case 7: {
                    System.out.println("| long length                        300 RS|");
                    sum += 300;

                }
                break;
            }
        }
        System.out.println("___the total : " + sum + "__________________________________");
        System.out.println("<><><><><><><><><><><><><><><><><><><><>");
    }

}
