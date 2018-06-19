package override_interface;

public class cliente extends pessoa implements usuario {
		double LimiteCred = 2000.0;
		@Override
		 public void mostrar_telefone(){
			 System.out.println("Celular do Cliente:"+this.Celular);
			 System.out.println("Telefone do cliente:"+this.Telefone);
		 }
		public double Calcular_limiteCred() {
			return LimiteCred;
		}
		boolean test;
		public boolean Login(String senha,String login) {
			if (senha == this.senha ) {
				System.out.println("Usuario Valido");
				return test=true;
				
			}
			else {
				System.out.println("Usuario NAO Valido");
				return test=false;
			}
			
		}
}
