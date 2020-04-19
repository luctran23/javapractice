
package SinhVien;

import java.util.Scanner;

public class SinhVien {
    private int masv;
    private String hoten;
    private float diemLT;
    private float diemTH;

    SinhVien() {
        masv = 0;
        hoten = "";
        diemLT = diemTH = 0;
    }

    public SinhVien(int masv, String hoten, float diemLT, float diemTH) {
        this.masv = masv;
        this.hoten = hoten;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    
    public int getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }
    
    static void inTieuDe() {
        System.out.printf("%10s%20s%10s%10s%10s%n", "masv", "ho ten", "diem lt", "diem th", "diem tb");
    }
    public void inDuLieu() {
        System.out.printf("%10d%20s%10.1f%10.1f%10.1f%n", masv, hoten, diemLT, diemTH, (diemLT + diemTH)/2);
    }
    void nhap() {
        Scanner s = new Scanner(System.in);

        System.out.printf("Nhap ma sinh vien: " );
        masv = s.nextInt();
        s.nextLine();// must add this line to input hoten       
        System.out.printf("Nhap hoten: ");
        hoten = s.nextLine();
        System.out.printf("Nhap diemLT  ");
        diemLT = s.nextFloat();
        System.out.printf("Nhap diemTH ");
        diemTH = s.nextFloat();
    }
    public static void main(String[] args) {
        SinhVien s1 = new SinhVien();
        s1.nhap();
        SinhVien s2 = new SinhVien(1, "Tran van a", 8, 7);
        inTieuDe();
        s1.inDuLieu();
        s2.inDuLieu();
    }
    
}
