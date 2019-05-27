package com.example.myapplication;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JsonParser {


    public static ArrayList<String> getUser(String MyCode) {
        final ArrayList<String> people = new ArrayList();

         try {
                    JSONObject jsonObject = new JSONObject(MyCode);
                    JSONObject jsonObject1 = jsonObject.getJSONObject("company");
                    JSONArray employees = jsonObject1.getJSONArray("employees");

                    for (int i = 0; i < employees.length(); i++)
                    {
                        JSONObject jsonText = employees.getJSONObject(i);
                        String name = jsonText.getString("name");
                        String phone = jsonText.getString("phone_number");
                        JSONArray skills = jsonText.getJSONArray("skills");

                        people.add(name);

                        Log.d("NAME","String > " + name);
                        Log.d("phone","String > " + phone);
                        Log.d("skills","Array > " + skills);

                    }

                } catch (JSONException e) {
                    e.printStackTrace();

                }
        Log.d("PEOPLE","String > " + people);
        return  people;

    }
}
