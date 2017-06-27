package ok.jep.utils;

public class Const
{

    public static final long CLOSE_APP_INTERVAL = 2000L;

    public static final String CALLBACKURL = "app://fivehundred-dev";

    public static final float ZOOM_MY_POSITION = 15.5F;
    public static final float ZOOM_ADDRESS = 15.5F;
    public static final float ZOOM_IMG_PUBLISH = 15.5F;

    public static final long ANIMATION_MAP_INFO = 500;

    public static final long CLIENT_CONNECT_TIMEOUT = 15;
    public static final long CLIENT_WRITE_TIMEOUT = 15;
    public static final long CLIENT_READ_TIMEOUT = 15;

    /** Location intervals **/
    public static final long MAP_LOCATION_INTERVAL = 2L;
    public static final long MAP_LOCATION_INTERVAL_FASTEST = 2L;


    public static final String PARSE_ = "hPUK6GFTCYsVq97h4KOe2hNlWe3MVEZAIzapro6d";

    public static final String X_PARSE_APPLICATION_ID = "hPUK6GFTCYsVq97h4KOe2hNlWe3MVEZAIzapro6d";
    public static final String X_PARSE_REST_API_KEY = "VGSEB6K38Enpk5m2HB1eCrSdJREpV5A2ObK530j9";
    public static final String PARSE_SERVER_URL = "https://api.streetography.com/parse";
    public static final String STREETOGRAPHY_API_SECRET = "666";

    public static final String FIVE_HUNDRED_PX_TOKEN_URL = "https://api.500px.com/v1/oauth/request_token";
    public static final String FIVE_HUNDRED_PX_AUTHORIZE_URL = "https://api.500px.com/v1/oauth/authorize";
    public static final String FIVE_HUNDRED_PX_ACCESS_TOKEN_URL = "https://api.500px.com/v1/oauth/access_token";
    public static final String FIVE_HUNDRED_PX_CONSUMER_KEY = "4mupFVxGkxng17U9hhCxecF36HyyTo4y85LR4Qq5";
    public static final String FIVE_HUNDRED_PX_CONSUMER_SECRET = "EwhOlYsaz0g41mzZL8yFzXLTKCpnISyRw5EMjAvE";
    public static final String FIVE_HUNDRED_PX_REDIRECT_URL = "http://localhost/Callback";
    public static final String FIVE_HUNDRED_PX_URL_USERS = "https://api.500px.com/v1/users";

    public static final String MAILGUN_API_KEY = "pubkey-a75e96e2458f7c09ad14080c819fd2e7";


    public static final String API_BASE_URL_STREETOGRAPHY = "https://api.streetography.com";
    public static final String API_BASE_URL_500PX = "https://api.500px.com";
    public static final String API_BASE_URL_AMAZON = "https://strtgrph.s3-us-west-1.amazonaws.com";

    public static final String URL_STREETOGRAPHY_VERIFY_EMAIL = API_BASE_URL_STREETOGRAPHY + "/parse/apps/" + X_PARSE_APPLICATION_ID + "/verify_email?token=%s&username=%s";
    public static final String URL_STREETOGRAPHY_PASSWORD_RESET = API_BASE_URL_STREETOGRAPHY + "/confirmPasswordReset/%s";
    public static final String URL_STREETOGRAPHY_PARSE_PHOTOS = API_BASE_URL_STREETOGRAPHY + "/parse/classes/Photo%s";
    public static final String URL_STREETOGRAPHY_PARSE_LIKE = API_BASE_URL_STREETOGRAPHY + "/parse/classes/Like%s";
    public static final String URL_STREETOGRAPHY_PHOTOS = API_BASE_URL_STREETOGRAPHY + "/parse/classes/Photo";

    public static final String URL_500PX_PHOTOS_SEARCH = API_BASE_URL_500PX + "/v1/photos/search";
    public static final String URL_500PX_PHOTOS = API_BASE_URL_500PX + "/v1/photos";
    public static final String URL_500PX_COLLECTIONS = API_BASE_URL_500PX + "/v1/collections";

    //public static final String URL_STREETOGRAPHY_BBOXPARSE = API_BASE_URL_STREETOGRAPHY + "/geoapi/bboxparse%s";
    public static final String URL_STREETOGRAPHY_BBOXPARSE = API_BASE_URL_STREETOGRAPHY + "/geoapi/bboxmongo%s";

    public static final String URL_TERMS = "http://www.streetography.com/terms-of-service";
    public static final String URL_PRIVACY = "http://www.streetography.com/privacy-policy";

    public static final long SEARCH_ON_TYPE = 1000L;
    public static final String TAKE_PHOTO_DIR = "TakePhoto";
    public static final String TAKE_PHOTO_NAME = "take_photo.jpg";

    public static final String PROFILE_DIR =     "img";
    public static final String PROFILE_FILE =     "account_preview.jpg";
    public static final String SURVEY_FILE =      "account_preview_photo.jpg";

    public static final String EMAIL_SUPPORT = "support@streetography.com";

    public static final long ANIMATION_DURATION = 250L;
}

// eof
