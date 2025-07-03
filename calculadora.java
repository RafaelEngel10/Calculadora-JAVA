import java.util.Scanner;                 //biblioteca de scanner (serve como um CIN da linguagem C no Java)

public class calculadora {
    public static void main(String[] args) {    
        int OP;                                                  //variável de opção            
        Scanner inputDados = new Scanner(System.in);            //cria um objeto Scanner chamado "inputdeDADOS"
        do {
            System.out.println("------Calculadora Java ------");
            System.out.println("---   1. Somar números    ---");
            System.out.println("---  2. Subtrair números  ---");
            System.out.println("--- 3.Multiplicar números ---");
            System.out.println("---  4. Dividir números   ---");
            System.out.println("---  5. Fatoriar números  ---");
            System.out.println("---       6. Sair         ---");
            System.out.println("-----------------------------");
            System.out.println("Sua opção: ");
            OP = inputDados.nextInt();
            switch (OP) {
            case 1:
                System.out.println("Quantos números serão somados?");
                int i = inputDados.nextInt();
                for (int j=0;j<i;j++) {
                    
                }
                break;
        
            default:
                break;
            }

        } while (OP!=6);

        inputDados.close();                                   //tem que fechar o Scanner pq o bglh é tchola
    }
}
