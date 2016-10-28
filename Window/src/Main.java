
public class Main {

	public static void main(String[] args) throws InterruptedException {

		boolean open = true;
		Pomieszczenie room = new Pomieszczenie(24);
		Okno window = new Okno(open);

		while (open == true && room.getTemperature() > -30) {

				room.getTemperature();
				
			
				if (room.getTemperature()<0) {
					
					window.closeWindow();
					System.out.println(room.decreaseTemperature());
					
				}if (room.getTemperature()>25) {
					
					window.openWindow();
					System.out.println(room.increaseTemperature());
					
				}
				
				System.out.println(room.toString());
				
				Thread.sleep(1000);
			}

	

		
			}
			
			

}
