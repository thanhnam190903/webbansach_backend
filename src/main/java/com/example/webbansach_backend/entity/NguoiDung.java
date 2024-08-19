package com.example.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table(name = "nguoidung")
@Data
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manguoidung")
    private int maNguoiDung;
    @Column(name = "hodem")
    private String hoDem;
    @Column(name = "ten")
    private String ten;
    @Column(name = "tendangnhap")
    private String tenDangNhap;
    @Column(name = "matkhau",length = 512)
    private String matKhau;
    @Column(name = "gioitinh")
    private  char gioiTinh;
    @Column(name = "email")
    private String email;
    @Column(name = "sdt")
    private String sDT;
    @Column(name = "diachimuahang")
    private String diaChiMuaHang;
    @Column(name = "diachigiaohang")
    private String diaChiGiaoHang;
    @OneToMany(mappedBy = "nguoiDung",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<SuDanhGia> suDanhGiaList;
    @OneToMany(mappedBy = "nguoiDung",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<SachYeuThich> sachYeuThichList;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinTable(name = "nguoidung_quyen",
            joinColumns = @JoinColumn(name = "manguoidung"),
            inverseJoinColumns = @JoinColumn(name = "maquyen")
    )
    private List<Quyen> quyens;
    @OneToMany(mappedBy = "nguoiDung",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<DonHang> donHangs;
}
