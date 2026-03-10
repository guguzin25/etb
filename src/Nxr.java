public class Nxr extends Honda {
    
    private String tipoDeUso;

    

    public Nxr(String marca, String modelo, int ano, int cilindradas, String tipo, String tipoDeUso) {
        super(marca, modelo, ano, cilindradas, tipo);
        this.tipoDeUso = tipoDeUso;
    }

    public String getTipoDeUso() {
        return tipoDeUso;
    }

    public void setTipoDeUso(String tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }
    
}
