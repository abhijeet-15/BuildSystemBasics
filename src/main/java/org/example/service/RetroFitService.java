package org.example.service;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

import java.lang.annotation.Target;

public interface RetroFitService {
    @GET("/")
    Call<ResponseBody> getExample();
}
