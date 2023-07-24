import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grupos {
    public static void main(String[] args) throws Exception {

        System.out.println("Digite o nome seguido do sexo da pessoa (M ou F) e pressione o Enter. Exemplo: Mikaela-F. Digite 'fim' assim que concluir.");
        Scanner ler = new Scanner(System.in);

        List<String> pessoas = new ArrayList<>();
        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();
        
        while (true) {
            String resposta = ler.nextLine();
            if (resposta.equalsIgnoreCase("fim")) {
            break;
            }
            pessoas.add(resposta);
        }
        for (String pessoa : pessoas)  {
            String[] partes = pessoa.split("-");
            if (partes.length == 2) {
                String nome = partes[0];
                String sexo = partes[1].toUpperCase();
                if (sexo.equals("M")) {
                    homens.add(nome);
                } else if (sexo.equals("F")) {
                    mulheres.add(nome);
                } 
            }           
        }
        System.out.println("Grupo mulheres: " + mulheres.toString());
        System.out.println("Grupo homens: " + homens.toString());
    }   
}
