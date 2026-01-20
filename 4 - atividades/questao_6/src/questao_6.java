import java.util.Scanner;
public class Questao_6 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o número para descobrir seus dividendos: ");
    
    int n = sc.nextInt();

    for(int i = 1; i <=n; i++){
        if (n % i == 0) {
            System.out.print(i + ",");
        }
    }
    sc.close();
    }
}

