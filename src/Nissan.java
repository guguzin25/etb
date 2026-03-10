public class Nissan extends Carro {
    

    private String modeloEsportivo;

    public Nissan(String marca, String modelo, int ano, int numeroDePortas, String modeloEsportivo) {
        super(marca, modelo, ano, numeroDePortas);
        this.modeloEsportivo = modeloEsportivo;
    }

    public String getModeloEsportivo() {
        return modeloEsportivo;
    }

    public void setModeloEsportivo(String modeloEsportivo) {
        this.modeloEsportivo = modeloEsportivo;
    }

    
}
