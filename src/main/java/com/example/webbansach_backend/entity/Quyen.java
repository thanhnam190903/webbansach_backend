package com.example.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table(name = "quyen")
@Data
public class Quyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maquyen")
    private int maQuyen;
    @Column(name = "tenquyen")
    private String tenQuyen;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinTable(name = "nguoidung_quyen",
            joinColumns = @JoinColumn(name = "maquyen"),
            inverseJoinColumns = @JoinColumn(name = "manguoidung")
    )
    private List<NguoiDung> nguoiDungs;
}
