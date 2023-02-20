package polimorfismoexerciciofixacao;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolimorfismoExercicioFixacao {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List<Contribuinte> cont = new ArrayList<>();
        
        byte menu = 9;
        
        while(menu != 0){
            System.out.println("\n\n\t___Cadastrar impostos___");
            System.out.println("\n1 - Pessoa Fisica \n2 - Pessoa Juridica \n3 - Calcular \n0 - Sair");
                System.out.print("\nEscolha a opção: ");
                menu = sc.nextByte();
            
            if(menu == 0){
                break;
            }
            
            if(menu == 1 || menu == 2){
            
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();            
                System.out.print("Renda Anual: R$ ");
                double renda = sc.nextDouble();
            
            if(menu == 1){
                System.out.print("Gastos com Saúde: R$ ");
                double gasto = sc.nextDouble();
            cont.add(new PessoaFisica(gasto, nome, renda));
            }
            
            if(menu == 2){
                System.out.print("Numero de Funcionarios: ");
                int func = sc.nextInt();
            cont.add(new PessoaJuridica(func, nome, renda));
            }
            }
            
            if(menu == 3){
                System.out.println("\n\n\t___LISTA___\n");
                    for(Contribuinte a : cont){
                        System.out.println(a.nome + ": Total a pagar R$ " + String.format("%.2f", a.imposto()));
                    }
            }
            
        }//FIM DO WHILE
        
        System.out.println("Obrigado!!!");  
        
        sc.close();
    }
    
}
