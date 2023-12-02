package av2;

public class Main {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.inclusao();
		menu.listar();
		menu.excluir(2);
		menu.listar();
		menu.alterar();
		menu.listar();
	}	
}
