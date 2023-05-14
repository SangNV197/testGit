/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.SVien;
import org.w3c.dom.ls.LSInput;
import repository.QLSVRepository;
import service.QLSinhVienService;

/**
 *
 * @author vuchiton
 */
public class QLSinhVienServiceImpl implements QLSinhVienService {

    private QLSVRepository qlsvRepository = new QLSVRepository();
    private ArrayList<SVien> listSinhVien = new ArrayList<>();

    @Override
    public ArrayList<SVien> getAll() {
        return qlsvRepository.getList();
    }


    @Override
    public String them(SVien sVien) {
        if (qlsvRepository.addSV(sVien)) {
            return "Thêm sinh viên thành công";
        } else {
            return "Thêm thất bại";
        }

    }

    @Override
    public String update(String mssv, SVien sv) {
        if (qlsvRepository.getByMSSV(mssv) == null) {
            return "Không tìm thấy sinh viên tương ứng";
        } else if (qlsvRepository.update(mssv, sv)) {
            return "Sửa thông tin sinh viên thành công";
        } else {
            return "Sửa thông tin thất bại";
        }
    }
    
    
    @Override
    public String delete(String mssv) {
        if(qlsvRepository.getByMSSV(mssv) == null){
            return "Không tìm thấy mã số sinh viên để xóa";
        }else if(qlsvRepository.delete(mssv)){
            return "Xóa sinh viên thành công";
        }else{
            return "Xóa thất bại";
        }
    }

}
