package android.coolweather.com.coolweather.util;



import com.orhanobut.logger.Logger;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        try {
            client.newCall(request).enqueue(callback);
            Logger.d(request);
        }catch(Exception e){
            Logger.d("异常");

        }

    }
}
