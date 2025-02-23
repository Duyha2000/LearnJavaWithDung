package B3;

public class Main {
    public static void main(String[] args) {
        // https://docs.google.com/document/d/1h7Cvt9ILkPJwZCCObQE8QFSqnejyJ2b3WzRZ8Ewoh_c/edit?tab=t.0
        // Stringbuilder - stringbuffer
        // Tạo ra 1 object tên Dũng từ class Person:

        // name, age, addressPerson (addressPeople), stt, id

        
        Person Dung = new Person("Dung", 20, "HCM");
        Person Duy = new Person("Duy", 20, "HN");
        Person Hung = new Person("Hung", 20, "SG");

        System.out.println(Dung);
        System.out.println(Duy);
        System.out.println(Hung);

    }

}
// java swing
// string format

// age , name, address:

// ageD
// nameD
// addressD

// Class: Person (age,name,address)
// Object: Duy(25,"Duy","HCM") and Dũng("","","")

// Class: Animal(age, name -> attributes)
// -

// display()
// getter() -> lấy ra thông tin object
// setter() -> thay đổi thông tin
// Object: Cat(4,"Kitty"), Dog(3,"Corgi"), Dog(3,"Corgi")