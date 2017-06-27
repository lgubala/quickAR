package ok.jep.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;

public class Settings
{

    // General
    public static final String PREFS = "PREFS";
    public static final String PREF_RECENCY = "map-state-recency";
    public static final String PREF_SOURCE = "map-state-source";
    public static final String PREF_SOURCE_USER = "map-state-source_username";
    public static final String PREF_TRANSPARENCY = "PREF_TRANSPARENCY";
    public static final String PREF_MY_LOC_LAT = "PREF_MY_LOC_LAT";
    public static final String PREF_MY_LOC_LNG = "PREF_MY_LOC_LNG";

    public static final String FIVEHUNDRED_CONSUMER_TOKEN = "FIVEHUNDRED_CONSUMER_TOKEN";
    public static final String FIVEHUNDRED_CONSUMER_SECRET = "FIVEHUNDRED_CONSUMER_SECRET";
    public static final String FIVEHUNDRED_USERNAME = "FIVEHUNDRED_USERNAME";
    public static final String FIVEHUNDRED_USERID = "FIVEHUNDRED_USERID";

    private Context context;
    public static SharedPreferences prefs;

    public static SharedPreferences getPrefs(Context context)
    {
        if (prefs == null) {
            prefs = context.getSharedPreferences("Streetography", Context.MODE_PRIVATE);
        }
        return prefs;
    }

    public Settings(Context context)
    {
        this.context = context;
        this.prefs = getPrefs(context);
    }

    public void setMyLocation(Location location) {
        prefs.edit()
                .putFloat(PREF_MY_LOC_LAT, (float) location.getLatitude())
                .putFloat(PREF_MY_LOC_LNG, (float) location.getLongitude())
                .apply();
    }

}

// eof