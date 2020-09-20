package com.example.axxesscodingdemoapp.sqlitedatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DataBaseHelper {
    public Context context;
    private SQLiteHelper sqLiteHelper;
    public static SQLiteDatabase sqLiteDatabase;

    public DataBaseHelper(Context context) {
        this.context = context;
        sqLiteHelper = new SQLiteHelper(context);
        sqLiteDatabase = sqLiteHelper.getWritableDatabase();
        sqLiteDatabase = sqLiteHelper.getReadableDatabase();
    }

    /**
     * save the comments to the local database
     * if the comment saved successfully then it will show the success message
     * else it will show something went wrong
     * @param table
     * @param contentValues
     * @return
     */
    public Long saveToLocalTable(String table, ContentValues contentValues) {
        long count = 0;
        try {
            count = sqLiteDatabase.insert(table, null, contentValues);

            if (count != -1) {
                Toast.makeText(context, "Comment Saved Sucessfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Something went wrong", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * get the comments of the perticular image from the database
     * if the image is haveing multiple comments then the comments are added to jsonarray
     * and the json array is set to the comment list
     * @param image_id
     * @return
     */
    public JSONArray getCommentFromDatabase(String image_id) {
        Cursor cursor = null;
        JSONArray jArray = new JSONArray();

        cursor = sqLiteDatabase.rawQuery("SELECT * from `" + DataBaseConstants.TableNames.TBL_COMMENT + "` Where " + DataBaseConstants.Constants_TBL_COMMENT.IMAGE_ID + " ='" + image_id + "'", null);
        JSONObject json = null;

        if (cursor.getCount() != 0) {
            try {
                while (cursor.moveToNext()) {
                    json = new JSONObject();
                    for (int i = 0; i < cursor.getColumnCount(); i++) {
                        json.put(cursor.getColumnName(i), cursor.getString(cursor.getColumnIndex(cursor.getColumnName(i))));
                    }
                    jArray.put(json);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jArray;
    }
}