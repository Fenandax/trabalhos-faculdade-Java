public class Cidade {
	
//Atributos
	int codigo;
	int quantEstudantes;
	String uf;
	String descricao;
	
//Construtor
	public Cidade(int codigo, String descricao, String uf) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.uf = uf;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public int getQuantEstudantes() {
		return quantEstudantes;
	}

	public String getUF() {
		return uf;
	}

	public void setUF(String uf) {
		this.uf = uf;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
//Método adiciona novo estudante
	public void AdicionaNovoEstudante() {
		this.quantEstudantes ++ ;
	}
	
//Método exibe dados
	public String exibeDadosCidade() {
		return "O código da cidade é " + codigo + 
				", o estado é " + uf +
				", a descrição é "+ descricao + 
				", e a quantidade de estudantes é " + quantEstudantes + "!";
	}
	
}