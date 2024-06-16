class Address {
    String city;
    String street;

    Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    void displayAddress() {
        System.out.println("City: " + city + ", Street: " + street);
    }
}

class Person {
    String name;
    Address address; // Aggregation relationship

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        address.displayAddress();
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Address address = new Address("New York", "5th Avenue");
        Person person = new Person("John Doe", address);
        person.displayPerson();
    }
}
