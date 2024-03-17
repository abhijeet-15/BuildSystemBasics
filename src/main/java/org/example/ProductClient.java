package org.example;

import org.example.entity.Product;
import org.example.service.ProductService;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductClient {

    public static void getProductById() {
        System.out.println("product client called");
        String baseURL = "https://fakestoreapi.com/";
        Retrofit rf = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ProductService service = rf.create(ProductService.class);
        Call<Product> responseCall = service.getProductById(1);

        try {
            Response<Product> response = responseCall.execute();
            Product product = response.body();
            System.out.println(product.toString());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
