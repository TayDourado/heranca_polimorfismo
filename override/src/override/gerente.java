package override;

public class gerente extends funcionario{
	double gratificacao = 15.80;
	@Override
	void calcularSalarioFinal(){
		SalFim = SalBase + ((SalBase/100)*20) + gratificacao;
		System.out.println("Salario atual:"+SalFim);
	}

	 public void setNome(String nome) { this.Nome = nome; }
	void apresentarFuncionario() {
		System.out.println("Codigo do funcionario:"+Codigo);
		System.out.println("Nome do funcionario:"+Nome);
		System.out.println("O endereço:"+Endereco);
		System.out.println("O Bairro :"+Bairro);
		System.out.println("A cidade :"+Cidade);
		System.out.println("O estado :"+uf);
		
	}
	public static void main(String[] args) {
		gerente User = new gerente();
		User.calcularSalarioFinal();
		User.setNome("Marcelo");
		User.apresentarFuncionario();

	}

}
