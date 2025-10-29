package inter.commons.utils;

import inter.commons.models.Config;

public class UrlUtils {
    public static String buildUrl(Config config, String url) {
        return config.getEnvironment().getUrlBase() + url;
    }
}
