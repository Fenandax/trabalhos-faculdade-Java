public class Professor extends Colegiado {

    public Professor(String nome, String nomeLivro, int tempoPosse) {
        super(nome, nomeLivro, tempoPosse);
    }

    public double divida(){
        return tempoPosse * 0.25;
    }
}
