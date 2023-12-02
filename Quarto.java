package av2;

public class Quarto {
	private int id;
	private String nomeQuarto;
	private int qtdeCamas;
	private boolean temBanheiro;
	private String descricao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeQuarto() {
		return nomeQuarto;
	}
	public void setNomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}
	public int getQtdeCamas() {
		return qtdeCamas;
	}
	public void setQtdeCamas(int qtdeCamas) {
		this.qtdeCamas = qtdeCamas;
	}
	public boolean isTemBanheiro() {
		return temBanheiro;
	}
	public void setTemBanheiro(boolean temBanheiro) {
		this.temBanheiro = temBanheiro;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Quarto [id=" + id + ", nomeQuarto=" + nomeQuarto + ", qtdeCamas=" + qtdeCamas + ", temBanheiro="
				+ temBanheiro + ", descricao=" + descricao + "]";
	}
	public Quarto(int id, String nomeQuarto, int qtdeCamas, boolean temBanheiro, String descricao) {
		validarInfo(id);
		this.id = id;
		this.nomeQuarto = nomeQuarto;
		this.qtdeCamas = qtdeCamas;
		this.temBanheiro = temBanheiro;
		this.descricao = descricao;
	}
	public boolean validarInfo(int id) {
		if (id > 0) {
			return true;
		}
		return false;
	}
	
}
