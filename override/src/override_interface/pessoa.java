package override_interface;

public class pessoa {
		int idade;
		public String Nome= "Tayna";
		 public String Codigo= "01";
		 public String Endereco= "Rua Ambua";
		 public String Bairro= "Itaim Paulista";
		 public String Cidade= "Sao Paulo";
		 public String uf= "SP";
		 public String Telefone= "(11)0000-0000";
		 public String Celular= "(11)90000-0000";
		 public String Login= "SAM";
		 public String senha= "12345";
		 public String tipoUsuario;
		 
		 public void mostrar_telefone(){
			 System.out.println("Celular:"+this.Celular);
			 System.out.println("Telefone:"+this.Telefone);
		 }
		
}
