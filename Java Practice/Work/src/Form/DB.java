
package Form;
import java.sql.*;
public class DB {
    Connection con;
    Statement st;
    ResultSet rs;
    DB()
    {
        String url = "jdbc:mysql://localhost:3306/work";
        String user="root";
        String pass="";
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url,user,pass);
        st = con.createStatement();
        System.out.println("DB is connected");
        }catch (Exception e)
        {
            System.out.println(e);
            System.out.println("DB is not connected");
        }
    }
    public void addData(String n, String e, String contact, String g,String city, String course)
    {
        String sql = "insert into main(FullName,Email,Contact,Gender,City,Course)values(\""+n+"\",\""+e+"\",\""+contact+"\",\""+g+"\",\""+city+"\",\""+course+"\")";
        try{
        st.executeUpdate(sql);}catch(Exception ex)
            
        {
            System.out.println(ex);
        }
        
    }
    public ResultSet selectAll()
    {
    
        String sql = "select * from main";
        try{
         rs= st.executeQuery(sql);
       
        }catch(Exception ess){
            System.out.println(ess);
        }
        return rs;
    }
    public void delSelected(Object x)
    {
        String sql = "Delete from main where id ="+x;
        try{
            st.executeUpdate(sql);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
