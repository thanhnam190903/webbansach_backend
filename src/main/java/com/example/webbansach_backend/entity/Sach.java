package com.example.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.util.List;
@Entity
@Table(name = "sach")
@Data
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "masach")
    private int maSach;
    @Column(name = "tensach")
    private String tenSach;
    @Column(name = "tentacgia")
    private String tenTacGia;
    @Column(name = "isbn")
    private String ISBN;
    @Column(name = "mota",columnDefinition = "text")
    private String moTa;
    @Column(name = "gianiemyet")
    private double giaNiemYet;
    @Column(name = "giaban")
    private double giaBan;
    @Column(name = "soluong")
    private int soLuong;
    @Column(name = "trungbinhxephang")
    private double trungBinhXepHang;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinTable(name = "sach_theloai",
               joinColumns = @JoinColumn(name = "masach"),
                inverseJoinColumns = @JoinColumn(name = "matheloai")
    )
    private List<TheLoai> theLoais;
    @OneToMany(mappedBy = "sach",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<HinhAnh> hinhAnhs;
    @OneToMany(mappedBy = "sach",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<SuDanhGia> suDanhGias;
    @OneToMany(mappedBy = "sach",fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,
            CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<ChiTietDonHang> chiTietDonHangs;
    @OneToMany(mappedBy = "sach",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<SachYeuThich> sachYeuThiches;


}
