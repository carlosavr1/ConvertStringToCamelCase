package com.codewars;

/**
 * Created by carlvarn on 18/07/2017.
 */
public class Solution {
    public static String toCamelCase(String s) {
        String response = "";
        if(s.length() > 0){
            String words[] = s.split("(-)|(_)");
            response = words[0].substring(0,1) + (words[0].length() > 1 ? response+words[0].substring(1,words[0].length()).toLowerCase() : "");
            for (int i = 1; i < words.length; i++) {
                response = response + words[i].substring(0,1).toUpperCase() + words[i].substring(1,words[i].length()).toLowerCase();;
            }
            return response;
        }else{
            return response;
        }
    }
}