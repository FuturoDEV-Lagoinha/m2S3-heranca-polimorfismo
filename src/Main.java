public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        cachorro.emitirSom("Cachorro", "latindo");

        gato.emitirSom();
        gato.emitirSom("gato");
        System.out.println(Cachorro.class.toString());
        gato.emitirSom(Gato.class.getName());
    }
}
