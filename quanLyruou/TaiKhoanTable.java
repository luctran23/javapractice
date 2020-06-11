/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom19;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class TaiKhoanTable extends AbstractTableModel{
    private String name[] = {"Mã tài khoản", "Tên tài khoản", "Mật khẩu"};
    private Class classes[] = {String.class, String.class, String.class };
    ArrayList<TaiKhoan> dsTk = new ArrayList<TaiKhoan>();
    public TaiKhoanTable(ArrayList<TaiKhoan> dsTk){
        this.dsTk = dsTk;
    }

    @Override
    public int getRowCount() {
        return dsTk.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return dsTk.get(rowIndex).getMaTaiKhoan();
        }
        if(columnIndex == 1){
            return dsTk.get(rowIndex).getTenTaiKhoan();
        }
        if(columnIndex == 2){
            return dsTk.get(rowIndex).getMatKhau();
        }
        return null;
    }
    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex]; 
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
}
