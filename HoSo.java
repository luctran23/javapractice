
class HoSo {
    static int soNguoi = 0;
    String hoTen;
    public HoSo( String ht){
        hoTen = ht;
        soNguoi = soNguoi + 1;
    }
    static void tongKet(){
        System.out.println( "Ho khau nay co " + soNguoi +" nguoi" );
    }
    void xuatHoTen(){
        System.out.println( hoTen );
    }
 }

   

