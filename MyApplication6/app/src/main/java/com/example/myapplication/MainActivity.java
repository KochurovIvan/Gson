package com.example.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView = findViewById(R.id.MyListView);
    ArrayAdapter<String> adapter;
    

    public void Record(ArrayList result) {
        Log.d("Result","String > " + result);

        //дальше добавляем полученные параметры в наш адаптер
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1
                , result);
        listView.setAdapter(adapter);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread() {    //открываем новый поток
            public void run() {
               Log.d("mylog", "JSON > "+Json.getJson("http://www.mocky.io/v2/56fa31e0110000f920a72134"));
               String MyCode = Json.getJson("http://www.mocky.io/v2/56fa31e0110000f920a72134");
                ArrayList response = JsonParser.getUser(MyCode);

            }

        }.start();



             /*   try {
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
                }*/




          /* }

        }.start();*/

       /* // находим список
        ListView lvMain = (ListView) findViewById(R.id.MyListView);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, people);

        // присваиваем адаптер списку
        lvMain.setAdapter(adapter);*/



        // listView = (ListView) findViewById(R.id.listView);
      //  adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, people);
      //  listView.setAdapter(adapter);

       /* try {
            // create a new instance from a string

            String name = jsonObject.getString("name");
            Log.d("Name","Could not parse JSON. Error: " + name);

            String phone_number = jsonObject.getString("phone_number");
            Log.d("Phone","Could not parse JSON. Error: " + phone_number);

            JSONArray skills = jsonObject.getJSONArray("skills"); //for an array of String objects
            Log.d("Skills","Could not parse JSON. Error: " + skills);


        } catch (JSONException e) {
            Log.d("Fuck","Could not parse JSON. Error: " + e.getMessage());
        }*/
      //  JsonParser.getUsers(Json.getJson("http://www.mocky.io/v2/56fa31e0110000f920a72134"));


//       Log.d("mylog", "JSON > "+Json.getJson("http://www.mocky.io/v2/56fa31e0110000f920a72134"));

        // получаем экземпляр элемента ListView
      //  ListView listView = findViewById(R.id.listView);



// используем адаптер данных
       /* ArrayAdapter adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, catNames);*/

       // listView.setAdapter((ListAdapter)Json.getJson("http://www.mocky.io/v2/56fa31e0110000f920a72134"));
    }

}

