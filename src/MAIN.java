import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
public class MAIN {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //  new GUI();
        Service service = new Service();
          System.out.println("Welcome");
        System.out.println(" /1/Add new phone to the shop  /2/Add phones for repair  \n /3/Check available phones for sale  /4/Phones for repair \n Choose number:");
        int choice = scan.nextInt();
        ArrayList<Device> telephone = new ArrayList<Device>();
        ArrayList<BrokenDevice> brokenTelephone = new ArrayList<BrokenDevice>();
        if (choice == 1)  {
       service.addWorkingDevice(telephone);

            for (Device tel:telephone) {
                System.out.println("Brand: "+tel.getBrand());
                System.out.println("Model: "+tel.getModel());
                System.out.println("Price: "+tel.getPrice()+"$");
                System.out.println("////////////////////////////");
            }

        }else if(choice == 2){
            System.out.println("ENTER INFO");
            System.out.println("How many devices for repair you want to add?");
            int brokenDeviceAmount = scan.nextInt();
            if(brokenDeviceAmount >=1) {
                for (int i = 0; i < brokenDeviceAmount; i++) {
                    System.out.println("Enter Brand, model, problems, days needed to fix it, price for service :");
                    System.out.println("EXAMPLE: /Iphone 13ProMax, Display not Working 12 120/");
                    brokenTelephone.add(i,new BrokenDevice(scan.next(),scan.next(),scan.next(),Integer.parseInt(scan.next()), Double.parseDouble(scan.next())));
                }
                for (BrokenDevice brokenTel:brokenTelephone) {
                    System.out.println("Brand: "+brokenTel.getBrand());
                    System.out.println("Model: "+brokenTel.getModel());
                    System.out.println("Device problems: "+brokenTel.getProblems().replace('_',' '));
                    System.out.println("Days needed for repair: "+brokenTel.daysNeeded);
                    System.out.println("Price for service: "+brokenTel.getPrice());

                }
            }
        }else if(choice == 3){
            for (Device devic: telephone) {

            }
        }else if(choice == 4){

        }else{ throw new Exception("YOU SHOULD TYPE NUMBER FROM 1 TO 4");

    }
}
}
//    public static Connection getConnection() throws Exception {
//        try {
//            String driver = "com.mysql.jdbc.MAIN";
//            String url = "jdbc:mysql://localhost:3306/Service";
//            String name = "root";
//            String password = "admin";
//            Class.forName(driver);
//
//            Connection conn = DriverManager.getConnection(url, name, password);
//            System.out.println("Connected");
//            return conn;
//        } catch (Exception e) {
//            System.out.println(e);
//            return null;
//        }
//
//    }
//
//    public static void createTable() throws Exception {
//        try {
//            Connection conn = getConnection();
//            PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS tablename(id int NOT NULL AUTO_INCREMENT, first varchar)");
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }

