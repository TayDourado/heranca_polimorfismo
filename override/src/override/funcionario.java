package override;


public class funcionario extends pessoa {
	double SalBase,SalFim;
	void inserirDadosFuncionario() {
		System.out.println("Codigo do funcionario :"+Codigo);
		System.out.println("Nome do funcionario :"+Nome);
		System.out.println("O endereco:"+Endereco);
		System.out.println("O Bairro :"+Bairro);
		System.out.println("A cidade :"+Cidade);
		System.out.println("O estado :"+uf);
		
	} 
	@Override
	void Mostrar_Telefone(){
		System.out.println("O telefone:"+Telefone);
		System.out.println("O celular :"+Celular);
	}
	
	void calcularSalarioFinal(){
		SalFim = SalBase + ((SalBase/100)*10);
		System.out.println("Salario atual:"+SalFim);
	}
	public static void main(String[] args) {
		funcionario User = new funcionario();
		User.SalBase = 500;
		User.calcularSalarioFinal();
		User.inserirDadosFuncionario();
		User.Mostrar_Telefone();
		
		
	}
}
