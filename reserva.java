package av2;

import java.util.Date;
import java.util.Scanner;

public class reserva {
	private int id;
	private int idQuarto;
	private int idCama;
	private int idCliente;
	private String dataSaida;
	private String dataEntrada;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdQuarto() {
		return idQuarto;
	}
	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}
	public int getIdCama() {
		return idCama;
	}
	public void setIdCama(int idCama) {
		this.idCama = idCama;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	public reserva(int id, int idQuarto, int idCama, int idCliente, String dataSaida, String dataEntrada) {
		validarInfo(id);
		this.id = id;
		this.idQuarto = idQuarto;
		this.idCama = idCama;
		this.idCliente = idCliente;
		this.dataSaida = dataSaida;
		this.dataEntrada = dataEntrada;
	}
	
	@Override
	public String toString() {
		return "reserva [id=" + id + ", idQuarto=" + idQuarto + ", idCama=" + idCama + ", idCliente=" + idCliente
				+ ", dataSaida=" + dataSaida + ", dataEntrada=" + dataEntrada + "]";
	}
	
	public boolean validarInfo(int id) {
		if (id > 0) {
			return true;
		}
		return false;
	}
}
