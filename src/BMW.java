public class BMW extends Carro{
    
    private String serie;

    public BMW(String marca, String modelo, int ano, int numeroDePortas, String serie) {
        super(marca, modelo, ano, numeroDePortas);
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

}
