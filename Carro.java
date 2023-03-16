public class Carro{
	String color;
	int tamano;
	String marca;
	String fabricante;
	boolean tieneMotor;
	Motor f150;
	Llantas ruedas[]=new Llantas[4];
	Carro(String col, int tamano, String marc, boolean m, String fab){
		this.color=col;
		this.tamano=tamano;
		this.marca=marc;
		this.tieneMotor=m;
		this.fabricante=fab;
		if(tieneMotor==true){
			f150=new Motor(100,"f-150 Ford",4 ,4 ,1);
		}
		ruedas[0]=new Llantas("Michellini",29);
		ruedas[1]=new Llantas("Diablorrosi",29);
		ruedas[2]=new Llantas("Goodyear",29);
		ruedas[3]=new Llantas("Pirelli",29);
	}
	public void arrancar(){
		if(tieneMotor==true){
			f150.arrancar();
			ruedas[0].friccion();
			ruedas[1].friccion();
		}
	}
	public void cambiarLlanta(int llanta,String marca){
		ruedas[llanta].setMarca(marca);
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