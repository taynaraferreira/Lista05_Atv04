import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado=new Scanner (System.in);
        System.out.print("Informe um número: ");
        int numero=teclado.nextInt();
        teclado.close();
        confere(numero);
    }
    
    public static void confere(int numero){
        if(numero<=0){
            System.out.println("\nN\n");
        }else{
            System.out.println("\nP\n");
        }
    }
}