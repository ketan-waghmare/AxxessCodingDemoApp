package com.example.axxesscodingdemoapp.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.axxesscodingdemoapp.interfaces.VolleyResponse;

import java.util.Map;

public class HttpService {


    public static void accessWebServices(final Context context, String url, int method, final Map param, final Map headerParam, final VolleyResponse responseListner) {
        final ProgressDialog loading = ProgressDialog.show(context, "Loading.....", "Please wait...", true);

        StringRequest stringRequest = new StringRequest(method, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.e("onResponse", "" + response);
                        if (!((Activity) context).isFinishing()) {
                            loading.dismiss();
                        }
                        responseListner.onProcessFinish(response, null, "response");
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("onErrorResponse", "" + error);
                        responseListner.onProcessFinish("", error, "error");

                        if (loading != null && loading.isShowing()) {
                            loading.dismiss();
//                        if (loading != null)

                        }
                    }
                }) {
            @Override
            protected Map<String, String> getParams() {
                return param;
            }

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return headerParam;
            }
        };

        stringRequest.setRetryPolicy(new RetryPolicy() {
            @Override
            public int getCurrentTimeout() {

                Log.e("getCurrentTimeout", "" + "5000");

                return 50000;
            }

            @Override
            public int getCurrentRetryCount() {
                Log.e("getCurrentRetryCount", "" + "5000");

                return 50000;
            }

            @Override
            public void retry(VolleyError error) throws VolleyError {
                //Toast.makeText(context, "" + error, Toast.LENGTH_SHORT).show();
                Log.e("onErrorResponse", "" + error);
                responseListner.onProcessFinish("", error, "error");
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(context);
        requestQueue.add(stringRequest);
    }
}
