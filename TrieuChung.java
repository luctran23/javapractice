
package baiKT1;

import java.util.Scanner;


public class TrieuChung{
    String maTc;
    String tenTc;

    public TrieuChung() {
    }
    
    public TrieuChung(String maTc, String tenTc) {
        this.maTc = maTc;
        this.tenTc = tenTc;
    }
    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma Trieu chung: ");
        maTc = s.nextLine();
        System.out.println("Nhap ten trieu chung: ");
        tenTc = s.nextLine();
    }
}
