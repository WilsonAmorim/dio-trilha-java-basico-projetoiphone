package aplicativos.internet;

public class Internet implements AppInternet {

    @Override
    public void conectarSafari() {
        System.out.println("Conectando Safari");
    }

    @Override
    public void desconectarSafari() {
        System.out.println("Desconectando Safari");
    }

}