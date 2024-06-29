package Company;

import person.Person;

public class Company {
    public static void main(String[] args) {


    Person person = new Person("Thuý",22,"F","Hà Nội", "0987654321");

        System.out.println("Name:"+person.getName());
        System.out.println("Age:"+person.getAge());
        System.out.println("Gender:"+person.getGender());

        person.getInfo();
    }
}
