package com.example.axxesscodingdemoapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.axxesscodingdemoapp.R;
import com.example.axxesscodingdemoapp.adapter.CommentListAdapter;
import com.example.axxesscodingdemoapp.adapter.ImagesListAdapter;
import com.example.axxesscodingdemoapp.interfaces.RvClickListener;
import com.example.axxesscodingdemoapp.sqlitedatabase.DataBaseConstants;
import com.example.axxesscodingdemoapp.sqlitedatabase.DataBaseHelper;
import com.example.axxesscodingdemoapp.utils.Utils;
import com.google.gson.JsonArray;

import org.json.JSONArray;

public class DetailImageActivity extends AppCompatActivity {

    //region variables
    private String title;
    private String imageId;
    private String imageUrl;
    private EditText edtComment;
    private ImageView ivComment;
    private ImageView ivDetailImage;
    private RecyclerView rvComments;
    private DataBaseHelper dataBaseHelper;
    private CommentListAdapter commentListAdapter;
    private Context context = DetailImageActivity.this;

    //endregion

    // region methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_image);

        setupUI();
        getComment();
        setupEvents();
        getIntentExtras();
        setReceivedImage();
        setImageTitlewithBack();
    }

    /**
     * we get the json array of comments by passing image id
     * and the json array is set to the comment list adapter
     */
    private void getComment() {
        JSONArray jsonArray = dataBaseHelper.getCommentFromDatabase(imageId);
        setCommentListAdapter(jsonArray);
    }

    /**
     * set the comment list adapter by passing json array
     * @param jsonArray
     */
    private void setCommentListAdapter(JSONArray jsonArray) {
        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(this);
        rvComments.setLayoutManager(gridLayoutManager);
        commentListAdapter = new CommentListAdapter(context, jsonArray);
        rvComments.setAdapter(commentListAdapter);
    }

    /**
     * set up the click events
     * add comment click event is handled here
     * after click on add comment
     */
    private void setupEvents() {
        ivComment.setOnClickListener(view -> {
            saveComment();
        });
    }

    /**
     * storing the comment to the sqlite database
     * creating content values object
     * adding the id title and comment
     * adding the contentvalue object to database
     */
    private void saveComment() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataBaseConstants.Constants_TBL_COMMENT.IMAGE_ID,imageId);
        contentValues.put(DataBaseConstants.Constants_TBL_COMMENT.IMAGE_NAME,title);
        contentValues.put(DataBaseConstants.Constants_TBL_COMMENT.COMMENT,edtComment.getText().toString().trim());
        contentValues.put(DataBaseConstants.Constants_TBL_COMMENT.CREATED_DATE_TIME,Utils.getCurrentDateTime(Utils.MM_DD_YYY_HH_MM));

        dataBaseHelper.saveToLocalTable(DataBaseConstants.TableNames.TBL_COMMENT,contentValues);
        getComment();
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
        ivComment = findViewById(R.id.iv_comment);
        edtComment = findViewById(R.id.edt_comment);
        rvComments = findViewById(R.id.rv_comment_list);
        ivDetailImage = findViewById(R.id.iv_detail_image);

        dataBaseHelper = new DataBaseHelper(this);
    }

    /**
     * get the selected image url from the listing activity
     * store the url in imageUrl
     */
    private void getIntentExtras() {
        title = getIntent().getStringExtra("title");
        imageUrl = getIntent().getStringExtra("image");
        imageId = getIntent().getStringExtra("image_id");
    }

    /**
     * set the received image from the listing activity to the detail imageview
     * detail imageview is declared and initialized in this activity
     * when user clicks on image from the listing activity show the selected image here
     */
    private void setReceivedImage() {
        ivDetailImage.setImageBitmap(Utils.getBitmapFromURL(imageUrl));
    }

    /**
     * handles the back button action from the action bar
     * when we click the back button then it will move to the previous activity
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //endregion
}