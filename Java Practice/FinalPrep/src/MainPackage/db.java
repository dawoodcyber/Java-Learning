package MainPackage;

import java.sql.*;

public class db {

    Connection con;
    ResultSet rs;
    Statement st;

    db() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/f";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();
            System.out.println("Db is connected");

        } catch (Exception e) {
            System.out.println("DB is not connnected" + e);
        }
    }

    public ResultSet getData() {
        try {
            String sql = "Select * from data;";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Error getting data" + e);
        }
        return rs;
    }

    public int sum() {
        int sum = 0;
        try {
            String sql = "Select sum(marks) from data";

            rs = st.executeQuery(sql);
            while (rs.next()) {
                sum = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println("sum" + e);
        }
        return sum;
    }

    public float avg() {
        float avg = 0.0f;
        try {
            String sql = "Select AVG(marks) from data;";

            rs = st.executeQuery(sql);
            while (rs.next()) {
                avg = rs.getFloat(1);
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return avg;
    }
    public int per() {
        int per = 0, s=0, c=0;
        try {
            String sql1 = "Select COUNT(marks) from data;";
            String sql2 = "Select SUM(marks) from data;";

            rs = st.executeQuery(sql1);
            while (rs.next()) {
                c = rs.getInt(1);
            }
            rs = st.executeQuery(sql2);
            while (rs.next()) {
                s = rs.getInt(1);
            }
            

        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return s/c;
    }

}
