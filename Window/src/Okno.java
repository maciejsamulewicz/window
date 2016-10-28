
public class Okno {

	private boolean open;

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public Okno(boolean open){
		
		setOpen(open);
	}
	
	public boolean closeWindow(){
		
		return open = false;
	}
	
	public boolean openWindow(){
		
		return open = true;
	}
	
	
	
}
