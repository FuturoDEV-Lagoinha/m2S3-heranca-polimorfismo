public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau, miau...");
    }

    public void emitirSom(String tipoAnimal) {
        System.out.println(tipoAnimal + " está miando");
    }
}
