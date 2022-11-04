package displayer;

public class LeftRightDisplayer extends LedDisplayer {
	
	/**
	 * builds "simple" displayer that can display and scroll the message from left to right
	 */
	public LeftRightDisplayer(int width) {
		super(width) ;
	}
	
	/**
	 * shift the message from left to right
	 */
	public void shift() {
		this.currentIndex = (this.currentIndex + 1) % this.message.length() ;
		this.onScreen = this.message.charAt(this.currentIndex) + this.onScreen.substring(0, this.width - 1) ;
	}
	
}
