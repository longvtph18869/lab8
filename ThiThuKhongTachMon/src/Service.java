
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Acer-Nitro5
 */
public class Service {

    List<DienThoai> _lstPhone;
    DienThoai dt = new DienThoai();

    public Service() {
        _lstPhone = new ArrayList<DienThoai>();
    }

    public String add(DienThoai dt) {
        if (dt == null || dt.getGiaSP() <=0 || dt.getTenSP().isBlank() || String.valueOf(dt.getGiaSP()).isBlank()) {
            return "Thêm không thành công !";
        }
        _lstPhone.add(dt);
        return "Thêm thành công !";
    }

    public String ghiFile(String path) throws IOException {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (DienThoai x : _lstPhone) {
                oos.writeObject(x);
            }
            fos.close();
            oos.close();
            return "Ghi Thành Công!";
        } catch (Exception e) {
            return "Ghi thất bại";
        }
    }

    public String docFile(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
            File file = new File(path);
            if (!file.exists()) {
                return "Không tìm thấy file";
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            _lstPhone.clear();
            while (fis.available() > 0) {
                var temp = ois.readObject();
                _lstPhone.add((DienThoai) temp);
            }
            fis.close();
            ois.close();
            return "Đọc thành công !";
        } catch (Exception e) {
            return "Đọc file không thành công ";
        }
    }

    public void fake4Data() {
        _lstPhone.add(new DienThoai("Galaxy", "SamSung", 14000f, dt.getTrangThai()));
        _lstPhone.add(new DienThoai("Iphone13", "Iphone", 1400f, dt.getTrangThai()));
        _lstPhone.add(new DienThoai("Neo5", "Oppo", 15000f, dt.getTrangThai()));
        _lstPhone.add(new DienThoai("RedMiNote10", "XiaoMi", 240000f, dt.getTrangThai()));
    }

    public List<DienThoai> getList() {
        return _lstPhone;
    }

    public boolean checkSo(String text) {
        return text.matches("[-+]?[0-9]*\\.?[0-9]*");
    }
}
