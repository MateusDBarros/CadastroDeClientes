import java.util.Scanner;
public class Registro {
    String name;
    int age;
    int id;
    public static int numPessoas = 0;


    private static Scanner scanner = new Scanner(System.in);

    public static void adicionar(Registro dados[], int numPessoas) {
        if (numPessoas < dados.length) {
            dados[numPessoas] = new Registro();
            System.out.printf("Digite um nome para cadastro: ");
            dados[numPessoas].name = scanner.next();
            System.out.printf("Digite a idade de " + dados[numPessoas].name + ": ");
            dados[numPessoas].age = scanner.nextInt();
            dados[numPessoas].id = numPessoas + 1;
            Registro.numPessoas++;
            System.out.println("Cadastro Registrado com sucesso!");
        }
        else
            System.out.println("Impossivel adicionar mais registros!");
    }

    public static void exibir(Registro dados[], int numPessoas) {
        if (numPessoas == 0) {
            System.out.println("Nenhum cadastro registrado!");
            return;
        }

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("ID:\t" + dados[i].id);
            System.out.println("Nome:\t" + dados[i].name);
            System.out.println("Idade:\t" + dados[i].age);
            System.out.println();

        }
    }
}
