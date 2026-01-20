import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            int soma = i;
            int quadrado1 = i * soma;
            int quadrado2 = soma * quadrado1;
            System.out.printf("%d %d %d%n", soma, quadrado1, quadrado2);
            
        }

        sc.close();
    }
}
