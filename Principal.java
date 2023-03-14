import java.util.Scanner;
public class Principal{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el color del carro");
		String color = in.nextLine();
		System.out.println("Ingrese el tamaño del carro");
		int tam = in.nextInt();
		System.out.println("Ingrese el fabricante del carro");
		in.nextLine();
		String fab = in.nextLine();
		Carro chevroletSail = new Carro(color,tam,fab,true);
		System.out.println(chevroletSail.getColor());
		System.out.println(chevroletSail.getTamano());
		chevroletSail.arrancar();
	}
}