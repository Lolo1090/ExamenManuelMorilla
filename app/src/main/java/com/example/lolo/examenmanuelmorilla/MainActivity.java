package com.example.lolo.examenmanuelmorilla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private ArrayList<Producto> productos;
    private ArrayList fotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=findViewById(R.id.listView);
        productos=new ArrayList<Producto>();
        fotos=new ArrayList();

        productos.add(new Producto(1,"Televisor LG F21-40",R.drawable.televisor_lg,399,"Televisor imagen 4K de 40 pulgadas 400Mhz",fotos));
        productos.add(new Producto(2,"Microcadena Sony HT-100sd",R.drawable.galeria_microcadena1,199,"Cadena Musical conexion USB y Ipod 40W",fotos));
        productos.add(new Producto(3,"Plancha Rowenta Soft-FX-1",R.drawable.plancha_rowenta,90,"Plancha profesional 7 funciones de planchado 1800w",fotos));
        productos.add(new Producto(4,"Ordenador portatil Acer R235",R.drawable.portatil_acer,589,"Ordenador portatil Acer I5,8 gb,ssd240gb",fotos));

        adaptador_item myAdaptador=new adaptador_item(getApplicationContext(),productos);
        listview.setAdapter(myAdaptador);



        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicionClickada, long l) {

                Producto p= (Producto) adapterView.getItemAtPosition(posicionClickada);

                Intent intent=new Intent(getApplicationContext(), activity_Detalle.class);
                intent.putExtra("objeto", p);
                startActivity(intent);
            }
        });
    }
}
