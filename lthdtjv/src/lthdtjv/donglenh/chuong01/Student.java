/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdtjv.donglenh.chuong01;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student extends Person implements TaxInterface{
    private String truonghoc;

    public Student() {
    }

    public Student(String truonghoc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
    }

    public Student(String dai_hoc_Hue, String xuat_sac, String nguyen_Van_A, int i, Date ngaysinh) {
     
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcTax(double income) {
        double tax;
        tax = 0.01*income;
        return tax;
    }
    
    
    
    
    
}
