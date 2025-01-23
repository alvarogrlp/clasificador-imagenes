package es.jpexposito.app.controller;

import es.jpexposito.app.model.ProductoFile;
import es.jpexposito.app.model.ProductoModelo;
import es.jpexposito.app.view.ProductoView;

public class ProductoControlador {
    ProductoFile productoFile;

    public ProductoControlador() {
        productoFile = new ProductoFile();
    }


    public boolean add(ProductoView productoView) {
        return false;
    }

    public ProductoView getById(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }
        ProductoModelo productoABuscar = new ProductoModelo(codigo);
        productoABuscar = productoFile.getProducto(productoABuscar);
        ProductoView productoView = new ProductoView(productoABuscar.getCodigo(), productoABuscar.getNombre());
        return productoView;
    }
}