import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.ws.handler.MessageContext.Scope;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.Font;
import java.awt.Color;

public class test extends JFrame implements ActionListener {
private JPanel contentPane;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;
   private JTextField textField_5;
   private JTextField textField_6;
   private JTextArea textArea;
   JLabel picLabel;
   ImageIcon icon;
   JTabbedPane tabbedPane;
   CardLayout card;
   Model scmodel;
   Soccor vo;
   Connection con;
   File f=null;
   String fName="";
   JButton btnNewButton,btnNewButton_1,btnNewButton_2;
   
   void fileSave(File file, String path, String name) {
      try {
         File f=new File(path);
         if (!f.exists()) {
            f.mkdirs();//∆˙¥ı ∏∏µÈ±‚
            
         }
         String filePath=path+"\\"+name;
         
         FileInputStream fis=new FileInputStream(file);
         FileOutputStream fos=new FileOutputStream(filePath);
          
         int i=0;
         byte[] buffer=new byte[1024];
         
         while ((i=fis.read(buffer,0,1024))!=-1) {
            fos.write(buffer,0,i);
         }
         fis.close();
         fos.close();
         
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }


   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               test frame = new test();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public test() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 617, 489);
      contentPane = new JPanel(null);
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      
      tabbedPane = new JTabbedPane(JTabbedPane.TOP);
      tabbedPane.setBounds(0, 0, 601, 451);
      contentPane.add(tabbedPane,card);
      
      JPanel panel = new JPanel(card);
      panel.setToolTipText("");
      tabbedPane.addTab("º±ºˆ∞Àªˆ", null, panel, null);
//      panel.setLayout(card);
      
      JLabel lblNewLabel_1 = new JLabel("\uC774\uB984\uC744 \uC785\uB825\uD558\uC138\uC694.");
      lblNewLabel_1.setForeground(Color.BLACK);
      lblNewLabel_1.setFont(new Font("±º∏≤", Font.BOLD, 15));
      lblNewLabel_1.setBounds(428, 159, 151, 23);
      panel.add(lblNewLabel_1);
      
      textField = new JTextField();
      textField.setBounds(413, 192, 156, 29);
      panel.add(textField);
      textField.setColumns(10);
      
      JLabel lblNewLabel = new JLabel("\uCD95\uAD6C\uC120\uC218 \uBC31\uACFC");
      lblNewLabel.setForeground(Color.CYAN);
      lblNewLabel.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 12));
      lblNewLabel.setBounds(22, 25, 105, 15);
      panel.add(lblNewLabel);
      
      JLabel lblNewLabel_9 = new JLabel("New label");
      lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\m019\\Desktop\\\uD1A0\uD2B8\uB118.PNG"));
      lblNewLabel_9.setBounds(0, 0, 596, 422);
      panel.add(lblNewLabel_9);
      
      JPanel panel_2 = new JPanel(card);
//      tabbedPane.addTab("New tab", null, null);
      tabbedPane.add(panel_2,"º±ºˆ¡§∫∏");
      panel_2.setLayout(card);
      
      textField_1 = new JTextField();
      textField_1.setBounds(66, 34, 145, 21);
      panel_2.add(textField_1);
      textField_1.setColumns(10);
      
      JLabel lblNewLabel_2 = new JLabel("\uC0AC\uC9C4");
      lblNewLabel_2.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.BOLD, 12));
      lblNewLabel_2.setBounds(127, 65, 37, 15);
      panel_2.add(lblNewLabel_2);
      
      JLabel lblNewLabel_3 = new JLabel("\uC18C\uC18D\uAD6C\uB2E8");
      lblNewLabel_3.setForeground(Color.RED);
      lblNewLabel_3.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 13));
      lblNewLabel_3.setBounds(315, 23, 57, 15);
      panel_2.add(lblNewLabel_3);
      
      JLabel lblNewLabel_4 = new JLabel("\uD3EC\uC9C0\uC158");
      lblNewLabel_4.setForeground(Color.RED);
      lblNewLabel_4.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 13));
      lblNewLabel_4.setBounds(315, 48, 57, 15);
      panel_2.add(lblNewLabel_4);
      
      JLabel lblNewLabel_5 = new JLabel("\uB4F1\uBC88\uD638");
      lblNewLabel_5.setForeground(Color.RED);
      lblNewLabel_5.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 13));
      lblNewLabel_5.setBounds(315, 75, 57, 15);
      panel_2.add(lblNewLabel_5);
      
      JLabel lblNewLabel_6 = new JLabel("\uC8FC\uAE09");
      lblNewLabel_6.setForeground(Color.RED);
      lblNewLabel_6.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 13));
      lblNewLabel_6.setBounds(315, 100, 57, 15);
      panel_2.add(lblNewLabel_6);
      
      JLabel lblNewLabel_7 = new JLabel("\uC774\uC801\uB8CC");
      lblNewLabel_7.setForeground(Color.RED);
      lblNewLabel_7.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 13));
      lblNewLabel_7.setBounds(315, 125, 57, 15);
      panel_2.add(lblNewLabel_7);
      
      JLabel lblNewLabel_8 = new JLabel("\uCEE4\uB9AC\uC5B4");
      lblNewLabel_8.setForeground(Color.RED);
      lblNewLabel_8.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 13));
      lblNewLabel_8.setBounds(315, 245, 57, 15);
      panel_2.add(lblNewLabel_8);
      
      textField_2 = new JTextField();
      textField_2.setBounds(408, 20, 116, 21);
      panel_2.add(textField_2);
      textField_2.setColumns(10);
      
      textField_3 = new JTextField();
      textField_3.setBounds(408, 45, 116, 21);
      panel_2.add(textField_3);
      textField_3.setColumns(10);
      
      textField_4 = new JTextField();
      textField_4.setBounds(408, 72, 116, 21);
      panel_2.add(textField_4);
      textField_4.setColumns(10);
      
      textField_5 = new JTextField();
      textField_5.setBounds(408, 97, 116, 21);
      panel_2.add(textField_5);
      textField_5.setColumns(10);
      
      textField_6 = new JTextField();
      textField_6.setBounds(408, 122, 116, 21);
      panel_2.add(textField_6);
      textField_6.setColumns(10);
      
      textArea = new JTextArea();
      textArea.setBounds(366, 150, 218, 240);
      panel_2.add(textArea);
     
      
      btnNewButton = new JButton("Instagram");
      btnNewButton.setBounds(0, 367, 97, 23);
      panel_2.add(btnNewButton);
      
      btnNewButton_1 = new JButton("Twitter");
      btnNewButton_1.setBounds(109, 367, 97, 23);
      panel_2.add(btnNewButton_1);
      
      btnNewButton_2 = new JButton("\uD32C\uCE74\uD398");
      btnNewButton_2.setBounds(218, 367, 97, 23);
      panel_2.add(btnNewButton_2);
      
      picLabel = new JLabel("");
      picLabel.setBounds(24, 84, 254, 271);
      panel_2.add(picLabel);
      
      JLabel lblNewLabel_10 = new JLabel("New label");
      lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\m019\\Desktop\\\uD1A0\uD2B8\uB118.PNG"));
      lblNewLabel_10.setBounds(0, 0, 596, 422);
      panel_2.add(lblNewLabel_10);
      
      
      
      textField.addActionListener(this);
      btnNewButton.addActionListener(this);
      btnNewButton_1.addActionListener(this);
      btnNewButton_2.addActionListener(this);
      
      
      
   }
