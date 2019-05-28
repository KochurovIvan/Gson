package com.example.jsonparser;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    final ArrayList<String> people = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NetworkService.getInstance()
                .getJSONApi()
                .getPostWithID(1)
                .enqueue(new Callback<Peoples>() {
                    @Override
                    public void onResponse(Call<Peoples> call, Response<Peoples> response) {

                    }

                    @Override
                    public void onFailure(Call<Peoples> call, Throwable t) {

                    }

                    @Override
                    public void onResponse(@NonNull Call<Employee> call, @NonNull Response<Employee> response) {
                        Employee employee = response.body();

                        people.add(employee.getName() + "\n");
                        Log.d("Employ","Array > " + people);
                    }

                    @Override
                    public void onFailure(@NonNull Call<Employee> call, @NonNull Throwable t) {

                        t.printStackTrace();
                    }
                });
    }
}
