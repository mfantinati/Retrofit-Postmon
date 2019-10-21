package com.example.postmon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EnderecoService {

    @GET("cep/{cep}/")
    Call getEndereco(@Path("cep")String cep);
    //{complement}
    //,@Query("complement")String complement
}
