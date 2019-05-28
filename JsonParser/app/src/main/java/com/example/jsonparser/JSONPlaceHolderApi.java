package com.example.jsonparser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JSONPlaceHolderApi {
    @GET("/v2/{56fa31e0110000f920a72134}")
    public Call<Peoples> getPostWithID(@Path("56fa31e0110000f920a72134") int company);
}
