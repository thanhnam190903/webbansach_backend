package com.example.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;
@Entity
@Table(name = "donhang")
@Data
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "madonhang")
    private int maDonHang;
    @Column(name = "ngaytao")
    private Date ngayTao;
    @Column(name = "diachimuahang")
    private String diaChiMuaHang;
    @Column(name = "diachinhanhang")
    private String diaChiNhanHang;
    @Column(name = "tongtiensanpham")
    private double tongTienSanPham;
    @Column(name = "chiphigiaohang")
    private double chiPhiGiaoHang;
    @Column(name = "chiphithanhtoan")
    private double chiPhiThanhToan;
    @Column(name = "tongtien")
    private double tongTien;
    @OneToMany(mappedBy = "donHang",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<ChiTietDonHang> chiTietDonHangs;
    @ManyToOne(cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinColumn(name = "manguoidung",nullable = false)
    private NguoiDung nguoiDung;
    @ManyToOne(cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinColumn(name = "mahinhthucthanhtoan")
    private HinhThucThanhToan hinhThucThanhToan;
    @ManyToOne(cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinColumn(name = "mahinhthucgiaohang")
    private HinhThucGiaoHang hinhThucGiaoHang;
}
