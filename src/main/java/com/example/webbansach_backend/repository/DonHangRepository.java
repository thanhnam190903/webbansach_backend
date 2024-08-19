package com.example.webbansach_backend.repository;

import com.example.webbansach_backend.entity.DonHang;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonHangRepository extends JpaRepository<DonHang, Integer> {
}
