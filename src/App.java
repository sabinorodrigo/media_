import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Media media = new Media();

        System.out.print("Entre com uma nota: ");
        media.nota1 = sc.nextInt();

        System.out.print("Entre com uma nota: ");
        media.nota2 = sc.nextInt();

        System.out.print("Entre com uma nota: ");
        media.nota3 = sc.nextInt();
 
        System.out.println(media.calculoMedia());
        sc.close();
    }
}
