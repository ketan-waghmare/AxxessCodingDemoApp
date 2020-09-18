package com.example.axxesscodingdemoapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.axxesscodingdemoapp.R;
import com.example.axxesscodingdemoapp.utils.Utils;

public class DetailImageActivity extends AppCompatActivity {

    private String title;
    private String imageUrl;
    private Button btnComment;
    private EditText edtComment;
    private ImageView ivDetailImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_image);

        setupUI();
        getIntentExtras();
        setReceivedImage();
        setImageTitlewithBack();
    }

    /**
     * set the title of the image on the action bar
     * set the back button enable on the action bar
     */
    private void setImageTitlewithBack() {
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * set all the ui elements of the detail activity
     * initialize all the UI elements from the XMl
     */
    private void setupUI() {
        btnComment = findViewById(R.id.btn_comment);
        edtComment = findViewById(R.id.edt_comment);
        ivDetailImage = findViewById(R.id.iv_detail_image);
    }

    /**
     * get the selected image url from the listing activity
     * store the url in imageUrl
     */
    private void getIntentExtras() {
        title = getIntent().getStringExtra("title");
        imageUrl = getIntent().getStringExtra("image");
    }

    /**
     * set the received image from the listing activity to the detail imageview
     * detail imageview is declared and initialized in this activity
     * when user clicks on image from the listing activity show the selected image here
     */
    private void setReceivedImage() {
        ivDetailImage.setImageBitmap(Utils.getBitmapFromURL(imageUrl));
    }
}