package Menu;

public class Main {
	public static void main(String[] args){
		Menu menu = new Menu();
		//menu.setNum(1);
		menu.setNum(2);
		//menu.setNum(3);
		int retorno = menu.getNum();
		
		
		System.out.println("----------MENU----------");
		System.out.println("----------Lanches (1)");
		System.out.println("----------Sucos (2)");
		System.out.println("----------Sobremesas (3)");
		if(retorno == 1) {
			menu.mostraCardapio1();
		}
		if(retorno == 2) {
			menu.mostraCardapio2();
		}
		if(retorno == 3) {
			menu.mostraCardapio3();
		}
	}

}
