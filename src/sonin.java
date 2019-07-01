import java.awt.Desktop;
import java.net.URL;

public class sonin extends javax.swing.JFrame{
	
	public sonin() {
		
		
		
		try {
			Desktop.getDesktop().browse(new URL("https://www.instagram.com/hm_son7/").toURI());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}