package Project02;

import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        // 1 vai sample:
        // creates an instance of the Patient class, initialized with sample data.
        Scanner inputUser = new Scanner(System.in);
        // Hiển thị thông tin bệnh nhân:
        Patient patient = new Patient(inputUser.nextLine(), inputUser.nextLine(), inputUser.nextLine(), inputUser.nextLine(), inputUser.nextLine(), inputUser.nextLine(), inputUser.nextLine(), inputUser.nextLine(), inputUser.nextLine(), inputUser.nextLine());
        // Name:
        System.out.println("Patient Info: ");


        System.out.println(" ");
        // Khởi tạo 3 object từ class Procedure (kh tham số, full tham số, 3 tham số)
        // Khởi tạo thông tin mặc định: name, date, namePractitioner và ( chargesProc bị thiếu thông tin )
        Procedure p1 = new Procedure(inputUser.nextLine(), inputUser.nextLine()); // 2 thông tin  -> thiếu String namePractitioner," double chargesProc"
        p1.setNamePractitioner(inputUser.nextLine());
        p1.setChargesProc(Double.parseDouble(inputUser.nextLine()));
        Procedure p2 = new Procedure();
        p2.setNameProcedure(inputUser.nextLine());
        p2.setDateProcedure(inputUser.nextLine());
        p2.setNamePractitioner(inputUser.nextLine());
        p2.setChargesProc(Double.parseDouble(inputUser.nextLine()));

        Procedure p3 = new Procedure(inputUser.nextLine(), inputUser.nextLine(), inputUser.nextLine(), Double.parseDouble(inputUser.nextLine())); // điền đc hết thông tin rồi
        displayPatient(patient);
        displayProcedure(p1);
        displayProcedure(p2);
        displayProcedure(p3);

        // Total Charge
        // Gọi giá tiền của p1:

        double totalCharge = calculateTotalCharges(p1, p2, p3);
        // 123.4567
        System.out.printf("Total Charge: $%.2f%n", totalCharge); //format print:
        // Procedure displayProcedure = new Procedure(inputUser.nextLine());

    }

    // displayPatient: This method given a patient object will display patient’s information:
    public static void displayPatient(Patient patient) {
        System.out.println("Name: " + patient.buildFullName());
        System.out.println("Address: " + patient.buildAddress());
        System.out.println("Emergency Contact: " + patient.buildEmergencyContact());
    }

    //•	displayProcedure: This method "given" "a procedure object" will display procedure’s information.
    public static void displayProcedure(Procedure p) {
        System.out.println(p);
    }

    //•	calculateTotalCharges: this method takes "three procedures as parameter" and returns the total charges of these procedures.
    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getChargesProc() + p2.getChargesProc() + p3.getChargesProc();
    }


}
