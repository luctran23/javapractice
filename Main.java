
package Vehicle;

import java.util.Scanner;


public class Main {
    static void inTieuDe() {
        System.out.printf("%15s%15s%15s%n", "Chu xe", "Loai xe", "Dung tich");
    }

    static void nhapDsVehicles(Vehicle ds[], int n) {
        System.out.println("thit");
        for(int i = 0; i < n; i++ ) {
           ds[i] = new Vehicle();
           ds[i].nhapThongTinXe();
       }
    }
    static void xuatDsVehicles(Vehicle ds[], int n) {
       inTieuDe();
       for(int i = 0; i < n; i++) {
            ds[i].xuatThongTinXe();
       }
    }
    public static void main(String[] args) {
       int n;
        System.out.println("Nhap so luong xe ");
       Scanner s = new Scanner(System.in);
       n = Integer.parseInt(s.nextLine());
       Vehicle v[] = new Vehicle[n];
        nhapDsVehicles(v, n);
        xuatDsVehicles(v, n);

    }
}
