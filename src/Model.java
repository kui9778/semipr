

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Model {
Connection con;
   
   public void Model() throws Exception {
       con=DBcon.getConnection();
   }
   
public Soccor searchSoccor(String str)  {
   //검색
//   String key= "NAME";
   String sql="select * from vinfo where NAME= ?";
   Soccor vo=new Soccor();
   PreparedStatement ps;
//      Statement ps = con.createStatement();
   ResultSet rs;
   try {
      DBcon co = new DBcon();
      con = co.getConnection();
      ps = con.prepareStatement(sql);
      ps.setString(1, str);
        rs = ps.executeQuery();
//   ArrayList data=new ArrayList();
      while (rs.next()) {
         vo.setName(rs.getString("NAME"));
         vo.setGudan(rs.getString("GUDAN"));
         vo.setPozi(rs.getString("POZI"));
         vo.setBackN(rs.getString("BACKN"));
         vo.setZug(rs.getString("ZUG"));
         vo.setEzuc(rs.getString("EZUC"));
         vo.setSul(rs.getString("SUL"));
         vo.setImgfname(rs.getString("PIC"));
      }
      rs.close();
      ps.close();
      
   } catch (Exception e) {
      e.printStackTrace();
   }
   return vo;
}

   
   
   
   
   
   
   
   
//   while (rs.next()) {
//      ArrayList temp=new ArrayList();
//      temp.add(rs.getString("NAME"));
//      temp.add(rs.getString("GUDAN"));
//      temp.add(rs.getString("POZI"));
//      temp.add(rs.getString("BACKN"));
//      temp.add(rs.getString("ZUG"));
//      temp.add(rs.getString("EZUC"));
//      data.add(temp);//ArrayList에 ArrayList를 추가
//   }
//   rs.close();
//   ps.close();
//   
//   
//   return data;
//}
public Soccor selectbyPk(int no) throws Exception {
   //Jtable에서 클릭한 레코드의 정보를 video 타입으로 저장해서 return하는 과정
   Soccor vo=new Soccor();
   String sql="select * from vinfo where vicode="+no;
   PreparedStatement ps=con.prepareStatement(sql);
   ResultSet rs=ps.executeQuery();
   while (rs.next()) {
      vo.setGudan(rs.getString("NAME"));
      vo.setGudan(rs.getString("GUDAN"));
      vo.setPozi(rs.getString("POZI"));
      vo.setBackN(rs.getString("BACKN"));
      vo.setZug(rs.getString("ZUG"));
      vo.setEzuc(rs.getString("EZUC"));
      vo.setSul(rs.getString("SUL"));
      
   }
   rs.close();
   ps.close();
   
   return vo;
}
      
}

