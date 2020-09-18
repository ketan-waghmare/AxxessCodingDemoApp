package com.example.axxesscodingdemoapp.utils;

public class ApiUtils {

    private static String PROTOCOL = "https://";
    //        private static String SERVER_URL = "45.252.190.29";
    private static String SERVER_URL = "api.imgur.com";            // Test server  vv- 27-03-2020
//    private static String SERVER_URL = "45.252.190.217";            // Updated server  vv- 31-03-2020
//    private static String SERVER_URL = "192.168.43.40/medicine-backend/public";

    public static String GET_IMAGES = PROTOCOL + SERVER_URL + "/3/gallery/search/1?q=vanilla";
}
