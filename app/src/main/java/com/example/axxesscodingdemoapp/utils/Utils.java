package com.example.axxesscodingdemoapp.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.ImageView;

import com.example.axxesscodingdemoapp.R;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by Aikya on 16-Jan-18.
 */

public class Utils {


    public static final String MM_DD_YYY_HH_MM = "MM/dd/yyyy HH:mm";

    public static Object parseResponse(String result, Class class_object) {
        Gson gson = new Gson();
        Object object = gson.fromJson(result, class_object);
        return object;
    }


    public static void ImageLoaderWith(Context context, String url, ImageView imgView) {
        try {
            int user = R.drawable.wait_icon;
            Picasso.with(context)
                    .load(url)
                    .placeholder(user)
                    .error(user)
                    .into(imgView);
//            Picasso.with(context).load(url)
//                    .into(imgView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Bitmap getBitmapFromURL(String src) {
        try {
            Log.e("src",src);
            URL url = new URL(src);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            Log.e("Bitmap","returned");
            return myBitmap;
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("Exception",e.getMessage());
            return null;
        }
    }


    public static String getCurrentDateTime(String format) {
        DateFormat dateFormatter = new SimpleDateFormat(format);
        dateFormatter.setLenient(false);
        dateFormatter.setTimeZone(Calendar.getInstance().getTimeZone());
        Date today = new Date();
        String s = dateFormatter.format(today);
        Log.e("today_Date", "" + s);
        return s;
    }

}
