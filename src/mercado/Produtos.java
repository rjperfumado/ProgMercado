package mercado;

public class Produtos {
	
	static String carne ;
	static String frango;
	static String peixe;
	String item;
	static int quantidade;
	int valor;
	static double total;
		
	
	public String getCarne() {
		return carne;
	}
	public boolean setCarne(String carne) {
		Produtos.carne = carne;
		return false;
	}
	public String getFrango() {
		return frango;
	}
	public void setFrango(String frango) {
		Produtos.frango = frango;
	}
	public String getPeixe() {
		return peixe;
	}
	public void setPeixe(String peixe) {
		Produtos.peixe = peixe;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		Produtos.quantidade = quantidade;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(int total) {
		Produtos.total = total;
	}
	public String getItem() {
		return item;
	}
	public boolean setItem(String item) {
		this.item = item;
		return false;
	}
	
	
//	public Produtos(String carne, String frango, String peixe) {
//		
//		this.carne = carne;
//		this.frango = frango;
//		this.peixe = peixe;
//	}
		
			
}
