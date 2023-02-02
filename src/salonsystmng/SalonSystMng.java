package salonsystmng;
//mzoun khaled
//hadeel

import java.util.Scanner;

public class SalonSystMng {

    void display() {
        System.out.println("------------------------------");
        System.out.println("--  Welcome in MELDA Salon --");
        System.out.println("--  Enter your account    --");
        System.out.println("------------------------------");
    }

    void show() {
        System.out.println("------------------------------");
        System.out.println("--1-To display services -- ");
        System.out.println("--2-To Appointment Booking- ");
        System.out.println("--3-To display your bill - ");
        System.out.println("--4-To display data of your account- ");
        System.out.println("--5-To Enter by another account- ");
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        appointment ap = null;
        Scanner s = new Scanner(System.in);
        SalonSystMng a = new SalonSystMng();
        String email = null;
        String password = null;
        user arr[] = {
            new customer("mzoun", "alqarni", "2006750", "mzoun750", "mkq@gmail.com", "0501571845"),
            new customer("rahaf", "khaled", "1906766", "rhf766", "rhf@gmail.com", "0501456783"),
            new customer("renad", "muhammad", "2776311", "ref066", "re@gmail.com", "0567633129"),
            new customer("marwa", "adel", "00955547", "mr716", "mr@gmail.com", "0505602424"),
            new customer("assma", "omar", "88712354", "rhf766", "rhf@gmail.com", "0531761744"),
            new reception("hanaa", "alfadhli", "22319984", "ha223", "ha@gmail.com", "0555109639", 5000),
            new reception("hajer", "bakhshwen", "00651290", "hj006", "hj@gmail.com", "0504541290", 2000),
            new manager("ali", "omar", "01934547", "aj7d6", "ao@gmail.com", "0505765424", "hiring", 10000),
            new manager("omar", "rahat", "88242344", "omr766", "or@gmail.com", "0531761123", "hiring", 15000),
            new reception("rafan", "saud", "00876123", "ra287", "ra@gmail.com", "0587247665", 3000)
        };
        a.display();
        boolean v = true;
        while (true) {
            while (v == true) {
                int z = 0;
                System.out.println("Enter your Email");
                email = s.next();
                System.out.println("Enter your Password");
                password = s.next();
                for (user arr1 : arr) {
                    if (arr1.getPassword().equals(password) && arr1.getEmail().equals(email)) {
                        System.out.println("--------Welcome " + arr1.getFirstName() + "------");
                        z++;
                        v = false;
                        ap = new appointment(null, arr1);
                    }
                }
                if (z == 0) {
                    System.out.println("connt found your acconut");
                    System.out.println("------------------------------");
                }
            }
            int x;
            a.show();
            x = s.nextInt();
            switch (x) {
                case 1: {
                    ap.serviecesList();
                }
                break;
                case 2:
                    ap.availableDate();
                    break;
                case 3: {
                    for (user arr1 : arr) {
                        if (arr1.getPassword().equals(password) && arr1.getEmail().equals(email)) {
                            ap.displayBill(arr1);
                        }
                    }
                }
                break;
                case 4: {
                    for (user arr1 : arr) {
                        if (arr1.getPassword().equals(password) && arr1.getEmail().equals(email)) {
                            arr1.getinfo();
                        }
                    }
                }
                break;
                case 5:
                    v = true;
            }
        }
    }
}
