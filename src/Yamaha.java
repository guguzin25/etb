public class Yamaha extends Moto {
    
    private String tipo;

    public Yamaha(String marca, String modelo, int ano, int cilindradas, String tipo) {
        super(marca, modelo, ano, cilindradas);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
