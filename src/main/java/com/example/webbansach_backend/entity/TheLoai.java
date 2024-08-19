package com.example.webbansach_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table(name = "theloai")
@Data
public class TheLoai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matheloai")
    private int maTheLoai;
    @Column(name = "tentheloai")
    private String tenTheLoai;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH
    })
    @JoinTable(name = "sach_theloai",
            joinColumns = @JoinColumn(name = "matheloai"),
            inverseJoinColumns = @JoinColumn(name = "masach")
    )
    private List<Sach> saches;
}
