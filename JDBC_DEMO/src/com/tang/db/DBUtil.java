package com.tang.db;

import java.sql.*;

public class DBUtil {

    private  static final String URL="jdbc:mysql://127.0.0.1:3306/learn_java?userUnicode=true&characterEncoding=utf8";
    private  static final String USER="root";
    private  static final String PASSWORD="123456";

    private static Connection conn = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return conn;
    }

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select user_name, age from imooc_goddess");
        while(rs.next()){
            System.out.println(rs.getString("user_name")+" , "+rs.getInt("age"));
        }
    }
}
