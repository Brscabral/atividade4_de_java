package Menu;

public class Menu {

	private int num=1;
	
	
	public int getNum() {
		return this.num;
	}
	public void setNum(int num1) {
		this.num = num1;
	}
	
	public void mostraCardapio1() {
		System.out.println("Cachorro quente = 5 R$");
		System.out.println("Hamburguer = 15 R$");
		System.out.println("Pizza = 30 R$");
		
	}
	
	public void mostraCardapio2() {
		System.out.println("Suco de cajá = 4,00 R$");
		System.out.println("Suco de acerola = 3,50 R$");
		System.out.println("Suco de maracujá = 3,50 R$");
		
	}
	
	public void mostraCardapio3() {
		System.out.println("Doce de leite = 3,00 R$");
		System.out.println("sorvete = 5,00 R$");
		System.out.println("goiabada = 5,00 R$");
		
	}

}
