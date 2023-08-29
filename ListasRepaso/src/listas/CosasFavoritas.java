package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class CosasFavoritas {

    static ArrayList<String> cosas = new ArrayList<String>();

    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {

        agregarItem();

    }


    public static void agregarItem(){
        System.out.println("Para iniciar escriba on");
        String init = sc.next();

        do{

            System.out.println("Desea agregar sus cosas favoritas? 1 = si , 0 = no ");
            int agregar = sc.nextInt();
            System.out.println(agregar);
            if( agregar == 1){

                System.out.println("Ingrese su cosa favorita: ");
                String cf = sc.next();
                cosas.add(cf);
                init = "on";
            }else{

                for(int i= 0; i< cosas.size(); i++){
                    System.out.println(cosas.get(i));
                }
                System.out.println("Salir");

                init = "off";
            }


        }while(init == "on");


    }




}
