import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre=pedirNombre(sc);
        String apellido=pedirApellido(sc);
    }
    public static String pedirNombre(Scanner sc) {
        System.out.println("Introduce tu nombre:");
        return sc.nextLine();
    }
    public static String pedirApellido(Scanner sc) {
        System.out.println("Por favor, escribe tus apellidos:");
        return sc.nextLine();
    }
}