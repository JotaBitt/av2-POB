package av2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	ArrayList<Cama> camas = new ArrayList<Cama>();
	ArrayList<reserva> reservas = new ArrayList<reserva>();
	Scanner sc = new Scanner(System.in);
	String exibir;

	public void inclusao() {
		
		clientes.add(new Cliente(1, "Joao", "Rua3", 12334700, "Bra", "14785236901", "j@gmail", "12/03/2000", 23654));
		clientes.add(new Cliente(2, "Ana", "Rua2", 12334701, "Bra", "14785236921", "a@gmail", "12/03/2020", 23444));
		clientes.add(new Cliente(3, "Maria", "Rua1", 12334702, "Bra", "14785236931", "m@gmail", "12/03/2010", 23554));
		
		quartos.add(new Quarto(1, "suíte master", 3, true, "O melhor quarto"));
		quartos.add(new Quarto(2, "Quarto simples", 2, false, "O quarto mais barato"));
		quartos.add(new Quarto(3, "suíte normal", 1, true, "O quarto básico"));
		
		camas.add(new Cama(1, 1, true, "Cama beliche simples", "perto da janela"));
		camas.add(new Cama(2, 2, false, "Cama casal", "embaixo do ventilador"));
		camas.add(new Cama(3, 3, false, "Cama de solteiro", "perto do banheiro"));
		
		reservas.add(new reserva(1, 1, 1, 1, "11/02/1111", "30/07/1999"));
		reservas.add(new reserva(2, 2, 2, 2, "14/04/1111", "20/09/1995"));
		reservas.add(new reserva(3, 3, 3, 3, "21/06/1111", "05/02/1993"));
		
	}
	
	public void listar() {
		System.out.println("");
		for (Cliente cli: clientes) {
			exibir = cli.toString();
			System.out.println(exibir);
		}
		System.out.println("");
		for (Quarto quarto: quartos) {
			exibir = quarto.toString();
			System.out.println(exibir);
		}
		System.out.println("");
		for (Cama cama: camas) {
			exibir = cama.toString();
			System.out.println(exibir);
		}
		System.out.println("");
		for (reserva reserv: reservas) {
			exibir = reserv.toString(); 
			System.out.println(exibir);
		}
	}
	
	public void excluir(int id) {
		
		for (Cliente cli: clientes) {
			if (cli.getId() == id) {
				clientes.remove(id);
			}
		}
		for (Quarto quarto: quartos) {
			if (quarto.getId() == id) {
				quartos.remove(id);
			}
		}
		for (Cama cama: camas) {
			if (cama.getId() == id) {
				camas.remove(id);
			}
		}
		for (reserva reserv: reservas) {
			if (reserv.getId() == id) {
				reservas.remove(id);
			}
		}
	}
	
	public void alterar () {
		
		for (Cliente cli: clientes) {
			if (cli.getId() == 1) {
				cli.setCpf("01450021701");
				cli.setDataNasc("17/11/1698");
				cli.setEmail("@email.com");
				cli.setEndereco("Rua40");
				cli.setNome("Cabeção");
				cli.setPais("EUA");
				cli.setPassaporte(2587964);
				cli.setPostCode(20117863);
			}
		}
		for (Quarto quarto: quartos) {
			if (quarto.getId() == 1) {
				quarto.setDescricao("Quarto Novo");
				quarto.setNomeQuarto("Quarto supremo");
				quarto.setQtdeCamas(4);
				quarto.setTemBanheiro(false);
			}
		}
		for (Cama cama: camas) {
			if (cama.getId() == 1) {
				cama.setCodCama(11);
				cama.setEhBeliche(false);
				cama.setDescricao("Cama confortável");
				cama.setPosicao("longe da porta");
			}
		}
		for (reserva reserv: reservas) {
			if (reserv.getId() == 1) {
				reserv.setDataEntrada("30/11/2000");
				reserv.setDataSaida("02/12/2000");
				reserv.setIdCama(11);
				reserv.setIdCliente(11);
				reserv.setIdQuarto(11);
			}
		}
		System.out.println("Vaalores alterados!");
	}
	
}




