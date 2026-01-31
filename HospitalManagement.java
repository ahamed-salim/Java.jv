import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Patient {
    int id;
    String patientName;
    String patientAddress;
    String disease;
    String bloodGroup;
    String gender;
    String date;
    Patient next;
}

class Doctor {
    int id;
    String name;
    String shiftTime;
    String specialize;
    String date;
    Doctor next;
}

public class HospitalManagement {

    static Patient patientHead = null;
    static Doctor doctorHead = null;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        long id, pass;

        System.out.println("\n\n=== Hospital Management System ===\n");

        System.out.print("Enter Your ID: ");
        id = sc.nextLong();

        System.out.print("Enter Password: ");
        pass = sc.nextLong();

        if (id == 12345 && pass == 123) {
            mainMenu();
        } else {
            System.out.println("\nIncorrect ID or Password...");
        }
    }

    // ---------------------- Main Menu -----------------------
    public static void mainMenu() {
        while (true) {
            System.out.println("\n===============================");
            System.out.println("      Hospital Management");
            System.out.println("===============================");
            System.out.println("1. Admit Patient");
            System.out.println("2. Patient List");
            System.out.println("3. Discharge Patient");
            System.out.println("4. Add Doctor");
            System.out.println("5. Doctors List");
            System.out.println("6. Delete Doctor Record");
            System.out.println("0. Exit");
            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: admitPatient(); break;
                case 2: patientList(); break;
                case 3: dischargePatient(); break;
                case 4: addDoctor(); break;
                case 5: doctorList(); break;
                case 6: deleteDoctor(); break;
                case 0:
                    System.out.println("\nThank you for using the system!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    // ---------------------- Add Patient -----------------------
    public static void admitPatient() {
        sc.nextLine(); // clear buffer

        Patient newPatient = new Patient();

        LocalDate date = LocalDate.now();
        newPatient.date = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Enter Patient ID: ");
        newPatient.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        newPatient.patientName = sc.nextLine();

        System.out.print("Enter Gender (M/F): ");
        newPatient.gender = sc.nextLine();

        System.out.print("Enter Blood Group: ");
        newPatient.bloodGroup = sc.nextLine();

        System.out.print("Enter Address: ");
        newPatient.patientAddress = sc.nextLine();

        System.out.print("Enter Disease: ");
        newPatient.disease = sc.nextLine();

        newPatient.next = patientHead;
        patientHead = newPatient;

        System.out.println("\nPatient Added Successfully!\n");
    }

    // ---------------------- Patient List -----------------------
    public static void patientList() {
        System.out.println("\n=== Patient List ===\n");
        System.out.printf("%-10s %-15s %-15s %-15s %-10s %-12s %-10s\n",
                "ID", "Name", "Address", "Disease", "Gender", "Blood Group", "Date");

        Patient temp = patientHead;

        while (temp != null) {
            System.out.printf("%-10d %-15s %-15s %-15s %-10s %-12s %-10s\n",
                    temp.id,
                    temp.patientName,
                    temp.patientAddress,
                    temp.disease,
                    temp.gender,
                    temp.bloodGroup,
                    temp.date);
            temp = temp.next;
        }
    }

    // ---------------------- Discharge Patient -----------------------
    public static void dischargePatient() {
        System.out.print("Enter Patient ID to Discharge: ");
        int id = sc.nextInt();

        Patient current = patientHead;
        Patient prev = null;

        while (current != null) {
            if (current.id == id) {
                if (prev == null)
                    patientHead = current.next;
                else
                    prev.next = current.next;

                System.out.println("\nPatient Discharged Successfully!\n");
                return;
            }
            prev = current;
            current = current.next;
        }

        System.out.println("\nPatient Record Not Found!\n");
    }

    // ---------------------- Add Doctor -----------------------
    public static void addDoctor() {
        sc.nextLine();

        Doctor newDoctor = new Doctor();

        LocalDate date = LocalDate.now();
        newDoctor.date = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Enter Doctor ID: ");
        newDoctor.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        newDoctor.name = sc.nextLine();

        System.out.print("Enter Shift Time: ");
        newDoctor.shiftTime = sc.nextLine();

        System.out.print("Enter Specialization: ");
        newDoctor.specialize = sc.nextLine();

        newDoctor.next = doctorHead;
        doctorHead = newDoctor;

        System.out.println("\nDoctor Added Successfully!\n");
    }

    // ---------------------- Doctor List -----------------------
    public static void doctorList() {
        System.out.println("\n=== Doctors List ===\n");
        System.out.printf("%-10s %-20s %-20s %-15s %-10s\n",
                "ID", "Name", "Shift Time", "Specialize", "Date");

        Doctor temp = doctorHead;

        while (temp != null) {
            System.out.printf("%-10d %-20s %-20s %-15s %-10s\n",
                    temp.id,
                    temp.name,
                    temp.shiftTime,
                    temp.specialize,
                    temp.date);
            temp = temp.next;
        }
    }

    // ---------------------- Delete Doctor -----------------------
    public static void deleteDoctor() {
        System.out.print("Enter Doctor ID to Delete: ");
        int id = sc.nextInt();

        Doctor current = doctorHead;
        Doctor prev = null;

        while (current != null) {
            if (current.id == id) {
                if (prev == null)
                    doctorHead = current.next;
                else
                    prev.next = current.next;

                System.out.println("\nDoctor Deleted Successfully!\n");
                return;
            }

            prev = current;
            current = current.next;
        }

        System.out.println("\nDoctor Record Not Found!\n");
    }
}
