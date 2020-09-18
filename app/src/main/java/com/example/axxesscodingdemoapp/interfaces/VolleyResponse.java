package com.example.axxesscodingdemoapp.interfaces;


import com.android.volley.VolleyError;

public interface VolleyResponse {

    void onProcessFinish(String response, VolleyError error, String status);


//    void onProcessFinish(String response);

//    void onError(VolleyError error);
}
