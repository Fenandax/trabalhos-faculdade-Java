public class Biblioteca {

    public static void main(String[] args) {

        Colegiado x = new Colegiado("Lucas", "Java: como programar", 10);
        Colegiado y = new Professor("Fábio" , "Java", 10);
        
        System.out.printf("Nome colegiado: %s, Livro: %s, Tempo que ficou com o livro: %d dias ",x.getNome(), x.getNomeLivro(), x.getTempoPosse());
        System.out.printf("| Valor a pagar: %s%n", + x.divida() + " reais");

        System.out.printf("Nome professor: %s, Livro: %s, Tempo que ficou com o livro: %d dias ",y.getNome(), y.getNomeLivro(), y.getTempoPosse());
        System.out.printf("| Valor a pagar: %s%n", + y.divida() + " reais");


    }
}
