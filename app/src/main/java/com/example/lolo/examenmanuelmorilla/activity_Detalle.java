package com.example.lolo.examenmanuelmorilla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_Detalle extends AppCompatActivity {

    private TextView txtProducto;
    private TextView txtPrecio;
    private TextView txtId;
    private TextView txtDescripcion;
    private ImageView fotoProducto;
    private ImageView fotoAlante;
    private ImageView fotoAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__detalle);

        txtProducto=findViewById(R.id.txtProducto);
        txtPrecio=findViewById(R.id.txtPrecio);
        txtId=findViewById(R.id.txtId);
        txtDescripcion=findViewById(R.id.txtDescripcion);
        fotoProducto=findViewById(R.id.fotoProducto);
        fotoAlante=findViewById(R.id.fotoAlante);
        fotoAtras=findViewById(R.id.fotoAtras);

        Producto p = (Producto) getIntent().getExtras().getSerializable("objeto");

        txtProducto.setText("Producto: "+p.getNombreProducto().toString());
        txtPrecio.setText((("Precio: "+String.valueOf(p.getPrecio()))));
        txtId.setText((("Codigo: "+String.valueOf(p.getIdProducto()))));
        txtDescripcion.setText("Descripcion: "+p.getDescripcion().toString());

        fotoProducto.setImageResource(p.getImagen());



    }
}
