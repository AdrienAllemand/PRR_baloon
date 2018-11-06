


public class Balloon {

	private int rayon;

	public Balloon(int rayon) {
		this.rayon = rayon;
	}
	
	public int getRayon() {
		return rayon;
	}

	public void changeSize(int change) {
    	rayon += change;
    }


}
