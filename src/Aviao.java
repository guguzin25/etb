public class Aviao extends Veiculo {
    
    private int numeroDePassageiros;

    public Aviao(String marca, String modelo, int ano, int numeroDePassageiros) {
        super(marca, modelo, ano);
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

}
