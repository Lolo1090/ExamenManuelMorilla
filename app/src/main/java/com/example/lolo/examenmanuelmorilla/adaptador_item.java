package com.example.lolo.examenmanuelmorilla;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lolo on 12/12/2017.
 */



public class adaptador_item extends BaseAdapter{

    Context contexto;
    ArrayList<Producto> productos;

    public adaptador_item(Context contexto, ArrayList<Producto> productos) {
        this.contexto = contexto;
        this.productos = productos;
    }

    @Override
    public int getCount() {
        return productos.size();
    }

    @Override
    public Object getItem(int i) {
        return productos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista=view;
        LayoutInflater inflate=LayoutInflater.from(contexto);
        vista=inflate.inflate(R.layout.activity_adaptador_item, null); //en referencia al activity_adaptador

        TextView txtNombre=vista.findViewById(R.id.txtNombre);
        TextView txtDescripcion=vista.findViewById(R.id.txtDescripcion);
        TextView txtPrecio=vista.findViewById(R.id.txtPrecio);
        ImageView imagenProducto=vista.findViewById(R.id.imageView);

        txtNombre.setText(productos.get(i).getNombreProducto().toString());
        txtDescripcion.setText(productos.get(i).getDescripcion().toString());
        txtPrecio.setText(((String.valueOf(productos.get(i).getPrecio()))));
        imagenProducto.setImageResource(productos.get(i).getImagen());


        return vista;
    }
}
