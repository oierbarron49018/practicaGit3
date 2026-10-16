import java.util.Scanner;
public class Main {
    public static void main(String[] args) {





        pedirApellido();
    }
    public static  String pedirApellido ()
    {
        System.out.println("porfavor escriba sus apellidos");
        Scanner sc=new Scanner(System.in);
         String apellido =sc.nextLine();

        return apellido;
    }
}