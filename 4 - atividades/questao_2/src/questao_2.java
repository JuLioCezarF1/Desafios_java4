import java.util.Scanner;
public class questao_2 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de valores que são inseridos: ");
        int n = sc.nextInt();
        
        int in = 0;
        int out = 0;
        
       
        for(int i= 0; i < n; i++){
            System.out.print("Insira novamente outro valor: ");
			int x = sc.nextInt();
            if(x >= 10 && x <=20){
                in += 1;
            }
            else{
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
       
        sc.close();
    }
}
