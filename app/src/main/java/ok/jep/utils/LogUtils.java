package ok.jep.utils;

import android.graphics.Bitmap;
import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class LogUtils
{

    public static void saveBitmapToFileAsImg(Bitmap outputBitmap, String outputFile) {
        FileOutputStream out = null;
        try {
            File dir = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator +
                    "Streetography" + File.separator );
            if (!dir.exists()) {
                dir.mkdirs();
            }

            File f = new File(dir, outputFile);
            if (!f.exists()) {
                f.createNewFile();
            }
            out = new FileOutputStream(f);
            outputBitmap.compress(Bitmap.CompressFormat.PNG, 0, out); // bmp is your Bitmap instance
            // PNG is a lossless format, the compression factor (100) is ignored
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

// eof
