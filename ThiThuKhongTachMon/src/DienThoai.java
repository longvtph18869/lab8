
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer-Nitro5
 */
public class DienThoai implements Serializable{

    private String tenSP;
    private String Hang;
    private float giaSP;
    private String trangThai;

    public DienThoai() {
    }

    public DienThoai(String tenSP, String Hang, float giaSP, String trangThai) {
        this.tenSP = tenSP;
        this.Hang = Hang;
        this.giaSP = giaSP;
        this.trangThai = trangThai;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(float giaSP) {
        this.giaSP = giaSP;
    }

    public String getTrangThai() {
        return getStatus(giaSP);
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getStatus(double giaSP) {
        if (giaSP >= 10000) {
            return "Tốt";
        } else {
            return "Bình thường";
        }
    }
}
