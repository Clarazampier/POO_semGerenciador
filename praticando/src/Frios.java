public class Frios extends Carnes{
    String marca;
    String embalagem;
    boolean apimentado;

    public Frios(String tipo, double peso, double preco, String marca, String embalagem, boolean apimentado) {
        super(tipo, peso, preco);
        this.marca = marca;
        this.embalagem = embalagem;
        this.apimentado = apimentado;
    }

    public Frios(String tipo, double peso, double preco, String embalagem) {
        super(tipo, peso, preco);
        this.embalagem = embalagem;
    }

    public String getMarca() {
        return marca;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public boolean getApimentado() {
        return apimentado;
    }

    public String toString() {
        return "Frios:" + "\nmarca=" + marca + ", embalagem=" + embalagem + ", apimentado=" + apimentado + ", tipo=" + tipo + ", peso=" + peso + ", preco=" + preco;
    }
    public void cobrarTaxa(){
        if(this.embalagem == "plastico"){
            this.preco *= 1.77;
        }
    }
}