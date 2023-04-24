public class Main {
    public static void main(String[] args) {
        //criando objeto da carne e instanciando
    Carnes carne1 = new Carnes("branca", 2.700, 30);
    System.out.println("Aumentando preço por tipo: " + carne1.aumentarPreco());
    System.out.println(carne1.aumentarPreco(47));
    carne1.cobrarTaxa();
        Carnes carne2 = new Carnes(1.700, 20);
        System.out.println("Aumentando preço por tipo: " + carne2.aumentarPreco());
        System.out.println(carne2.aumentarPreco(47));
        carne2.cobrarTaxa();


        //criando objeto do frios e instanciando
    Frios frios1 = new Frios("Queijo", 0.300, 13, "Seara", "plastico", false);
    System.out.println("Preço do frios: " + frios1.getPreco());
    frios1.cobrarTaxa();
    System.out.println("Preço novo: " + frios1.getPreco());

        Frios frios2 = new Frios("Presunto", 0.400, 15, "plastico");
        System.out.println("Preço do frios: " + frios2.getPreco());
        frios1.cobrarTaxa();
        System.out.println("Preço novo: " + frios2.getPreco());

        //criando objeto do doce e instanciando
        Doces doce1 = new Doces("Torta", 0.200, 9, "Swift", true, 100);
    System.out.println("Preço do doce: " + doce1.getPreco());
    doce1.cobrarTaxa();
    System.out.println("Preço novo: " + doce1.getPreco());
    }
}