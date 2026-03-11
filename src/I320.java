public class I320 extends Carro {
    
    private int potencia;
    public I320(String marca, String modelo, int ano, int numeroDePortas, int potencia) {
        super(marca, modelo, ano, numeroDePortas);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
   
    
    public String toString (){

        return "oi chae";
    }

}
