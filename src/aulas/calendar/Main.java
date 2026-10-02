package aulas.calendar;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        
        System.out.println(data);
        System.out.println(data.get(Calendar.DATE));
        System.out.println(data.get(Calendar.HOUR));        System.out.println(data.get(Calendar.HOUR));
        System.out.println(data.get(Calendar.MONTH));
        System.out.println(data.get(Calendar.YEAR));
        System.out.println(data.get(Calendar.DAY_OF_MONTH));
        System.out.println(data.get(Calendar.WEEK_OF_YEAR));
        
        System.out.printf("%tc \n", data);
        System.out.printf("%tF \n", data);
    }
}
