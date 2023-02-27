package gerenciadorAplicativo;

import aplicativos.internet.AppInternet;
import aplicativos.musica.AppMusical;
import aplicativos.telefone.AppTelefone;

public class GeranciadorIphone implements AppInternet, AppMusical, AppTelefone {

    @Override
    public void conectarSafari() {
        System.out.println("Entrou no Navegador Safari ");
    }

    @Override
    public void desconectarSafari() {
        System.out.println("Saiu do Navegador Safari ");
    }

    @Override
    public void abrirAppleMusic() {
        System.out.println("Ouvindo Musica no Apple Music ");
    }

    @Override
    public void fecharAppleMusic() {
        System.out.println("Fechando o Apple Music ");
    }

    @Override
    public void abrirTelefone() {
        System.out.println("Abrindo Apliavativo Telefone ");
    }

    @Override
    public void fecharTelefone() {
        System.out.println("Fechando Apliavativo Telefone ");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo Chamada pelo Apliavativo Telefone ");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo Chamada pelo Apliavativo Telefone ");
    }
}
