package ok.jep.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TimeUtils
{

    public static final SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm", Locale.getDefault());
    public static final SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
    public static final SimpleDateFormat formatDateAndTime = new SimpleDateFormat("dd.MM.yyyy | HH:mm", Locale.getDefault());
    public static final SimpleDateFormat formatDateAndTime2 = new SimpleDateFormat("dd.MM.yyyy, HH:mm", Locale.getDefault());

    public static final long ONE_MINUTE = 60L;
    public static final long ONE_MINUTE_MILLIS = 60L * 1000L;
    public static final long ONE_HOUR = ONE_MINUTE * ONE_MINUTE;
    public static final long ONE_HOUR_MILLIS = ONE_MINUTE_MILLIS * ONE_MINUTE_MILLIS;
    public static final long ONE_DAY = 24L * ONE_HOUR;
    public static final long ONE_DAY_MILLIS = 24L * ONE_HOUR_MILLIS;

    private static Calendar calendarNow = Calendar.getInstance(TimeZone.getDefault());
    private static Calendar calendarTime = Calendar.getInstance(TimeZone.getDefault());

    public static long now()
    {
        calendarNow = Calendar.getInstance(TimeZone.getDefault());
        calendarNow.set(Calendar.SECOND, 0);
        calendarNow.set(Calendar.MILLISECOND, 0);
        return (calendarNow.getTimeInMillis() / 1000L);
    }

    public static long nowAndZeroSeconds()
    {
        calendarNow = Calendar.getInstance();
        calendarNow.set(Calendar.SECOND, 0);
        calendarNow.set(Calendar.MILLISECOND, 0);
        return (calendarNow.getTimeInMillis() / 1000L);
    }

    public static long tomorrow()
    {
        return (System.currentTimeMillis() / 1000L) + ONE_DAY;
    }

    public static Date nowDate()
    {
        return new Date();
    }

    public static long nowMillis()
    {
        return System.currentTimeMillis();
    }

    public static String convertUnixDateToText(long unixTime) {
        Date date = new Date(unixTime * 1000L);
        return formatDateAndTime2.format(date);
    }

    public static String convertUnixTimeToText(long unixTime) {
        Date date = new Date(unixTime * 1000L);
        //System.out.println("### convertUnixTimeToText " + unixTime + " " + Locale.getDefault().toString() + " = " + date.toString());
        return formatTime.format(date);
    }

    public static String millisToDateString(long unixTime) {
        Date date = new Date(unixTime * 1000L);
        return formatDate.format(date);
    }

    public static int calculateDayShiftFromUnixTime(long unixTime) {
        calendarNow.setTimeInMillis(System.currentTimeMillis());
        calendarNow.set(Calendar.HOUR_OF_DAY, 0);
        calendarNow.set(Calendar.MINUTE, 0);
        calendarNow.set(Calendar.SECOND, 0);
        calendarNow.set(Calendar.MILLISECOND, 0);

        calendarTime.setTimeInMillis(unixTime * 1000L);
        calendarTime.set(Calendar.HOUR_OF_DAY, 0);
        calendarTime.set(Calendar.MINUTE, 0);
        calendarTime.set(Calendar.SECOND, 0);
        calendarTime.set(Calendar.MILLISECOND, 0);

        return (int) TimeUnit.MILLISECONDS.toDays(calendarTime.getTimeInMillis() - calendarNow.getTimeInMillis());
    }

    public static boolean isTimeInFuture(long millis) {
        calendarTime.setTime(new Date());
        calendarTime.set(Calendar.SECOND, 0);
        calendarTime.set(Calendar.MILLISECOND, 0);
        return millis >= (calendarTime.getTimeInMillis() / 1000L);
    }

    public static boolean compareTimes(Date inputDate, Date dateLoop) {
        if (calendarNow == null) {
            calendarNow = Calendar.getInstance(TimeZone.getDefault());
        }
        if (calendarTime == null) {
            calendarTime = Calendar.getInstance(TimeZone.getDefault());
        }

        calendarNow.setTime(inputDate);
        calendarTime.setTime(dateLoop);

        if (calendarNow.get(Calendar.YEAR) == calendarTime.get(Calendar.YEAR) &&
                calendarNow.get(Calendar.MONTH) == calendarTime.get(Calendar.MONTH) &&
                calendarNow.get(Calendar.DAY_OF_MONTH) == calendarTime.get(Calendar.DAY_OF_MONTH)) {
            return true;
        } else  {
            return false;
        }
    }

}

// eof
