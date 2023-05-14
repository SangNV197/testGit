/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author vuchiton
 */
public class SVien implements  Serializable{
    private String massv;
    private String name;
    private String date;
    private Integer gioiTinh;
    private String diaChi;
    private String sdt;
    private String email;
    private String chuyenNganh;
    private Integer kyHoc;

    public SVien(String name, String date, Integer gioiTinh, String diaChi, String sdt, String email, String chuyenNganh, Integer kyHoc) {
        this.name = name;
        this.date = date;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.chuyenNganh = chuyenNganh;
        this.kyHoc = kyHoc;
    }

    public SVien() {
    }

    public SVien(String massv, String name, String date, Integer gioiTinh, String diaChi, String sdt, String email, String chuyenNganh, Integer kyHoc) {
        this.massv = massv;
        this.name = name;
        this.date = date;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.chuyenNganh = chuyenNganh;
        this.kyHoc = kyHoc;
    }

    public String getMassv() {
        return massv;
    }

    public void setMassv(String massv) {
        this.massv = massv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public Integer getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(Integer kyHoc) {
        this.kyHoc = kyHoc;
    }

    
    public String hienThiGT() {
        if (gioiTinh == 1) {
            return "Nam";
        }
        return "Nữ";
    }
    
}
