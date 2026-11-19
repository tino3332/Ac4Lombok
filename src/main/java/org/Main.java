package org;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   DTO INMUTABLE CON JAVA RECORD          ");
        System.out.println("==========================================");

        // 1. Instanciar varios Producto y ProductoRecord
        Producto producto1 = new Producto("P001", "Teclado Mecanico", "TechSupply", 65000.0);
        Producto producto2 = new Producto("P002", "Mouse Inalambrico", "PerifericosSA", 28000.0);
        Producto producto3 = new Producto("P003", "Monitor 24\"", "VisualTech", 195000.0);

        ProductoRecord recordDirecto = new ProductoRecord("P004", "Webcam HD", 34000.0);

        // 2. Instanciar los ProductoRecord con los objetos Producto
        ProductoRecord record1 = new ProductoRecord(producto1.getCodigo(), producto1.getNombre(), producto1.getPrecio());
        ProductoRecord record2 = new ProductoRecord(producto2.getCodigo(), producto2.getNombre(), producto2.getPrecio());
        ProductoRecord record3 = new ProductoRecord(producto3.getCodigo(), producto3.getNombre(), producto3.getPrecio());

        // 3. Guardarlos en una lista
        List<ProductoRecord> listaRecords = new ArrayList<>();
        listaRecords.add(record1);
        listaRecords.add(record2);
        listaRecords.add(record3);
        listaRecords.add(recordDirecto);

        // 4. Mostrar los productos en consola
        System.out.println("--- Productos originales ---");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);

        System.out.println("\n--- Lista de ProductoRecord ---");
        for (ProductoRecord pr : listaRecords) {
            System.out.println(pr);
        }

        System.out.println("==========================================");
    }
}