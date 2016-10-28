
public class Pomieszczenie {

	private int temperature;
	
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public Pomieszczenie(int temperature){
		
		setTemperature(temperature);
	}
	
	public int decreaseTemperature(){
		
		return temperature = temperature-1;
	}
	
	public int increaseTemperature(){
		
		return temperature = temperature+1;
	}
	@Override
	public String toString() {
		return temperature + " ";
	}
	
	
}
