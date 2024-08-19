package com.example.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "sudanhgia")
@Data
public class SuDanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "madanhgia")
    private long maDanhGia;
    @Column(name = "diemxephang")
    private float diemXepHang;
    @Column(name = "nhanxet")
    private String nhanXet;
    @ManyToOne(cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinColumn(name = "masach",nullable = false)
    private Sach sach;
    @ManyToOne(cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinColumn(name = "manguoidung",nullable = false)
    private NguoiDung nguoiDung;
}
