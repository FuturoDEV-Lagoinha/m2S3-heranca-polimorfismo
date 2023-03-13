public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("au au...");
    }

    @Override
    public void emitirSom(String tipoAnimal, String acao) {
        super.emitirSom(tipoAnimal, acao);
    }
}
