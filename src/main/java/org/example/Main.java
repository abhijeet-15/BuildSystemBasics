package org.example;

import okhttp3.*;
import org.example.service.RetroFitService;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Abhijeet");
        OkHttpClient client = new OkHttpClient();

        String url = "https://example.com/";

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if(!response.isSuccessful()) {
                System.out.println("Something went wring !!!!");
            }
            System.out.println(response.body().string());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        retroFitAPICall();
        System.out.println("Fetching product...");
        ProductClient.getProductById();

    }

    public static void retroFitAPICall() {
        System.out.println("retro fit api method called");
        String url = "https://example.com/";

        Retrofit rf = new Retrofit.Builder().baseUrl(url).build();
        RetroFitService service = rf.create(RetroFitService.class);
        Call<ResponseBody> responseCall = service.getExample();

        try {
            retrofit2.Response<ResponseBody> response = responseCall.execute();
            System.out.println(response.body().string());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}