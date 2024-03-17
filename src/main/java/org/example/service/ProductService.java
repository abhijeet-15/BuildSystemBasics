package org.example.service;

import org.example.entity.Product;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductService {
    @GET("/products/{id}")
    public Call<Product> getProductById(@Path("id") long id);
}
