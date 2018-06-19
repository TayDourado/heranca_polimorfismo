package override_interface;



public abstract interface usuario {
	abstract boolean Login(String senha,String login ) ;
	

	public static void main(String[] args) {
		funcionario people = new funcionario();
		people.Login("12345","TAY");
		people.mostrar_telefone();
		people.salBase = 1200.4;
		people.calcularSalarioFinal(); 
		fornecedor barn = new fornecedor();
		barn.mostrar_telefone();
		barn.Login("12345","TAY");
		barn.dados();
		cliente human = new cliente();
		human.Login("12345", "TAY");
		human.Calcular_limiteCred();
		human.mostrar_telefone();
	}

	
}

