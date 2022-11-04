package displayer;

public class LedDisplayer {

   protected final int width ;
   protected String message ;
   protected int currentIndex ;
   protected String onScreen ;
   
   // A displayer is initially defined by the width of its screen, the message being empty.
   public LedDisplayer(int width) {
       this.width = width ;
       this.message = "" ;
   }
   
   /** get the (full) message of this displayer
    * @return the (full) message of this displayer
    */
   public String getMessage() {
       return this.message ;
   }
   /**
    * set the new message to display , a call to textOnScreen() is now blank until next shift()
    * @param message the new message
   */
   public void setMessage(String message) {      
       this.message = message ;
       this.currentIndex = -1;
       
       // Au debut, on affiche une ligne vide
       String s = "" ;
       for (int i = 0 ; i < width ; i++) {
    	   s = s + " " ;
       }
       this.onScreen = s ;
   }
   

   /**
    * @return the screen width
   */
   public int getScreenWidth() {
       return this.width ;
   }
   
   /**  shift message by one character  
    * 
   */
   public void shift() {
	   this.currentIndex = (this.currentIndex + 1) % this.message.length() ;
	   this.onScreen = this.onScreen.substring(1) + this.message.charAt(this.currentIndex) ;
   }

   /**
    * return the text that appears on the screen ,
    * it is always composed of getScreenWidth() characters
    * @return the text that appears on the screen 
   */
   public String textOnScreen() {
       return this.onScreen ;
   }

}
