package com.example.axxesscodingdemoapp.utils;

import android.content.Context;
import android.widget.ImageView;

import com.example.axxesscodingdemoapp.R;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;


/**
 * Created by Aikya on 16-Jan-18.
 */

public class Utils {

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

}
