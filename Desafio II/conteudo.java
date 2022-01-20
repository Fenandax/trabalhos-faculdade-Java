 
public class conteudo {

    private String conteudo;
    private String tipoArquivo;
    private String cursoCompleto;
    private String possuiCertificado;

    public conteudo (String conteudo, String tipoArquivo, String cursoCompleto, String possuiCertificado) {
        this.conteudo = conteudo;
        this.tipoArquivo = tipoArquivo;
        this.cursoCompleto = cursoCompleto;
        this.possuiCertificado = possuiCertificado;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public String getcursoCompleto() {
        return cursoCompleto;
    }

    public void setcursoCompleto(String cursoCompleto) {
        this.cursoCompleto = cursoCompleto;
    }

    public String getpossuiCertificado() {
        return possuiCertificado;
    }

    public void setpossuiCertificado(String possuiCertificado) {
        this.possuiCertificado = possuiCertificado;
    }
    
    public void adicionarConteudo(){
        System.out.println("Olá estudante, o curso de " + conteudo + tipoArquivo + " foi adicionado á nossa plataforma, obrigada pela contribução :) Avisaremos a todos que o curso " + possuiCertificado + " certificado e " + cursoCompleto + " completo.");
}
}
