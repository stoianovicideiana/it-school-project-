package session_10_oop_concepts.practice.oop_design;

import java.util.ArrayList;
import java.util.List;

public class EmagApplication {

    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();

        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Lenovo");
        laptop1.setPrice(400.43);

        Laptop laptop2 = new Laptop();
        laptop1.setBrand("Dell");
        laptop1.setPrice(799.99);

        Laptop laptop3 = new Laptop();
        laptop1.setBrand("Apple");
        laptop1.setPrice(799.99);

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);

        List<Laptop> resultLaptopList = getFilteredLaptopsByPrice(laptops, 0, 800);
        printLaptops(resultLaptopList);
    }

    public static List<Laptop> getFilteredLaptopsByPrice(List<Laptop> laptopList, double minPrice, double maxPrice) {
        List<Laptop> filteredDevices = new ArrayList<>();

        for (Laptop laptop : laptopList) {
            if (laptop.getPrice() > minPrice && laptop.getPrice() <= maxPrice) {
                filteredDevices.add(laptop);
            }
        }

        return filteredDevices;
    }

    public static void printLaptops(List<Laptop> laptopList) {
        for (Laptop laptop : laptopList) {
            System.out.println("Brand: " + laptop.getBrand());
            System.out.println("Price: " + laptop.getPrice() + "\n");
        }
    }
}
