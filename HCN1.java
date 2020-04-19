
import java.text.DecimalFormat;
import java.util.Random;


public class HCN {
    public static void main(String[] args) {
        Random rand = new Random();
        float dai, rong, chuVi, dienTich;
        DecimalFormat df = new DecimalFormat("#,#.00");
        dai = rand.nextFloat()+1;
        rong = rand.nextFloat()+1;
        System.out.printf("%15s%15s%15s%15s%n", "chieu dai", "chieu rong", "chu vi", "dien tich");
        System.out.printf("%15.2f%15.2f%15.2f%15.2f%n", dai, rong, (dai + rong)*2, dai * rong   );

    }
}
