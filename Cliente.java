package av2;

public class Cliente {
	
	private int id;
	private String nome;
	private String endereco;
	private int postCode;
	private String pais;
	private String cpf;
	private String email;
	private String dataNasc;
	private float passaporte;
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(float passaporte) {
		this.passaporte = passaporte;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", postCode=" + postCode + ", pais="
				+ pais + ", cpf=" + cpf + ", email=" + email + ", dataNasc=" + dataNasc + ", passaporte=" + passaporte
				+ "]";
	}
	
	public Cliente(int id, String nome, String endereco, int postCode, String pais, String cpf, String email,
			String dataNasc, float passaporte) {
		validarInfo(id);
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.postCode = postCode;
		this.pais = pais;
		this.cpf = cpf;
		this.email = email;
		this.dataNasc = dataNasc;
		this.passaporte = passaporte;
	}
	public boolean validarInfo(int id) {
		if (id > 0) {
			return true;
			
		}
		return false;
	}
}
