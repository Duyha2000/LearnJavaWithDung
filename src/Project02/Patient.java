package Project02;

public class Patient {

    private String firstName, middleName, lastName;
    private String address, city, state, zip;
    private String phone;
    private String emergencyName, emergencyPhone;

    // a no-arg constructor
    public Patient() {
    }

    // a parametrized constructor that initializes patient’s first, middle and last name to the given values
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // a parametrized constructor that initializes all attributes of the patient to the given values
    public Patient(String firstName, String middleName, String lastName, String address, String city, String state, String zip, String phone, String emergencyName, String emergencyPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.emergencyName = emergencyName;
        this.emergencyPhone = emergencyPhone;
    }

    // an accessor for each attribute
    // a mutator for each attribute
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }


    // a method name buildFullName that returns a String which is the concatenation of first, middle and last name separated by space.
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName + " ";
    }

    // a method named buildAddress that returns a String which is the concatenation of address, city, state and zip separated by space.
    public String buildAddress() {
        return address + " " + city + " " + state + " " + zip + " ";
    }

    // a method named buildEmergencyContact that returns a String which is the concatenation of emergency name and emergency phone separated by space.
    public String buildEmergencyContact() {
        return emergencyName + " " + emergencyPhone + " ";
    }

    // a toString method that display all information of a patient; use the above build methods in your toString method to display the information.
    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone='" + phone + '\'' +
                ", emergencyName='" + emergencyName + '\'' +
                ", emergencyPhone='" + emergencyPhone + '\'' +
                '}';
    }

}
