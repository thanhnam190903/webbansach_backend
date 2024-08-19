package com.example.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table(name = "hinhthucthanhtoan")
@Data
public class HinhThucThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahinhthucthanhtoan")
    private int maHinhThucThanhToan;
    @Column(name = "tenhinhthucthanhtoan")
    private String tenHinhThucThanhToan;
    @Column(name = "mota")
    private String moTa;
    @Column(name = "chiphithanhtoan")
    private double chiPhiThanhToan;
    @OneToMany(mappedBy = "hinhThucThanhToan",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<DonHang> donHangs;
}
