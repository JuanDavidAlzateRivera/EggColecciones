/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Scanner;

public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> lista = new HashMap();

    private Producto crearProducto() {
        Producto p1 = new Producto();
        System.out.println("Ingrese el nombre del producto");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el precio del producto");
        p1.setPrecio(leer.nextDouble());
        return p1;
    }

    private HashMap<String, Double> crearLista() {

        Producto p1 = crearProducto();
        lista.put(p1.getNombre(), p1.getPrecio());
        return lista;
    }

    private void mostrarLista(HashMap<String, Double> lista) {
        System.out.println(lista);

    }

    private void modificarPrecio(HashMap<String, Double> lista) {
        System.out.println("Ingrese el producto a modificar precio:");
        String aux = leer.next();

        if (lista.containsKey(aux) == true) {
            System.out.println("Ingrese el nuevo precio");
            Double aux1 = leer.nextDouble();
            lista.put(aux, aux1);
        } else {
            System.out.println("Producto Incorrecto");
        }

    }

    private void eliminarProducto(HashMap<String, Double> lista) {
        System.out.println("Ingrese el producto a eliminar");
        String aux = leer.next();

        if (lista.containsKey(aux) == true) {
            lista.remove(aux);
        } else {
            System.out.println("Producto no encontrado");
        }

    }

    public void menu() {
        boolean bandera = true;
        do {
            System.out.println("Elija la opcion deseada: \n 1- Ingresar Producto \n 2 - Modificar Precio \n 3- Eliminar Producto \n 4 - Consultar Lista \n 5- Salir ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearLista();
                    bandera = true;

                    break;
                case 2:
                    modificarPrecio(lista);
                    bandera = true;
                    break;
                case 3:
                    eliminarProducto(lista);
                    bandera = true;
                    break;
                case 4:
                    mostrarLista(lista);
                    bandera = true;
                    break;
                case 5:
                    bandera = false;
                    break;
                default:
                    System.out.println("La opcion elegida es incorrecta");
                    bandera = true;
            }

        } while (bandera == true);
    }

}

//  for (Map.Entry<String, Double> entry : lista.entrySet()) 

