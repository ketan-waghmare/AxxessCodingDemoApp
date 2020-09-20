package com.example.axxesscodingdemoapp.sqlitedatabase;

public class SQLiteQueries {


    /**
     * sql query to create a table for storing comments
     */
    public static final String QUERY_TBL_COMMENTS = "create table IF NOT EXISTS "
            + DataBaseConstants.TableNames.TBL_COMMENT + "("
            + DataBaseConstants.Constants_TBL_COMMENT.ID + " INTEGER primary key AUTOINCREMENT,"
            + DataBaseConstants.Constants_TBL_COMMENT.IMAGE_ID + " VARCHAR,"
            + DataBaseConstants.Constants_TBL_COMMENT.IMAGE_NAME + " VARCHAR,"
            + DataBaseConstants.Constants_TBL_COMMENT.COMMENT + " VARCHAR,"
            + DataBaseConstants.Constants_TBL_COMMENT.CREATED_DATE_TIME + " VARCHAR" + ");";
}
