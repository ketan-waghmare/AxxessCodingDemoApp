package com.example.axxesscodingdemoapp.activities;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
import android.content.Context;
import android.widget.EditText;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.example.axxesscodingdemoapp.R;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.example.axxesscodingdemoapp.utils.Utils;
import com.example.axxesscodingdemoapp.utils.ApiUtils;
import androidx.recyclerview.widget.GridLayoutManager;
import com.example.axxesscodingdemoapp.model.DataInfo;
import com.example.axxesscodingdemoapp.utils.HttpService;
import com.example.axxesscodingdemoapp.model.ImageDataClass;
import com.example.axxesscodingdemoapp.adapter.ImagesListAdapter;
import com.example.axxesscodingdemoapp.interfaces.RvClickListener;



public class MainActivity extends AppCompatActivity implements RvClickListener {

    //region variable
    private EditText edtSearch;
    private ImageView ivSearch;
    private RecyclerView rvImageList;
    private ImageDataClass responseData;
    private ImagesListAdapter imagesListAdapter;
    private Context context = MainActivity.this;

    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUI();
        setupEvents();
    }

    /**
     * set up all the UI elements here
     * initialization of ui elements
     */
    private void setupUI() {
        ivSearch = findViewById(R.id.iv_search);
        edtSearch = findViewById(R.id.edt_search);
        rvImageList = findViewById(R.id.rv_image_list);
    }

    /**
     * set up all the click events of the ui elements
     * on click of ui elements perform some action
     */
    private void setupEvents() {
        ivSearch.setOnClickListener(view -> {
            getImageListFromServer();
        });
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
                ApiUtils.GET_IMAGES + edtSearch.getText().toString().trim(),
                Request.Method.GET,
                requestBodyParams,
                headerParams,
                (response, error, status) -> handleAPIResponse(response, error, status));
    }

    /**
     * handle the response received from the server
     * if the response is success
     * set the image list to the recyclerview
     * else show the error message
     * @param response
     * @param error
     * @param status
     */
    private void handleAPIResponse(String response, VolleyError error, String status) {
        if (status.equals("response")) {
            try {
                responseData = (ImageDataClass) Utils.parseResponse(response, ImageDataClass.class);
                if (responseData.getSuccess()) {
                    setImagesList(responseData.getData());
                }
            } catch (Exception e) {
                // TODO: Handle exception
                e.printStackTrace();
            }
        } else if (status.equals("error")) {
            Toast.makeText(context, "Something went wrong", Toast.LENGTH_SHORT).show();
            // TODO: Handle error
        }
    }

    /**
     * set the images list received from the server
     * set the click listener to the recyclerview
     * @param dataList
     */
    private void setImagesList(List<DataInfo> dataList) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false);
        rvImageList.setLayoutManager(gridLayoutManager);
        imagesListAdapter = new ImagesListAdapter(context, dataList);
        rvImageList.setAdapter(imagesListAdapter);
        imagesListAdapter.setRvClickListener(this);
    }

    /**
     * recyclerview click handle of perticular position
     * send the title image and image_id to the detail activity
     * @param position
     * @param value
     * @param key
     */
    @Override
    public void rv_click(int position, int value, String key) {
        Intent mIntent = new Intent(MainActivity.this,DetailImageActivity.class);
        mIntent.putExtra("title",responseData.getData().get(position).getTitle());
        mIntent.putExtra("image",responseData.getData().get(position).getImages().get(0).getLink());
        mIntent.putExtra("image_id",responseData.getData().get(position).getImages().get(0).getId());
        startActivity(mIntent);
    }
}