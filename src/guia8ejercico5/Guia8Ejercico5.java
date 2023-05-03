/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package guia8ejercico5;

import Entidades.Paises;
import Servicio.PaisServicio;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author user
 */
public class Guia8Ejercico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PaisServicio ps = new PaisServicio();
        HashSet<Paises> p1 = ps.LlenarHashSet();
        ps.Ordenar(p1);
        ps.Eliminar(p1);
    }
}
