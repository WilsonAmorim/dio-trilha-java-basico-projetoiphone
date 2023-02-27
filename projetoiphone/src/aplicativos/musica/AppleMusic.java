package aplicativos.musica;

public class AppleMusic implements AppMusical {

    @Override
    public void abrirAppleMusic() {
        System.out.println("Abrindo o Apple Music");
    }

    @Override
    public void fecharAppleMusic() {
        System.out.println("Fechando o Apple Music");
    }

}
