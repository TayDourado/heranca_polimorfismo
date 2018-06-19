package override;

public class vendedor extends gerente{

	double comissao;
	void calcularSalarioFinal(double comissao){
		SalFim = SalBase + ((SalBase/100)*comissao);
		System.out.println("Salario atual:"+SalFim);
	}
	public static void main(String[] args) {
		vendedor doing = new vendedor();
		doing.calcularSalarioFinal(2.3);
		doing.apresentarFuncionario();

	}

}
