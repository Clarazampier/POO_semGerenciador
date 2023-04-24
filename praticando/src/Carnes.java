public class Carnes {
    String tipo;
    double peso;
    double preco;

    public Carnes(String tipo, double peso, double preco) {
        this.tipo = tipo;
        this.peso = peso;
        this.preco = preco;
    }

    public Carnes(double peso, double preco) {
        this.peso = peso;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Carnes: " + "\ntipo = " + tipo + ", peso=" + peso + ", preco=" + preco;
    }
    //aumentando preço a partir de um percentual
    public double aumentarPreco(double percent){
        return this.preco += percent/100;
    }
    //aumentando preço a partir do tipo da carne
    public double aumentarPreco(){
        if(this.tipo == "vermelha"){
            return this.preco += this.peso/100;
        }else if (this.tipo == "branca"){
            return this.preco += this.peso*0.80;
        }
        return this.preco;
    }
    //cobrando uma taxa de acordo com o preço por peso
    public void cobrarTaxa(){
        if(this.preco/this.peso > 3){
            this.preco += peso*03;
        }
    }
}