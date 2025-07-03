import java.util.Scanner;                 //biblioteca de scanner (serve como um CIN da linguagem C no Java)

public class calculadora {
    public static void main(String[] args) {    
        int OP, Contador = 0;                                    //variável de opção e um contador
        double result;                                            //variável de resultado         
        float[] num1 = new float[20];                         //variável de número para subtração
        Scanner inputDados = new Scanner(System.in);            //cria um objeto Scanner chamado "inputdeDADOS"
        do {
            System.out.println("------Calculadora Java ------");
            System.out.println("---   1. Somar números    ---");
            System.out.println("---  2. Subtrair números  ---");
            System.out.println("--- 3.Multiplicar números ---");
            System.out.println("---  4. Dividir números   ---");
            System.out.println("--- 5. Potenciar  números ---");
            System.out.println("---       6. Sair         ---");
            System.out.println("-----------------------------");
            System.out.println("Sua opção: ");
            OP = inputDados.nextInt();
            switch (OP) {
            case 1:
                result = 0;
                Contador = 0;
                System.out.println("Quantos números serão somados?");
                int i = inputDados.nextInt();                                      //declaração da variável i que vai ser usada para delimitar a estrutura de repetição
                for (int j=0;j<i;j++) {                                              // variável J como sendo principal parâmetro do laço
                    Contador = Contador + 1;                                           //contador para detalhar 
                    System.out.println("Qual é o " + Contador + "º número?");
                    float n1 = inputDados.nextFloat();                              
                    result = result + n1;
                }
                System.out.println("Soma dos números é de: " + result);
                break;                                                               //fim case 1

            case 2:
                result = 0;
                Contador = 0;
                System.out.println("Quantos números serão subtraídos?");
                i = inputDados.nextInt();
                Contador = Contador + 1;
                System.out.println("Qual é o " + Contador + "º número?");
                num1[0] = inputDados.nextFloat();                                  //leitura do primeiro número   
                result = num1[0] - result;                                         //difícil de explicar com comentários, mas é uma solução de um erro
                for (int j=1;j<i;j++) {
                    Contador = Contador + 1;
                    System.out.println("Qual é o " + Contador + "º número?");             
                    num1[j+1] = inputDados.nextInt();                                  //leitura do resto dos números
                    result = result - num1[j+1];
                }
                System.out.println("A subtração dos números é de: " + result);       
                break;                                                                 //fim case 2

            case 3:
                result = 1;
                Contador = 0;
                System.out.println("Quantos números serão multiplicados?");
                i = inputDados.nextInt();
                for (int j=0;j<i;j++) {
                    Contador = Contador + 1;
                    System.out.println("Qual é o " + Contador + "º número?");             
                    int n1 = inputDados.nextInt();                                  
                    result = result * n1;
                }
                System.out.println("Produto dos números é de: " + result);       
                break;                                                                 //fim case 3
            
            case 4:
                result = 1.0;
                Contador = 1;
                System.out.println("Quantos números serão divididos?");
                i = inputDados.nextInt();
                System.out.println("Qual e o 1º número?");
                double n1 = inputDados.nextInt(); 
                result = n1 / result;                               //probleminha que se resolve fazendo essa primeira parte do negócio fora do laço 'for'
                for (int j=1;j<i;j++) {
                    Contador = Contador + 1;
                    System.out.println("Qual é o " + Contador + "º número?");             
                    double n2 = inputDados.nextDouble();                                  
                    result = result / n2;
                }
                System.out.println("A divisão dos números é de: " + result);       
                break;        

            default:
                break;
            }

        } while (OP!=6);

        inputDados.close();                                   //tem que fechar o Scanner pq o bglh é tchola
    }
}
