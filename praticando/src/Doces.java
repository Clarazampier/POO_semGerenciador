public class Doces extends Carnes{
    String marca;
    boolean congelado;
    double caloria;

    public Doces(String tipo, double peso, double preco, String marca, boolean congelado, double caloria) {
        super(tipo, peso, preco);
        this.marca = marca;
        this.congelado = congelado;
        this.caloria = caloria;
    }

    public Doces(double peso, double preco, double caloria) {
        super(peso, preco);
        this.caloria = caloria;
    }

    public String getMarca() {
        return marca;
    }

    public boolean getCongelado() {
        return congelado;
    }

    public double getCaloria() {
        return caloria;
    }

    public String toString() {
        return "Doces: " + "\nmarca=" + marca + ", congelado=" + congelado + ", caloria=" + caloria + ", tipo='" + tipo + ", peso=" + peso + ", preco=" + preco;
    }

    public void cobrarTaxa(){
        if(this.caloria >= 100){
            this.preco += peso/100 * 0.3;
        }
    }
}
