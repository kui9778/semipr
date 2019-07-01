import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class callbrowser extends javax.swing.JFrame{
	
	public callbrowser() {
		
		
		
		try {
			Desktop.getDesktop().browse(new URL("https://www.instagram.com/cristiano/").toURI());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
