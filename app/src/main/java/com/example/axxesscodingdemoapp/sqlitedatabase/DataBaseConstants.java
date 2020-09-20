package com.example.axxesscodingdemoapp.sqlitedatabase;

/**
 * Class Name        :  <b>DataBaseConstants.java<b/>
 * Purpose           :  DataBaseConstants is class related of constants.
 * Developed By      :  <b>ketan waghmare</b>
 * Created Date      :  <b>24-08-2020</b>
 */


public class DataBaseConstants {

    public static final String DATABASE_NAME = "axxess_comment_db";
    public static final int DATABASE_VERSION = 1;

    public static class TableNames {
        public static final String TBL_COMMENT = "tbl_comment";
    }

    public static class Constants_TBL_COMMENT {
        public static final String ID = "id";
        public static final String IMAGE_ID = "image_id";
        public static final String IMAGE_NAME = "image_name";
        public static final String COMMENT = "comment";
        public static final String CREATED_DATE_TIME = "created_date_time";
    }

}