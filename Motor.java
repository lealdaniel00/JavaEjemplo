public class Motor{
	int caballosFuerza;
	String marca;
	int cantCilindros;
	int cantPistones;
	int bujias;
	Motor(int a, String b, int c, int d, int e){
		this.caballosFuerza=a;
		this.marca = b;
		this.cantCilindros=c;
		this.cantPistones=d;
		this.bujias=e;
	}
	public void arrancar(){
		System.out.println("El motor ha arrancado");
	}
}