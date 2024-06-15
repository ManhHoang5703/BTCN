package com.example.BTCNN.entity;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name="Ma_NV",nullable = false,length = 3)
    private Long maNV;

    @Column(name="Ten_NV",nullable = false,length = 100)
    private String tenNV;

    @Column(name="Phai",length = 3)
    private String phai;

    @Column(name="Noi_Sinh",length = 200)
    private String noiSinh;

    @Column(name="Ma_Phong",length = 2)
    private  String maPhong;

    @Column(name = "Luong")
    private int luong;

    @ManyToOne
    @JoinColumn(name = "Ma_Phong", insertable = false, updatable = false)
    private PhongBan phongban;

}
