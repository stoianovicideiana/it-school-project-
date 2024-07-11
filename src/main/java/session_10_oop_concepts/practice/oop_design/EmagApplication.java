package session_10_oop_concepts.practice.oop_design;

import session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop;

import java.util.ArrayList;
import java.util.List;

public class EmagApplication {

    public static void main(String[] args) {
        List<session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop> laptops = new ArrayList<>();

        session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop laptop1 = new session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop();
        laptop1.setBrand("Lenovo");
        laptop1.setPrice(400.43);

        session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop laptop2 = new session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop();
        laptop1.setBrand("Dell");
        laptop1.setPrice(799.99);

        session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop laptop3 = new session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop();
        laptop1.setBrand("Apple");
        laptop1.setPrice(799.99);

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);

        List<session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop> resultLaptopList = getFilteredLaptopsByPrice(laptops, 0, 800);
        printLaptops(resultLaptopList);
    }

    public static List<session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop> getFilteredLaptopsByPrice(List<session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop> laptopList, double minPrice, double maxPrice) {
        List<session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop> filteredDevices = new ArrayList<>();

        for (session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop laptop : laptopList) {
            if (laptop.getPrice() > minPrice && laptop.getPrice() <= maxPrice) {
                filteredDevices.add(laptop);
            }
        }

        return filteredDevices;
    }

    public static void printLaptops(List<session_10_oop_concepts.session_10_oop_concepts.practice.oop_design.Laptop> laptopList) {
        for (Laptop laptop : laptopList) {
            System.out.println("Brand: " + laptop.getBrand());
            System.out.println("Price: " + laptop.getPrice() + "\n");
        }
    }
}
