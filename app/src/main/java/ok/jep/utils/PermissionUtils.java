package ok.jep.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

import java.util.ArrayList;

import ok.jep.SampleActivity;

public class PermissionUtils {

    public static boolean hasGrantedPermissions(Activity activity, boolean request) {
        if (BuildUtils.equalOrHigher(23)) {
            ArrayList<String> permissions = obtainDeniedPermissions(activity);

            if (permissions != null && !permissions.isEmpty()) {
                if (request) {
                    String[] arrayPermission = permissions.toArray(new String[permissions.size()]);
                    ActivityCompat.requestPermissions(activity, arrayPermission, SampleActivity.REQUEST_CODE_ASK_PERMISSIONS);
                }
                return false;
            }
        }
        return true;
    }

    private static ArrayList<String> obtainDeniedPermissions(Context context) {
        if (BuildUtils.equalOrHigher(23)) {
            ArrayList<String> permissions = new ArrayList<>();

            /*if (context.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                permissions.add(Manifest.permission.ACCESS_FINE_LOCATION);
            }
            if (context.checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                permissions.add(Manifest.permission.ACCESS_COARSE_LOCATION);
            }*/
            if (context.checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                permissions.add(Manifest.permission.CAMERA);
            }

            if (context.checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                permissions.add(Manifest.permission.READ_EXTERNAL_STORAGE);
            }

            return permissions;
        }
        return null;
    }

}

// eof

