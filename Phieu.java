package baiKT1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class Phieu {

    String mp;
    Date ngayKham;
    Benhnhan x;
    Bacsy y;
    int n;
    Vector<TrieuChung> z;

    public Phieu() {

    }

    public Phieu(String mp, String ngayKham, Benhnhan x, Bacsy y, Vector z) {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        this.mp = mp;
        this.ngayKham = date;
        this.x = x;
        this.y = y;
    }

    public void nhapPhieu() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Nhap ma phieu: ");
            mp = s.nextLine();
            if (mp.trim().isEmpty()) {
                throw new Exception("Ma phieu khong duoc de trong");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        x = new Benhnhan();
        x.nhap();
        y = new Bacsy();
        y.nhap();
        System.out.println("Nhap so luong trieu chung: ");
        n = Integer.parseInt(s.nextLine());
        z = new Vector();
        for (int i = 0; i < n; i++) {
            TrieuChung e = new TrieuChung();
            e.nhap();
            if (z.contains(e.maTc)) {
                System.out.println("Ban vua nhap trung ma trieu chung ");
                return;
            }
            z.add(e);
        }
    }

    public void xuatPhieu() {
        System.out.println("============PHIEU KHAM BENH===============");
        System.out.printf("%15s%15s%15s%15s%n", "ma phieu", mp, "ngay kham", ngayKham);
        System.out.printf("%15s%15s%15s%15s%15s%n", "ten benh nhan", x.tenBn, "gioitinh", x.gioiTinh, "tuoi ", x.tuoi);
        System.out.printf("%15s%15s%15s%15s%n", "dia chi", x.diaChi, "tien su benh ", x.tienSuBenh);
        System.out.printf("%15s%15s%15s%15s%n", "Bac sy", y.tenBs, "Noi cong tac", y.noiCt);
        System.out.printf("%25s%25s%n", "Ma trieu chung", "Ten trieu chung");
        for (int i = 0; i < z.size(); i++) {
            System.out.printf("%25s%25s%n", z.get(i).maTc, z.get(i).tenTc);
        }
    }

}
