package project.company.management.model;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Customer implements Serializable {
    
    private String gioiTinh;
    private String chuc_vu;
    private String ten;
    private String ngaySinh;
    private String diaChi;
    private double luong;
    private int soNgayLamViec;
    String dateCreated;
    public static String ID;

   public Customer(){}

    public Customer(Customer object) {
        this.gioiTinh = object.gioiTinh;
        this.ten = object.ten;
        this.ngaySinh = object.ngaySinh;
        this.diaChi = object.diaChi;
        this.luong = object.luong;
        this.soNgayLamViec = object.soNgayLamViec;
        this.dateCreated = object.dateCreated;
    }

    
    public String getChuc_vu() {
        return chuc_vu;
    }

    public void setChuc_vu(String chuc_vu) {
        this.chuc_vu = chuc_vu;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

   

    String doiTen(String ten){
        return ten;
    }
    String doiMaCanBo(String ma){
        return ma;
    }
    String doiDonVi(String donvi){
        return donvi;
    }
    double doiSoNgayLamViec_giamDoc(int soNgay){
        return (double) soNgay*1000000;
    }
    double doiSoNgayLamViec_truongPhong(int soNgay){
        return (double) soNgay*500000;
    }
    double doiSoNgayLamViec_nhanVien(int soNgay){
        return (double) soNgay*200000;
    }


}



