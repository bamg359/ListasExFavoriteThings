package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {

        ArrayList<String> usuario = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        String id = "1";
        usuario.add(id); // add() , sirve para agregar datos a la lista
        System.out.println("Ingrese su nombre:");
        String nombre = sc.next();
        usuario.add(nombre);
        String correo = "pepita@mail.com";
        usuario.add(correo);
        String password = "1234";
        usuario.add(password);


        // Para medir el tamaño del ArrayList usamos size()

        System.out.println( " El tamaño de la lista es: " + usuario.size());


        // Para obtener un elemento de la lista , usamos el metodo get();

        System.out.println("Nombre: " + usuario.get(1));

        //Actualizar elemento de la lista:

        usuario.set(3, "xbz123");

        // podemos quitar un elemento de la lista

        usuario.remove(2);

        // podemos buscar elementos en la lista

        int index= usuario.indexOf("Pepita");
        System.out.println("Indice: " + index);

        // Podemos validar si el ArrayList esta vacio

        System.out.println(usuario.isEmpty());

        // imprimir

        for(int i = 0; i < usuario.size(); i++){

            System.out.println("el dato " + i + "es: " +usuario.get(i));
        }





    }




}
