/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import ltai.conn.MyConnection;
import ltai.dto.CategoryDTO;

/**
 *
 * @author Win 10
 */
public class CategoryDAO {

    Connection conn = null;
    PreparedStatement ptm = null;
    ResultSet rs = null;

    private void closeConnection() throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (ptm != null) {
            ptm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public List<CategoryDTO> getCategory() throws ClassNotFoundException, SQLException {
        List<CategoryDTO> result = null;
        String id = null;
        String name = null;
        String address = null;
        boolean colloborating ;
        try {
            String sql = "Select supCode,supName,address,colloborating from tblSupplier ";
            conn = MyConnection.getConnection();
            ptm = conn.prepareStatement(sql);
            rs = ptm.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                id = rs.getString("supCode");
                name = rs.getString("supName");
                address = rs.getString("address");
                colloborating = rs.getBoolean("colloborating");
                CategoryDTO dto = new CategoryDTO(id, name, address, colloborating);
                result.add(dto);

            }
        } finally {
            closeConnection();
        }

        return result;
    }

    public boolean insertCategory(String id, String name) throws ClassNotFoundException, SQLException {
        boolean check = false;
        try {
            String sql = "Insert Into Category(CategoryID,CategoryName,ProductID) values(?,?,?)";
            conn = MyConnection.getConnection();
            ptm = conn.prepareStatement(sql);
            ptm.setString(1, id);
            ptm.setString(2, name);
            ptm.setString(3, "");
            check = ptm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
}
