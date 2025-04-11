package OrtegaMedrano;
public class Ejercicio21 {
public static void main(String[] args) throws InterruptedException {

	int bateria = 100;
	while (bateria > 0) {
		System.out.println("Bateria: "+bateria+"%");
		
		Thread.sleep(20);
		
		bateria--;
		if (bateria == 20) {
			System.out.println("Bateria baja");
			Thread.sleep(1000);
		}
	}

        System.out.println("Bateria agotada");

}
}
