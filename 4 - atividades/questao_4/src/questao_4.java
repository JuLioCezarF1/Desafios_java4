import java.util.Scanner;
public class questao_4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de divisões que serão realizadas: ");
        int n = sc.nextInt();
        
        
        for(int i = 0; i < n; i++){
            System.out.print("Digite o numerador: ");
            double num1 = sc.nextDouble();
            System.out.print("Digite o denominador: ");
            double num2 = sc.nextDouble();
            if (num2 == 0) {
                System.out.println("===========");
                System.out.println("Divisão impossivel");
                System.out.println("===========");
            }
            else{
                double calculo = num1 / num2;
                System.out.println("===========");
                System.out.printf("O valor da divisão é: %.2f%n", calculo);
                System.out.println("===========");
            }

        }

        sc.close();
    }
}
