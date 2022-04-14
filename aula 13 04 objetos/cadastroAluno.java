import java.util.Scanner;

public class cadastroAluno {
    public static void main(String[] args) {
        Aluno alunos[] = new Aluno[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <alunos.length; i++) {
        System.out.printf("\n---- Aluno %d ----\n", i + 1);
        System.out.println("RGM: ");
        int rgm = input.nextInt();
        System.out.println("Nome: ");
        String Nome = input.next();
        System.out.println("Ano Ingresso:");
        int anoingresso = input.nextInt();
        alunos[i] = new Aluno(rgm, Nome, anoingresso);
        }

        System.out.println("\n---- Lista de Alunos ----\n");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].toString());
        }
        input.close();
    }
    
}
