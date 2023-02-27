package aplicativos.telefone;

public class CIphone implements AppTelefone {

    public void abrirTelefone() {
        System.out.println("Abrindo o Aplicativo");
    }

    public void fecharTelefone() {
        System.out.println("Fechando o Aplicativo");
    }

    public void fazerChamada() {
        System.out.println("Fazendo Chamada pelo Aplicativo");
    }

    public void receberChamada() {
        System.out.println("Recebendo chamada pelo Aplicativo");
    }

}