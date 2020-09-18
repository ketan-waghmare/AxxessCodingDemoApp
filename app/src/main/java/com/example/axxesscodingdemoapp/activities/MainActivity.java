package com.example.axxesscodingdemoapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.example.axxesscodingdemoapp.R;
import com.example.axxesscodingdemoapp.adapter.ImagesListAdapter;
import com.example.axxesscodingdemoapp.interfaces.RvClickListener;
import com.example.axxesscodingdemoapp.model.DataInfo;
import com.example.axxesscodingdemoapp.model.ImageDataClass;
import com.example.axxesscodingdemoapp.utils.ApiUtils;
import com.example.axxesscodingdemoapp.utils.HttpService;
import com.example.axxesscodingdemoapp.utils.Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements RvClickListener {

    private EditText edtSearch;
    private RecyclerView rvImageList;
    private Context context = MainActivity.this;

    private ImagesListAdapter imagesListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();
        setupEvents();
        getImageListFromServer();
    }

    /**
     * set up all the UI elements here
     * initialization of ui elements
     */
    private void setupUI() {
        edtSearch = findViewById(R.id.edt_search);
        rvImageList = findViewById(R.id.rv_image_list);
    }

    /**
     * set up all the click events of the ui elements
     * on click of ui elements perform some action
     */
    private void setupEvents() {

    }

    /**
     * GET API call to get all the image list from the server
     */
    private void getImageListFromServer() {
        Map<String, String> headerParams = new HashMap<>();
        headerParams.put("Authorization", "Client-ID 137cda6b5008a7c");

        Map<String, String> requestBodyParams = new HashMap<>();

        HttpService.accessWebServices(
                context,
                ApiUtils.GET_IMAGES,
                Request.Method.GET,
                requestBodyParams,
                headerParams,
                (response, error, status) -> handleAPIResponse(response, error, status));
    }

    private void handleAPIResponse(String response, VolleyError error, String status) {
        Log.e("response_Login", ":" + response);
        if (status.equals("response")) {
            try {
                ImageDataClass responseData = (ImageDataClass) Utils.parseResponse(response, ImageDataClass.class);
                if (responseData.getSuccess()) {
                    setImagesList(responseData.getData());
                }
            } catch (Exception e) {
                // TODO: Handle exception
                e.printStackTrace();
            }
        } else if (status.equals("error")) {
            Toast.makeText(context, error.toString(), Toast.LENGTH_SHORT).show();
            // TODO: Handle error
        }
    }

    private void setImagesList(List<DataInfo> dataList) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false);
        rvImageList.setLayoutManager(gridLayoutManager);
        imagesListAdapter = new ImagesListAdapter(context, dataList);
        rvImageList.setAdapter(imagesListAdapter);
        imagesListAdapter.setRvClickListener(this);
    }

    @Override
    public void rv_click(int position, int value, String key) {

    }
}