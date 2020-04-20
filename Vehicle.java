
package Vehicle;

import java.util.Scanner;

public class Vehicle {
    String ownerName;
    String brand;
    int capacity; 
    Vehicle() {
        ownerName = "Johnny Dang";
        brand = "mustang";
        capacity = 100;
    }

    public Vehicle(String ownerName, String brand, int capacity) {
        this.ownerName = ownerName;
        this.brand = brand;
        this.capacity = capacity;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }
    
    
    public void nhapThongTinXe() {
         System.out.println("De nghi anh/chi nhap day du thong tin xe...");
         Scanner s = new Scanner(System.in);
         System.out.println("Nhap ten chu xe: ");
         ownerName = s.nextLine();
         System.out.println("Nhap loai xe: ");
         brand = s.nextLine();
         System.out.println("Nhap dung tich xe: ");
         capacity = s.nextInt();
    }
    
    public void xuatThongTinXe() {
        System.out.printf("%15s%15s%10d%n", ownerName, brand, capacity);
    }
}
