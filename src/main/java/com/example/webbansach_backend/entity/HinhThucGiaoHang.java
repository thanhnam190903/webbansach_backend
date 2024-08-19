package com.example.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table(name = "hinhthucgiaohang")
@Data
public class HinhThucGiaoHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahinhthucgiaohang")
    private int maHinhThucGiaoHang;
    @Column(name = "tenhinhthucgiaohang")
    private String tenHinhThucGiaoHang;
    @Column(name = "mota")
    private String moTa;
    @Column(name = "chiphithanhtoan")
    private double chiPhiThanhToan;
    @OneToMany(mappedBy = "hinhThucGiaoHang",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<DonHang> donHangs;
}
