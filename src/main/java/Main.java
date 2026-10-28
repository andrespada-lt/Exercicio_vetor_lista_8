import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int menu,cadastrar,listar,consultar,sair,pornomen,porano,sairmenu;
        int idades[] = new int[100];
        String nomes[] = new String[100];
        int n=0;
        int opçao1;
        do{
            System.out.println("sistema da escola");
            System.out.println("1- cadastro de aluno");
            System.out.println("2- lista de aluno");
            System.out.println("3- consultar aluno");
            System.out.println("4-sair");
            opçao1= Integer.parseInt(JOptionPane.showInputDialog("digite um opção"));
            switch(opçao1){
                case 1:
                System.out.println("cadasro de conta");
                if(n<100){
                    String nome = JOptionPane.showInputDialog("digite um nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("digite uma idade: "));
                    nomes[n] = nome;
                    idades[n] = idade;
                    n = n+1;
                    }else{
                        System.out.println("cadastro cheio");
                    }
                break;
                case 2:
                System.out.println("lista de aluno");
                for(int i=0; i<n; i++){
                    System.out.println("nome: "+ nomes[i]+" idade: "+idades[i]);
                }
                break;
                case 3:
                System.out.println("consultar aluno");
                int opçao2;
                do{
                    System.out.println("1- Por nome");
                    System.out.println("2- Por nome");
                    System.out.println("3- Sair da consulta");
                    opçao2= Integer.parseInt(JOptionPane.showInputDialog("digite um opção"));
                    switch(opçao2){
                    case 1:
                    System.out.println("consultar por nome");
                    break;
                    case 2:
                    System.out.println("consultar por idade");
                    break;
                    case 3:
                    System.out.println("sair da cnsulta");
                    break;
                    case 4:
                    System.out.println("opção invalida");
                    break;
                    }
                }while(opçao2 !=3);   
                break;
                case 4:
                System.out.println("sair do programa");
                break;
                case 5:
                System.out.println("opção invalida");
                break;
            }
        }while(opçao1 != 4);
    }
}
