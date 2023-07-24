import java.util.Scanner;
import java.util.*;

public class Ordenar {
    public static void main(String [] args){
        System.out.println("Digite quantos nomes quiser! Siga a regra: digitar 1 nome e pressionar Enter (Quando concluir digite a palavra 'ordenar')");
        
        List<String>nomes = new ArrayList<>();
        Scanner ler = new Scanner(System.in);

        while(true) {
        String nome = ler.nextLine();
        if (nome.equalsIgnoreCase("ordenar")) {
            break;
        }
        nomes.add(nome);
        }
        Collections.sort(nomes);
        System.out.println("Lista de nomes em ordem alfabética ");
        System.out.println(nomes);
    }
}
