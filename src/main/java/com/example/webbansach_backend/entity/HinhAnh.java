package com.example.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "hinhanh")
@Data
public class HinhAnh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahinhanh")
    private int maHinhAnh;
    @Column(name = "tenhinhanh")
    private String tenHinhAnh;
    @Column(name = "laicon")
    private boolean laIcon;
    @Column(name = "duongdan")
    private String duongDan;
    @Column(name = "dulieuanh")
    @Lob
    private String duLieuAnh;
    @ManyToOne(cascade = {
        CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinColumn(name = "masach",nullable = false)
    private Sach sach;
}
