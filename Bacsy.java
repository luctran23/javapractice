
package baiKT1;

import java.util.Scanner;


public class Bacsy {
    String tenBs;
    String noiCt;
    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten bac sy: ");
        tenBs = s.nextLine();
        System.out.println("Nhap noi cong tac cua bac sy: ");
        noiCt = s.nextLine();
    }
}
