package Project02;

public class Procedure {
    // Attribute: private
    private String nameProcedure, dateProcedure, namePractitioner;
    private double chargesProc;

    // 	a no-arg constructor
    public Procedure() {
    }

    // a parametrized constructor that initializes procedure’s name and date to the given values
    public Procedure(String nameProcedure, String dateProcedure) {
        this.nameProcedure = nameProcedure;
        this.dateProcedure = dateProcedure;
    }

    // a parametrized constructor that initializes all attributes of the procedure to the given values
    public Procedure(String nameProcedure, String dateProcedure, String namePractitioner, double chargesProc) {
        this.nameProcedure = nameProcedure;
        this.dateProcedure = dateProcedure;
        this.namePractitioner = namePractitioner;
        this.chargesProc = chargesProc;
    }

    // an accessor for each attribute
    //a mutator for each attribute
    public String getNameProcedure() {
        return nameProcedure;
    }

    public void setNameProcedure(String nameProcedure) {
        this.nameProcedure = nameProcedure;
    }

    public String getDateProcedure() {
        return dateProcedure;
    }

    public void setDateProcedure(String dateProcedure) {
        this.dateProcedure = dateProcedure;
    }

    public String getNamePractitioner() {
        return namePractitioner;
    }

    public void setNamePractitioner(String namePractitioner) {
        this.namePractitioner = namePractitioner;
    }

    public double getChargesProc() {
        return chargesProc;
    }

    public void setChargesProc(double chargesProc) {
        this.chargesProc = chargesProc;
    }

    // a toString method that display all information of a procedure

    @Override
    public String toString() {
        return "Procedure: " + nameProcedure + '\n' +
                "ProcedureDate=" + dateProcedure + '\n' +
                "Practitioner=" + namePractitioner + '\n' +
                "Charge=" + chargesProc;
    }
    // new line: \n
}
