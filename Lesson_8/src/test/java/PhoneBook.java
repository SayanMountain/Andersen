import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    public PhoneBook() {

    }

    public static void contactList() {


        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> phone = new ArrayList<>();

        name.add("Zevs");
        phone.add("8495");

        name.add("Zevs");
        phone.add("+11111");

        name.add("Lubyanka");
        phone.add("+999+");

        name.add("Bastion");
        phone.add("009900");

        name.add("Lubyanka");
        phone.add("+777+");

        ArrayList<String> nameAndPhone = new ArrayList<>();
        nameAndPhone.addAll(name);
        nameAndPhone.addAll(phone);


        if (nameAndPhone.contains("Zevs")){
            System.out.println(nameAndPhone);}
        else {
            System.out.println("Абонент с такой фамилией отсутствует");
        }
    }
}
