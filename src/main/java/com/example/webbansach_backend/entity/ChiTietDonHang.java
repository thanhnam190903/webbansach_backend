package com.example.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "chitietdonhang")
@Data
public class ChiTietDonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chitietdonhang")
    private long chiTietDonHang;
    @Column(name = "soluong")
    private int soLuong;
    @Column(name = "giaban")
    private double giaBan;
    @ManyToOne(cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinColumn(name = "masach",nullable = false)
    private Sach sach;
    @ManyToOne(cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinColumn(name = "madonhang",nullable = false)
    private DonHang donHang;
}
