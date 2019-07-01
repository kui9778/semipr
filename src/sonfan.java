import java.awt.Desktop;
import java.net.URL;

public class sonfan extends javax.swing.JFrame{
	
	public sonfan() {
		
		
		
		try {
			Desktop.getDesktop().browse(new URL("https://cafe.naver.com/sonsational9").toURI());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
