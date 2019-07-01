import java.awt.Desktop;
import java.net.URL;

public class mein extends javax.swing.JFrame{
	
	public mein() {
		
		
		
		try {
			Desktop.getDesktop().browse(new URL("https://www.instagram.com/leomessi/").toURI());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}