

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
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date().getTime());
        String aa="1234567890123";
        System.out.println(aa.substring(0,2));


        System.out.println("2222");


        System.out.println("ceshi2222");
        String aa="1234567890123";
        System.out.println(aa.substring(0,2));

    }

}
