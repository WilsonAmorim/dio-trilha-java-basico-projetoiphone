import aplicativos.internet.AppInternet;
import aplicativos.musica.AppMusical;
import aplicativos.telefone.AppTelefone;
import gerenciadorAplicativo.GeranciadorIphone;

public class IPhone {
    public static void main(String[] args) {
        GeranciadorIphone iphone = new GeranciadorIphone();
        AppInternet appInternet = iphone;
        AppMusical appleMusic = iphone;
        AppTelefone appTelefone = iphone;

        appTelefone.abrirTelefone();
        appTelefone.fazerChamada();
        appTelefone.fecharTelefone();

    }
}
