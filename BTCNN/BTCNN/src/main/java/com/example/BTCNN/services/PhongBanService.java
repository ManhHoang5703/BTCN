package com.example.BTCNN.services;


import com.example.BTCNN.entity.PhongBan;
import com.example.BTCNN.repository.IPhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongBanService {
    @Autowired
    private IPhongBanRepository phongBanRepository;

    public List<PhongBan> getAllPhongBans() {
        return phongBanRepository.findAll();
    }

    public PhongBan getPhongBanById(String maPhong) {
        return phongBanRepository.findById(maPhong).orElse(null);
    }

    public PhongBan savePhongBan(PhongBan phongBan) {
        return phongBanRepository.save(phongBan);
    }

    public void deletePhongBan(String maPhong) {
        phongBanRepository.deleteById(maPhong);
    }
}


