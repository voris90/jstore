package uz.micros.jstore.util;

import uz.micros.jstore.entity.blog.Post;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DbManager {
    private static Connection connect(){
        System.out.println("JDBC Connection Test");

        Connection res = null;

        try {
            //Class.forName("org.postgresql.Driver");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
             res = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/jstore",
                    "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }

    public static List<Map<String, Object>> runQuery(String query) {
        Connection conn = connect();

        List<Map<String, Object>> list = new ArrayList<>();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);


            list = parseList2(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }



    private static List<Map<String, Object>> parseList2(ResultSet rs) throws SQLException {
        List<Map<String, Object>> res = new ArrayList<>();

        ResultSetMetaData meta = rs.getMetaData();

        int cols = meta.getColumnCount();

        while (rs.next()){
            Map<String, Object> columns = new LinkedHashMap<>();

            for (int  i =1; i<= cols; i++)
                columns.put(meta.getColumnLabel(i), rs.getObject(i));

            res.add(columns);

        }

        return res;
    }
}
