package com.mc.virustop.web;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/** Интерфейс для описания API серверной части. */
public interface ApiService {
    @SuppressWarnings("rawtypes")
    @POST("items")
    Call<ResponseBody> addItem(@Body HashMap hashMap);

    @GET("profile")
    Call<ResponseBody> getProfile();
}
