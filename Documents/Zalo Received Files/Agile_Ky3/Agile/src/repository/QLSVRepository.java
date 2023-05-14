package repository;

import java.util.ArrayList;
import model.SVien;
import java.sql.*;

public class QLSVRepository {

    private DbConnection_QLSV dbConnection_QLSV;

    public ArrayList<SVien> getList() {
        ArrayList<SVien> lstSinhVien = new ArrayList<>();
        String sql = "SELECT * FROM SINHVIEN";
        try (Connection con = dbConnection_QLSV.getConnection(); 
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SVien sv = new SVien();
                sv.setMassv(rs.getString("mssv"));
                sv.setName(rs.getString("ho_ten"));
                sv.setDate(rs.getString("ngay_sinh"));
                sv.setGioiTinh(rs.getInt("gioi_tinh"));
                sv.setDiaChi(rs.getString("dia_chi"));
                sv.setSdt(rs.getString("sdt"));
                sv.setEmail(rs.getString("email"));
                sv.setChuyenNganh(rs.getString("chuyen_nganh"));
                sv.setKyHoc(rs.getInt("ky_hoc"));
                lstSinhVien.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstSinhVien;
    }

    public boolean addSV(SVien sv) {
        String sql = "INSERT INTO SINHVIEN VALUES(?,?,?,?,?,?,?,?,?)";
        try (Connection con = dbConnection_QLSV.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, sv.getMassv());
            ps.setObject(2, sv.getName());
            ps.setObject(3, sv.getDate());
            ps.setObject(4, sv.getGioiTinh());
            ps.setObject(5, sv.getDiaChi());
            ps.setObject(6, sv.getSdt());
            ps.setObject(7, sv.getEmail());
            ps.setObject(8, sv.getChuyenNganh());
            ps.setObject(9, sv.getKyHoc());
            int result = ps.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(String mssv, SVien sv) {
        String sql = "UPDATE SINHVIEN SET ho_ten = ?, "
                + "ngay_sinh = ?,"
                + "gioi_tinh = ?, "
                + "dia_chi = ?, "
                + "sdt = ?, "
                + "email = ?, "
                + "chuyen_nganh = ?, "
                + "ky_hoc = ? "
                + "where mssv = ? ";
        try (Connection con = dbConnection_QLSV.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, sv.getName());
            ps.setObject(2, sv.getDate());
            ps.setObject(3, sv.getGioiTinh());
            ps.setObject(4, sv.getDiaChi());
            ps.setObject(5, sv.getSdt());
            ps.setObject(6, sv.getEmail());
            ps.setObject(7, sv.getChuyenNganh());
            ps.setObject(8, sv.getKyHoc());
            ps.setObject(9, mssv);
            int result = ps.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public SVien getByMSSV(String mssv) {
        SVien sv = new SVien();
        String sql = "SELECT * FROM SINHVIEN WHERE mssv = ?";
        try (Connection con = dbConnection_QLSV.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, mssv);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sv.setMassv(rs.getString("mssv"));
                sv.setName(rs.getString("ho_ten"));
                sv.setDate(rs.getString("ngay_sinh"));
                sv.setGioiTinh(rs.getInt("gioi_tinh"));
                sv.setDiaChi(rs.getString("dia_chi"));
                sv.setSdt(rs.getString("sdt"));
                sv.setEmail(rs.getString("email"));
                sv.setChuyenNganh(rs.getString("chuyen_nganh"));
                sv.setKyHoc(rs.getInt("ky_hoc"));
                return sv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean delete(String mssv){
        String sql = "delete from SINHVIEN where mssv = ? ";
        try(Connection con = dbConnection_QLSV.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, mssv);
            int result = ps.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
}
