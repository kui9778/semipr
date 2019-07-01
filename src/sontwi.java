import java.awt.Desktop;
import java.net.URL;

public class sontwi extends javax.swing.JFrame{
	
	public sontwi() {
		
		
		
		try {
			Desktop.getDesktop().browse(new URL("https://twitter.com/hm_sin7").toURI());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}