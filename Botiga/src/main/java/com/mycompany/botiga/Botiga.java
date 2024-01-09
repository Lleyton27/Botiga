/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.botiga;

/**
 *
 * @author lleyton.camram.dam_i
 */
public class Botiga {

    public static void main(String[] args) {
        Productes[] productes = new Productes[5];
         
        productes[0] = new Productes("Leche", (float) 19.99, "Descripción del Producto 1");
        productes[1] = new Productes("Manteca", (float) 29.99, "Descripción del Producto 2");
        productes[2] = new Productes("Pollo", (float) 39.99, "Descripción del Producto 3");
        productes[3] = new Productes("Carne", (float) 49.99, "Descripción del Producto 4");
        productes[4] = new Productes("Conejo", (float) 59.99, "Descripción del Producto 5");

        // Mostrar la lista de productos
        System.out.println("Lista de productos:");

        for (int i = 0; i < productes.length; i++) {
            System.out.println((i + 1) + ". " + productes[i].getnombre() +
                               " - Precio: $" + productes[i].getprecio() +
                               " - Descripción: " + productes[i].getdescripcion());
        }
    }
}
