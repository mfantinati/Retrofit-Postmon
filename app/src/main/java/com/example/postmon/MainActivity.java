package com.example.postmon;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Postmon Project");
        setContentView(R.layout.activity_main);

        final TextView campoJson = findViewById(R.id.campoJson);
        final Button botaoBuscar = findViewById(R.id.btn_buscar);

        botaoBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EnderecoService service = new RetrofitConfig().getEnderecoService();
                Call<Endereco> call = service.getEndereco("09251140");
                //format=xml
                call.enqueue(new Callback<Endereco>() {
                    @Override
                    public void onResponse(Call<Endereco> call, Response<Endereco> response) {
                        if(response.isSuccessful()){
                            Endereco endereco = response.body();

                            String conteudo = "Bairro: "+ endereco.getBairro()+"\nCidade: "+ endereco
                                    .getCidade()+"\nLogradouro: "+ endereco.getLogradouro()+
                                    "\nEstado: " + endereco.getEstado_info()+"\nArea: "+ endereco.
                                    getArea_km2()+ "Codigo: "+ endereco.getCodigo_ibge()+"\nNome: "+
                                    endereco.getNome() +"\nCEP: "+ endereco.getCep()+"\nCidade_info: "
                                    + endereco.getCidade_info();

                            campoJson.setText(conteudo);
                        }
                    }

                    @Override
                    public void onFailure(Call<Endereco> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Não foi possivel obter os dados!!", Toast.LENGTH_LONG).show();
                    }
                });
           }
        });

    }
}
