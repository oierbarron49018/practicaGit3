import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre=pedirNombre(sc);
    }
public static String pedirNombre(Scanner sc){
    System.out.println("Introduce tu nombre");
    String nombre=sc.nextLine();
    return nombre;
}
}