package ok.jep.utils;

import android.location.Location;
import android.support.annotation.Nullable;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Normalizer;

public class StringUtils
{

    /**
     * Returns true if the string is null or 0-length.
     * @param str the string to be examined
     * @return true if str is null or zero length
     */
    public static boolean isEmpty(@Nullable CharSequence str) {
        if (str == null || str.length() == 0)
            return true;
        else
            return false;
    }

    public static boolean areCoordinates(String input) {
        if (!isEmpty(input)) {
            String[] parts = input.split(",");
            if (parts.length == 2 &&
                    !StringUtils.isEmpty(parts[0]) &&
                    !StringUtils.isEmpty(parts[1])) {
                try {
                    float lat = Float.parseFloat(parts[0]);
                    float lon = Float.parseFloat(parts[1]);
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public static Location parseCoordinates(String input) {
        if (!isEmpty(input)) {
            String[] parts = input.split(",");
            if (parts.length == 2 &&
                    !StringUtils.isEmpty(parts[0]) &&
                    !StringUtils.isEmpty(parts[1])) {
                try {
                    double lat = Double.parseDouble(parts[0]);
                    double lon = Double.parseDouble(parts[1]);
                    Location location = new Location("");
                    location.setLatitude(lat);
                    location.setLongitude(lon);
                    return location;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static String md5(final String s) {
        final String MD5 = "MD5";
        try {
            // Create MD5 Hash
            MessageDigest digest = MessageDigest.getInstance(MD5);
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String removeAccents(String input) {
        input = Normalizer.normalize(input, Normalizer.Form.NFD);
        input = input.replaceAll("[^\\p{ASCII}]", "");
        return input;
    }

    public static boolean isValidEmail(CharSequence input) {
        return isValidEmail(input.toString());
    }

    public static boolean isValidEmail(String input) {
    String regexString = "[A-Z0-9a-z\\._%+-]+@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}";
    return input.matches(regexString);
}
    public static String AMPERSAND() {
        return "&";
    }

    public static String EQUAL() {
        return "=";
    }

    public static String JPG_FILE_EXTENSION() {
        return ".jpg";
    }

}

// eof
