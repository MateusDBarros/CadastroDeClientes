public class Main {
    public static void main(String[] args) {

        Registro dados[] = new Registro[100];

        int pessoas = Registro.numPessoas;
        Registro.adicionar(dados, pessoas);

        for (int i = 0; i < pessoas + 1; i++) {
            System.out.println("ID: "  + dados[pessoas].id + " Nome: " + dados[pessoas].name + " Idade: " +dados[pessoas].age);
        }

    }
}