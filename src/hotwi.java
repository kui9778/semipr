import java.awt.Desktop;
import java.net.URL;

public class hotwi extends javax.swing.JFrame{
	
	public hotwi() {
		
		
		
		try {
			Desktop.getDesktop().browse(new URL("https://twitter.com/Cristiano").toURI());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
