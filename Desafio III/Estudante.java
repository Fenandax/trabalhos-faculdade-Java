public class Estudante {
	
//Atributos
	int codigo;
	String nome;
	String dataNascimento;
	String email;
	String senha;
	Cidade cidade;
	
//Construtor
	public Estudante(int codigo, String nome, String dataNascimento, String email, String senha, Cidade cidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
		this.cidade = cidade;
		
//Chamada do método novo estudante
		this.cidade.AdicionaNovoEstudante();
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setdataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
//Método exibe dados
	public String exibeDadosEstudante() {
		return "O Nome é " + getNome() +
				", a data de nascimento é " + getDataNascimento() +
				", o código do Estudante é " + getCodigo() + 
				", a Senha é " + getSenha() +
				", o email é " + getEmail() +
				", e os dados da cidade são: " + 
				cidade.exibeDadosCidade();
	}

}
