public class Motor{
	private int caballosFuerza;
	private String marca;
	private int cantCilindros;
	private int cantPistones;
	private int bujias;
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
	public int getCaballosFuerza(){
		return caballosFuerza;
	}
	publis void setCaballosFuerza(int a){
		if(a>=0){
			this.caballosFuerza=a;
		}
	}
}