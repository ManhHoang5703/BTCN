package com.example.BTCNN.entity;
import lombok.Data;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "phongban")
public class PhongBan {
    @Id
    @Column(name ="Ma_Phong",nullable = false,length = 2)
    private String maPhong;
    @Column(name = "Ten_Phong",nullable = false,length = 30)
    private  String tenPhong;


}
