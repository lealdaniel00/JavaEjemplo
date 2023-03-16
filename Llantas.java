public class Llantas{
	String marca;
	int rin;
	int presAire;
	Llantas(String marc, int rn){
		this.marca=marc;
		this.rin=rn;
	}
	Llantas(){
	}
	public void derrapar(){
		System.out.println("estoy derrapandro");
	}
	public void friccion(){
		System.out.println("Las llantas estan en friccion con el suelo");
	}
	public void setMarca(String m){
		this.marca=m;
		System.out.println("Cambie con exito la llanta, la nueva llanta es :"+marca);
	}
}