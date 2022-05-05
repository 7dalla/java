import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[6];

        pessoas[0] = new Pessoa("Felipe", 57, 'M', 90, 100, 80, 30, 70);
        pessoas[1] = new Pessoa("Maria", 45, 'F', 50, 70, 100, 50, 90);
        pessoas[2] = new Pessoa("Cristina", 30, 'F', 50, 20, 30, 70, 30);
        pessoas[3] = new Pessoa("Leonardo", 32, 'M', 80, 10, 60, 80, 50);
        pessoas[4] = new Pessoa("João", 27, 'M', 100, 30, 50, 100, 10);
        pessoas[5] = new Pessoa("Jéssica", 45, 'F', 85, 60, 70, 50, 60);

        Pessoa pessoaLida = new Pessoa();
        Scanner teclado = new Scanner(System.in);

        // Inicio do passo 2
        String resposta = null;
        do {
            System.out.println("Nome:");
            pessoaLida.setNome(teclado.next());

            do {
                System.out.println("Idade (maior ou igual a 18):");
                pessoaLida.setIdade(teclado.nextInt());
            } while (pessoaLida.getIdade() < 18);

            do {
                System.out.println("Gênero (deve ser M ou F):");
                pessoaLida.setGenero(teclado.next().charAt(0));
            } while (pessoaLida.getGenero() != 'M' && pessoaLida.getGenero() != 'F');

            do {
                System.out.println("Gosta de viajar (deve ser entre 0 e 100):");
                pessoaLida.setGostaViajar(teclado.nextInt());
            } while (pessoaLida.getGostaViajar() < 0 || pessoaLida.getGostaViajar() > 100);

            do {
                System.out.println("Gosta de cozinhar (deve ser entre 0 e 100):");
                pessoaLida.setGostaCozinhar(teclado.nextInt());
            } while (pessoaLida.getGostaCozinhar() < 0 || pessoaLida.getGostaCozinhar() > 100);

            do {
                System.out.println("Gosta de cinema (deve ser entre 0 e 100):");
                pessoaLida.setGostaCinema(teclado.nextInt());
            } while (pessoaLida.getGostaCinema() < 0 || pessoaLida.getGostaCinema() > 100);

            do {
                System.out.println("Gosta de balada (deve ser entre 0 e 100):");
                pessoaLida.setGostaBalada(teclado.nextInt());
            } while (pessoaLida.getGostaBalada() < 0 || pessoaLida.getGostaBalada() > 100);

            do {
                System.out.println("Gosta de ficar em casa (deve ser entre 0 e 100):");
                pessoaLida.setGostaFicarEmCasa(teclado.nextInt());
            } while (pessoaLida.getGostaFicarEmCasa() < 0 || pessoaLida.getGostaFicarEmCasa() > 100);


            double ultimaMenorDistancia = Double.MAX_VALUE;
            Pessoa pessoaMaisCompativel = null;
            for (int i = 0; i < pessoas.length; i++) {
                if (pessoas[i].getGenero() != pessoaLida.getGenero()) {
                    if (pessoas[i].calcularCompatibilidade(pessoaLida) < ultimaMenorDistancia) {
                        ultimaMenorDistancia = pessoas[i].calcularCompatibilidade(pessoaLida);
                        pessoaMaisCompativel = pessoas[i];
                    }
                }
            }
            System.out.printf("A pessoa mais compatível com %s é %s\n", pessoaLida.getNome(), pessoaMaisCompativel.getNome());
            System.out.printf("Dados da pessoa informada: \n%s\nDados da pessoa mais compatível:\n%s", pessoaLida, pessoaMaisCompativel);
                        
            do {
                System.out.println("\nDeseja continuar (Sim ou Nao)");
                resposta = teclado.next();
            } while (!resposta.equals("Sim") && !resposta.equals("Nao"));

        } while(resposta.equals("Sim"));

        teclado.close();
    }
}
