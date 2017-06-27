package ok.jep.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Database storage backed by SQLite.
 */
public class Storage extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME = "streetography";
    private static final int DATABASE_VERSION = 1;

    private Context context;

    public Storage(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        //Log.d("### Database creation, version %d", DATABASE_VERSION);
    }

    private void upgrade_1_2(SQLiteDatabase db)
    {
        //Log.d("Upgrading database version, from 1 to 2");
        //getAttachmentDAO().createTable(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        //Log.d("Database upgrade %d -> %d", oldVersion, newVersion);
        if (oldVersion == 1 && newVersion == 2) {
            upgrade_1_2(db);
        }

    }
}
