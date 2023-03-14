public class Carro{
	String color;
	int tamano;
	String marca;
	boolean tieneMotor;
	Motor f150;
	Carro(String col, int tamano, String marc, boolean m){
		this.color=col;
		this.tamano=tamano;
		this.marca=marc;
		this.tieneMotor=m;
		if(tieneMotor==true){
			f150=new Motor(100,"f-150 Ford",4 ,4 ,1);
		}
	}
	public void arrancar(){
		if(tieneMotor==true){
			f150.arrancar();
		}
	}
	public void arrancar(int kilometrosAndados){
		System.out.println("Me movi los siguientes Kilometros"+kilometrosAndados);
	}
	public void arrancar(int revoluciones, int gasolina){
		System.out.println("Las revoluciones del carro son: "+revoluciones+" y la gasolina actual es "+gasolina);
	}
	public void frenar(){
		System.out.println(marca);
		System.out.println("Estoy frenando");
	}
	public void prender(){
		System.out.println(marca);
		System.out.println("Me encedi");
	}
	public String getColor(){
		return color;
	}
	public int getTamano(){
		return tamano;
	}	
	public boolean getTieneMotor(){
		return tieneMotor;
	}
}