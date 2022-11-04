package displayer;

public class SpeedDisplayer extends DisplayerWithLatency {
	
	private int speed ;
	
	/**
	 * builds a displayer with given latency and speed
	 */
	
	public SpeedDisplayer(int width, int latency, int speed) {
		super (width, latency) ;
		this.speed = speed ;
	}
	
	/**
	 * access to the displayer' speed
	 * @return the speed
	 */
	public int getSpeed() {
		return this.speed ;
	}
	
	/**
	 * the number of shifts performed at each top can be set
	 */
	public void shift() {
		for(int i = 0; i < this.speed; i++ ) {
			super.shift();
		}
	}
	
}
