public class Colegiado {

    public String nome;
    public String nomeLivro;
    public int tempoPosse;

    public Colegiado(String nome, String nomeLivro, int tempoPosse) {
        this.nome = nome;
        this.nomeLivro = nomeLivro;
        this.tempoPosse = tempoPosse;
    }

    public int getTempoPosse() {
        return tempoPosse;
    }

    public void setTempoPosse(int tempoPosse) {
        this.tempoPosse = tempoPosse;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double divida(){
        return tempoPosse * 0.75;
    }
}