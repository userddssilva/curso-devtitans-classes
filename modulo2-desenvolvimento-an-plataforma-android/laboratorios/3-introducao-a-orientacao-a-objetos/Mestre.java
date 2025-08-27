class Mestre {
	String nome;
	int anoNascimento;
	String afiliacao;
	String posto;

	Mestre(){}

	Mestre(String nome, int anoNascimento, String afiliacao, String posto){
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.afiliacao = afiliacao;
		this.posto = posto;
	}

	public int getIdade(int anoReferencia){
		return anoReferencia - this.anoNascimento;
	}

	public boolean possuiForca(){
		return this.posto.equals("Jedi") || this.posto.equals("Sith");
	}

	public String getAnoNascimentoString() {
		return (anoNascimento > 0) ? anoNascimento+"DBY" : (-1)*anoNascimento+"ABY";
	}

	public String getDescricao(){
		return String.format("Mestre: nome=%s, anoNascimento=%s, afiliacao=%s, posto=%s, possuiForca=%b.", this.nome, this.getAnoNascimentoString(), this.afiliacao, this.posto, this.possuiForca());
	}
}
