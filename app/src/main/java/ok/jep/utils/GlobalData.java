package ok.jep.utils;

import android.content.Context;

public class GlobalData
{

    public static Storage storage;
    public static Settings settings;

    public static Storage getStorage(Context context)
    {
        if (storage == null) {
            storage = new Storage(context);
        }
        return storage;
    }

    public static Settings getSettings(Context context)
    {
        if (settings == null) {
            settings = new Settings(context);
        }
        return settings;
    }

}

// eof
