package override_interface;

public class funcionario extends pessoa implements usuario{
		double salBase,salFim;
		@Override
		public void mostrar_telefone(){
			 System.out.println("Celular do Funcionario:"+this.Celular+"\n"
					 +"Telefone do Funcionario:"+this.Telefone);
			 
		 }
		public void calcularSalarioFinal() {
			this.salFim = this.salBase + (this.salBase/100)*10;
			System.out.println("Sal�rio Final �:"+this.salFim);
		}
		boolean test;
		@Override
		public 
		boolean Login(String senha,String login) {
			if (senha == this.senha ) {
				System.out.println("Usuario Valido");
				return test=true;
				
			}
			else {
				System.out.println("Usuario NAO Valido");
				return test=false;
			}
			
		}
		
		
		public void ValidaLogin(boolean a) {
			a=test;
			if(a = true) {
				System.out.println("Usuario Valido");
			}
			else {
				System.out.println("Usuario N�O Valido");
			}
			
		}
}