//   public void openWebpage(URI uri) {
//	   Desktop desktop=Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
//	   if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
//	        try {
//	            desktop.browse(uri);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	    }
//   }
//   public void openWebpage(URL url) {
//	    try {
//	    	openWebpage(url.toURI());
//	    } catch (URISyntaxException e) {
//	        e.printStackTrace();
//	    }
//	}
   
   

   @Override
   public void actionPerformed(ActionEvent e) {
      Object str=e.getSource();
      scmodel = new Model();
      System.out.println("ø©±‚?"+btnNewButton);
      
      if (str==textField) {
         String str1=textField.getText();
         
         
         try {
            System.out.println(str1);
            Soccor data=scmodel.searchSoccor(str1);
            System.out.println("¿Ã∞≈æﬂ"+data.getSul());
            
            textField_1.setText(data.getName());
            textField_2.setText(data.getGudan());
            textField_3.setText(data.getPozi());
            textField_4.setText(data.getBackN());
            textField_5.setText(data.getZug());
            textField_6.setText(data.getEzuc());
            textArea.setText(data.getSul());
            icon=new ImageIcon(".\\upload\\"+data.getImgfname());
            ImageIcon newIcon;
            Image image=icon.getImage();
            image.getScaledInstance(picLabel.getWidth(),picLabel.getHeight(),0);
            int imgW=picLabel.getWidth();
          int imgH=picLabel.getHeight();
          Image img=icon.getImage();
          Image newimg=img.getScaledInstance(imgW, imgH, java.awt.Image.SCALE_SMOOTH);
          newIcon=new ImageIcon(newimg);
          picLabel.setIcon(newIcon);
          
         
         } catch (Exception e1) {
            System.out.println("main ∏ﬁº“µÂ");
         }
         tabbedPane.setSelectedIndex(1);
      }else if (textField_1.getText().equalsIgnoreCase("»£≥ØµŒ")&&str==btnNewButton) {
        	  new callbrowser()	;
          }else if (textField_1.getText().equalsIgnoreCase("»£≥ØµŒ")&&str==btnNewButton_1) {
        	  new hotwi()	;
          }else if (textField_1.getText().equalsIgnoreCase("»£≥ØµŒ")&&str==btnNewButton_2) {
        	  new hofan()	;
          }else if (textField_1.getText().equalsIgnoreCase("∏ﬁΩ√")&&str==btnNewButton) {
        	  new mein()	;
          }else if (textField_1.getText().equalsIgnoreCase("º’»ÔπŒ")&&str==btnNewButton) {
        	  new sonin()	;
          }else if (textField_1.getText().equalsIgnoreCase("º’»ÔπŒ")&&str==btnNewButton_1) {
        	  new sontwi()	;
          }else if (textField_1.getText().equalsIgnoreCase("º’»ÔπŒ")&&str==btnNewButton_2) {
        	  new sonfan()	;
          }
		}
	}
   
  
      



   
