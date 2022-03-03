package POO;

// Defini��o da classe:
public class Cliente { 
		/*m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
		 * 
		 */
	// Atributos da classe: 
	private String nomeDoCliente; 
	private String endereco;
	private String contato;
	
	//Construtor: duplica o local de armazenamento onde est� sendo salvo o main/argumento.
	public Cliente (String nomeDoCliente,String endereco,String contato) {
		
		this.nomeDoCliente = nomeDoCliente; // this.nomeDoCliente = 1, 
		this.endereco = endereco; // this.endereco = 2, this.setnomeDoCliente(n)
		this.contato = contato; // this.contato = 3, this.nomeDoCliente = n** // n=nome**(**nomes diferentes "n/nome)
	}
	// M�todo: vai manipular os atributos.
	public void imprimirInfo() {
		System.out.println("\n A cliente: "+nomeDoCliente+ ", mora no endere�o: "+endereco+" e o seu contato �: "+contato+".");
	}
	
	// Para gerar os getters and setters: bot�o direito, source, generate getters and setters , select all, and the generate. 
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
	

}
