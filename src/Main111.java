

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        System.out.println(format.format(date));
        System.out.println(format.format(date).substring(0,8));
        System.out.println(format.format(date).substring(8,10));
    }

}
