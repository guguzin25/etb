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
    

    public String toString (){

        return "\nMotoca vrum vrum!"+
               "\nMarca :"+getMarca()+
               "\nmodelo :"+getModelo()+
               "\nano da motoca :"+getAno()+
               "\ncilindradas :"+getCilindradas()+
               "\ntipo da moto (asfalto/trilha) :"+getTipoDeUso();

    }

}
