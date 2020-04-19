/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class HCn {
    float dai, rong;
    public float tinhChuVi(){
        return (dai + rong) * 2;
    }
    public float tinhDienTich() {
        return dai * rong;
    }
    public HCn(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public void inTieuDe() {
        System.out.printf("%15s%15s%15s%15s%n", "chieu dai", "chieu rong", "chu vi", "dien tich");
        System.out.printf("%15.2f%15.2f%15.2f%15.2f%n", dai, rong, tinhChuVi(), tinhDienTich() );
    }
    public static void main(String[] args) {
        HCn h1 = new HCn(3, 2);
        System.out.println(h1.tinhChuVi());
        System.out.println(h1.tinhDienTich());
        h1.inTieuDe();
    }
}
