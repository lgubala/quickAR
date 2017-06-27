package ok.jep.utils;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class ScreenUtils
{

    public static int[] getScreenCoords(Context context)
    {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        int[] coords = new int[2];
        if (BuildUtils.equalOrHigher(Build.VERSION_CODES.HONEYCOMB_MR2)) {
            coords[0] = display.getWidth();
            coords[1] = display.getHeight();
        } else {
            DisplayMetrics metrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(metrics);

            coords[0] = metrics.widthPixels;
            coords[1] = metrics.heightPixels;
        }

        return coords;
    }

    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}

// eof
