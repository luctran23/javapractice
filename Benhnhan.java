
package baiKT1;

import java.util.Scanner;

public class Benhnhan{
    public String tenBn;
    String gioiTinh;
    int tuoi;
    String diaChi;
    String tienSuBenh;
    public void nhap() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Nhap ten benh nhan: ");
            tenBn = s.nextLine();
            if(tenBn.trim().isEmpty()) {
                throw new Exception("Ten benh nhan khong duoc de trong ");
            }
        } catch (Exception e) {
            System.out.println(e);            
            System.out.print("Nhap ten benh nhan: ");
            tenBn = s.nextLine();
        }
        System.out.println("Nhap gioi tinh ");
        gioiTinh = s.nextLine();
        System.out.println("Nhap tuoi");
        tuoi = Integer.parseInt(s.nextLine());
        System.out.println("Nhap dia chi: ");
        diaChi = s.nextLine();
        System.out.println("Nhap tien su benh: ");
        tienSuBenh = s.nextLine();
        
    }
    Benhnhan(){
        
    }

    public Benhnhan(String tenBn, String gioiTinh, int tuoi, String diaChi, String tienSuBenh) {
        this.tenBn = tenBn;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienSuBenh = tienSuBenh;
    }
    
}
