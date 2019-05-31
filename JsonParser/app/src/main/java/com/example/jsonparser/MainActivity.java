package com.example.jsonparser;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.Collections;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        NetworkService.getInstance()
                .getJSONApi()
                .getPostWithID(1)
                .enqueue(new Callback<Peoples>() {
                    @Override
                    public void onResponse(@NonNull Call<Peoples> call, @NonNull Response<Peoples> response) {
                        Peoples post = response.body();
                        Employee[] employees = post.getCompany().getEmployees();
                        Collections.sort(Arrays.asList(employees), Sort.NameComparator);
                        Adapter adapter = new Adapter(employees);
                        recyclerView.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(@NonNull Call<Peoples> call, @NonNull Throwable t) {
                        t.printStackTrace();
                    }
                });
    }
}
