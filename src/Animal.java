public abstract class Animal {
    private String nome;
    private String raca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void caminhar() {
        System.out.println("Caminhando...");
    }

    public void emitirSom() {
        System.out.println("");
    }

    public void emitirSom(String tipoAnimal) {
        String acao = "";
        if(tipoAnimal.equals("Cachorro")) {
            acao = "Latindo";
        } else if(tipoAnimal.equals("Gato")) {
            acao = "Miando";
        }

        System.out.println("O " + tipoAnimal + " está " + acao);
    }

    public void emitirSom(String tipoAnimal, String acao) {
        System.out.println(tipoAnimal + " está " + acao);
    }
}
