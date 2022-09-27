import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    Scanner scan = new Scanner(System.in);
    ArrayList<Device> workingPhones = new ArrayList<>();
    ArrayList<BrokenDevice> brokenDevices = new ArrayList<>();


    public Service() {
    }

    public Service(ArrayList<Device> workingPhones, ArrayList<BrokenDevice> brokenDevices) {
        this.workingPhones = workingPhones;
        this.brokenDevices = brokenDevices;
    }

    public ArrayList<Device> getWorkingPhones() {
        return workingPhones;
    }

    public void setWorkingPhones(ArrayList<Device> workingPhones) {
        this.workingPhones = workingPhones;
    }

    public ArrayList<BrokenDevice> getBrokenDevices() {
        return brokenDevices;
    }

    public void setBrokenDevices(ArrayList<BrokenDevice> brokenDevices) {
        this.brokenDevices = brokenDevices;
    }


    public static void addWorkingDevice(ArrayList<Device> workingPhones){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many devices you want to add");
        int choiceAdd = scan.nextInt();
        for (int i = 0; i < choiceAdd; i++) {
            System.out.println("Enter Brand,Model and Price example:/Samsung S20 1250/:");
            workingPhones.add(i, new Device(scan.next(), scan.next(), scan.nextDouble()));

        }
    }
}
