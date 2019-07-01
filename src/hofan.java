import java.awt.Desktop;
import java.net.URL;

public class hofan extends javax.swing.JFrame{
	
	public hofan() {
		
		
		
		try {
			Desktop.getDesktop().browse(new URL("https://cafe.naver.com/ronaldo4everlove").toURI());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}