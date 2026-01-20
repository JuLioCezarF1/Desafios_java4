import java.util.Scanner;
public class questao_1 {
    public static void main(String[] args) throws Exception {
    System.out.print("Digite um número para saber os ímpares em seu intervalo: ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    for(int i = 0; i < x; i++){
        if (i % 2 != 0) {
            System.out.println(i);
        }
    }

    sc.close();
    }
}
