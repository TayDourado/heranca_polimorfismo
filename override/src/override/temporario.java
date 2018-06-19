package override;

public class temporario extends gerente{
	
void calcularSalarioFinal(int d){
	SalFim = SalBase + ((SalBase/100)*d);
	System.out.println("Salario atual:"+SalFim);
}
	public static void main(String[] args) {
	temporario dois = new temporario();
	dois.apresentarFuncionario();
	dois.inserirDadosFuncionario();
	boolean comissao = false;
	if(comissao == true) {
		int d=10;
		dois.calcularSalarioFinal(d);
	}
	else {
		int d=3;
		dois.calcularSalarioFinal(d);
	}
	

	}

}
