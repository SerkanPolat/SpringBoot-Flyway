package com.sp.flyway.api;

import com.sp.flyway.entity.Kullanici;
import com.sp.flyway.repo.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kul")
public class KullaniciApi {

    private final KullaniciRepository kullaniciRepository;

    public KullaniciApi(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }


    @GetMapping
    public List<Kullanici> getAll(){
        return kullaniciRepository.findAll();
    }


}
