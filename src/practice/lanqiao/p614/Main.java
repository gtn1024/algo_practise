package practice.lanqiao.p614;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 5, 4);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR) - 31); // 1月1日是32
    }

}
