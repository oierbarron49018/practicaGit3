import java.util.Scanner;
public class Main {
    public static void main(String[] args) {




        // aqui se llama la funcion
        pedirApellido();
    }
    public static  String pedirApellido ()
    {
        // se realiza funcion para pedir apellido
        System.out.println("porfavor escriba sus apellidos");
        Scanner sc=new Scanner(System.in);
         String apellido =sc.nextLine();
        // la fuincion no devuelve nada y tampoco pide parametros
        return apellido;
    }
}