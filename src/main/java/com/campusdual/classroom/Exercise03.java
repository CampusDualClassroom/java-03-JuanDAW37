package com.campusdual.classroom;

import java.util.Scanner;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor
    // TODO ↓: Tiene que devolver el siguiente mensaje: "Hola. Bienvenido " y la cadena de textos que se le pasa por parámetro.
    public static String greetings(String name) {
        String n = "Hola. Bienvenido " + name;
        return n;
    }

    // Esto es una funcion, ya que devuelve un valor
    // TODO ↓: Tiene que devolver el siguiente mensaje: "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " y la cadena de texto que se le pasa por parámetro
    public static String error(String nombre) {
        String n = "Ups. No pudimos validar tus datos. Tu nombre de usuario no es "+ nombre;
        return n;
    }

    //Esto es un procedimiento, ya que no devuelve un valor
    // TODO ↓: Tiene que comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01". Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()
    public static void checkUser(String user, String pass) {
        if (user.equals("Sebas") && pass.equals("sebas01") ){
            System.out.println(greetings(user));
        }else{
            System.out.println(error("Sebas"));
        }
    }


    public static void main(String[] args) {
       /*Scanner teclado = new Scanner(System.in);
        System.out.print("Nome de usuario: ");
        String nome = teclado.next();
        System.out.print("password: ");
        String password = teclado.next();*/
        checkUser("Sebas", "sebas01");
        checkUser("Juan", "Juan05");
    }
}
