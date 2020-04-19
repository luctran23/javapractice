
public class NhanSu
{
    public static void main( String argv[] ){
        HoSo n1 = new HoSo( "Tran Van Lang" );
        HoSo n2 = new HoSo( "Le Thi Binh Minh" );
        HoSo n3 = new HoSo( "Tran Thuy Thuc Trinh" );
        HoSo n4 = new HoSo( "Tran Thuy Anh Quynh" );
        HoSo.tongKet(); 
        n1.xuatHoTen();
        n2.xuatHoTen();
        n3.xuatHoTen();
        n4.xuatHoTen();
   }
}
