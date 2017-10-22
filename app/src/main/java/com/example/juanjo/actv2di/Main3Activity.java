package com.example.juanjo.actv2di;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void onClick(View v){

        switch (v.getId()){

            case R.id.album1:
                System.out.println("Has clickado en el album 1");

                Intent explicit_intent;//Declaro el Intent

                //Instanciamos el Intent dandole:
                // el contexto y la clase a la cual nos deseamos dirigir
                explicit_intent = new Intent(this,MainActivity.class);


                //lo iniciamos pasandole la intencion, con todos sus parametros guardados
                startActivity(explicit_intent);

                break;
            case  R.id.album2:

                System.out.println("Has clickado en el album 2");


                Intent explicit_intent2;//Declaro el Intent

                //Instanciamos el Intent dandole:
                // el contexto y la clase a la cual nos deseamos dirigir
                explicit_intent2 = new Intent(this,Main2Activity.class);


                //lo iniciamos pasandole la intencion, con todos sus parametros guardados
                startActivity(explicit_intent2);

                break;
            case R.id.album3:
                System.out.println("Has clickado en el album 3");



                break;
            case R.id.album4:
                System.out.println("Has clickado en el album 4");

                Intent explicit_intent4;//Declaro el Intent

                //Instanciamos el Intent dandole:
                // el contexto y la clase a la cual nos deseamos dirigir
                explicit_intent4 = new Intent(this,Main4Activity.class);


                //lo iniciamos pasandole la intencion, con todos sus parametros guardados
                startActivity(explicit_intent4);
                break;
        }

    }
}
