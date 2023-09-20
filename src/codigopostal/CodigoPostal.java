package codigopostal;
import java.util.Scanner;
public class CodigoPostal {
    public void CP(){
        Scanner stdIn = new Scanner(System.in);
        String cp; //c.p. introducido por el usuario
        System.out.print("Introduzca código postal: ");
        cp = stdIn.nextLine();
        switch (cp.charAt(0)) {
            case '0':
                System.out.println(cp + " está en la Costa oeste.");
                break;
            case '2':
                System.out.println(cp + " está en la Costa sureste.");
                break;
            case '3':
                System.out.println(cp + " está en la Costa oeste.");
                break;
            case '4':
                System.out.println(cp + " está en la Costa suroeste.");
                break;
            case '5':
                System.out.println(cp + " está en la Costa Este.");
                break;
            case '6':
                System.out.println(cp + " está en el área del Plano Central.");
                break;
            case '7':
                System.out.println(cp + " está en el Sur.");
                break;
            case '8':
                System.out.println(cp + " está en la Costa Este.");
                break;
            case '9':
                System.out.println(cp + " está en el Oeste.");
                break;
            default:
                System.out.println(cp + " es un código postal inválido.");
        }
    }
    public static void main(String[] args) {
        CodigoPostal cp = new CodigoPostal();
        cp.CP();
    }
    
}
