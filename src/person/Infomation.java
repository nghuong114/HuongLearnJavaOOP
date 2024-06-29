package person;

import javax.sound.midi.Soundbank;

public class Infomation {
    public static void main(String[] args) {
        Person person = new Person("Hoàng",32,"M","Hồ Chí Minh","0123456789");
        System.out.println("Name:"+person.getName());
        System.out.println("Age:"+person.getAge());
        System.out.println("Gender:"+person.getGender());
        System.out.println("Address:"+person.getAddress());
        System.out.println("Phone number:"+person.getPhone());

        person.getInfo();
    }
}

