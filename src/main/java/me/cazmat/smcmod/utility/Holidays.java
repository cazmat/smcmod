package me.cazmat.smcmod.utility;

import java.util.Calendar;
import java.util.Date;

public class Holidays {
    public static boolean isAprilFools() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return (calendar.get(Calendar.MONTH) + 1 == 4) && (calendar.get(Calendar.DATE) == 1);
    }
    public static boolean isHalloween() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return (calendar.get(Calendar.MONTH) + 1 == 10) && (calendar.get(Calendar.DATE) >= 29);
    }
}
