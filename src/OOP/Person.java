package OOP;

// Access Modifier: public, private ( che thông tin cá nhân)
public class Person {
    // 1. Attribute / Properties: private
    private String name;
    private int age;
    private String address;
    // Constructor: 1 ham khoi tao cac gia tri default: ko co return:

    //public: method
    public Person() {
    }

    // Làm thế nào để thay đổi tuổi - in ra thông tin tuổi
    // getter: in ra thông tin - setter: thay đổi thông tin

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    // Action: methods (function):
    // getter - setter - toString:

    private void display() {
        System.out.println("Ten" + name + " Tuoi " + age + " Dia chi " + address);
    }
    // toString(): in ra các thông tin (không cần định nghĩa ra methods)

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


    // hien thi thong tin - tinh chu vi/ dien tinh (tinh toan)
}

// Retangle: width - height:

