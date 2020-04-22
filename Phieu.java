
package baiKT1;

import java.util.Scanner;


public class Phieu{
    String mp;
    String ngayKham;
    Benhnhan x;
    Bacsy y;
    int n;
    TrieuChung[] z;
    public Phieu() {
        
    }

    public Phieu(String mp, String ngayKham, Benhnhan x, Bacsy y, TrieuChung[] z) {
        this.mp = mp;
        this.ngayKham = ngayKham;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void nhapPhieu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma phieu: ");
        mp = s.nextLine();
        System.out.println("Nhap ngay kham: ");
        ngayKham = s.nextLine();
        x = new Benhnhan();
        x.nhap();
        y = new Bacsy();
        y.nhap();
        System.out.println("Nhap so luong trieu chung: ");
        n = Integer.parseInt(s.nextLine());
        z = new TrieuChung[n];
        z[0].nhap();
    }
    public void xuatPhieu() {
        System.out.println("============PHIEU KHAM BENH===============");
        System.out.printf("%15s%15s%15s%15s%n", "ma phieu", mp, "ngay kham", ngayKham);
        System.out.printf("%15s%15s%15s%15s%15s%n", "ten benh nhan", x.tenBn, "gioitinh", x.gioiTinh, "tuoi ", x.tuoi);
        System.out.printf("%15s%15s%15s%15s%n", "dia chi", x.diaChi, "tien su benh ", x.tienSuBenh);
        System.out.printf("%15s%15s%15s%15s%n", "Bac sy", y.tenBs, "Noi cong tac", y.noiCt);
        System.out.printf("%15s%15s", "Ma trieu chung", "Ten trieu chung");
        for(int i = 0; i< n; i++ ) {
            System.out.println(z[i].maTc + "  " + z[i].tenTc);
        }
    }
    
}
