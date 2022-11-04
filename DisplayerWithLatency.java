package displayer;

public class DisplayerWithLatency extends LedDisplayer {
	
	protected int latency ;
	
	// builds a displayer with a latency time.
	
	public DisplayerWithLatency(int width, int latency) {
		super(width) ;
		this.latency = latency ;
	}
	
	/**
	 * access to the value of the latency.
	 * @return the latency
	 */
	public int getLatency() {
		return this.getLatency();
	}
	
	/**
	 * set the new message to display
	 * @param the message to display
	 */
	public void setMessage(String message) {      
		
		String spaces = "" ;
		for(int i = 0 ; i < this.latency ; i++) {
			spaces  += " " ;
		}
		String messageWithLatency = message + spaces ;
		super.setMessage(messageWithLatency);
	}
	
	/**
	 * get the (full) message of this displayer
	 * @return the (full) message of this displayer
	 */
	public String getMessage() {
		 return this.message.substring(0 , this.message.length() - this.latency) ;
	}

}
