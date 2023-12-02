package av2;

public class Cama {
	
	private int id;
	private int codCama;
	private boolean ehBeliche;
	private String descricao;
	private String posicao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodCama() {
		return codCama;
	}
	public void setCodCama(int codCama) {
		this.codCama = codCama;
	}
	public boolean isEhBeliche() {
		return ehBeliche;
	}
	public void setEhBeliche(boolean ehBeliche) {
		this.ehBeliche = ehBeliche;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	@Override
	public String toString() {
		return "Cama [id=" + id + ", codCama=" + codCama + ", ehBeliche=" + ehBeliche + ", descricao=" + descricao
				+ ", posicao=" + posicao + "]";
	}
	
	public Cama (int id, int codCama, boolean ehBeliche, String descricao, String posicao) {
		validarInfo(id);
		this.id = id;
		this.codCama = codCama;
		this.ehBeliche = ehBeliche;
		this.descricao = descricao;
		this.posicao = posicao;
	}
	public boolean validarInfo(int id) {
		if (id > 0) {
			return true;
		}
		return false;
	}
}
