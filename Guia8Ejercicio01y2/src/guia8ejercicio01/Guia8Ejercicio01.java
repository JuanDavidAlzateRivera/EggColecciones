/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package guia8ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Guia8Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList();
        int opcion;
        System.out.println("Digite una raza de perro: ");
        do {

            String raza = leer.nextLine();
            razas.add(raza);
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Desea digitar mas razas de perros? : \n"
                    + "1. Si. \n"
                    + "2. No \n"
                    + "---------------------------------------------------------------------------------");
            opcion = leer.nextInt();
            if (opcion == 1) {
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("Digite otra raza de perro");
                String raza1 = leer.next();
                razas.add(raza1);
            }
        } while (opcion == 1);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("La lista de perros es: " + razas);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Ahora Digite de nuevo una raza de perro:");
        String raza2 = leer.next();
        Iterator<String> it = razas.iterator();

        while (it.hasNext()) {
            if (it.next().equals(raza2)) {
                it.remove();
            } else {
                System.out.println("El perro no esta en la lista");
            }
            break;
        }
        Collections.sort(razas);
        System.out.print("Entonces la lista final queda asi: " + razas);
    }
}
