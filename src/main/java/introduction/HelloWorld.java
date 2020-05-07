package introduction;

import contact.Contact;
import details.Details;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Details obj = new Details();
        Contact obj1 = new Contact();
        obj.print();
        obj1.print();
    }
}
