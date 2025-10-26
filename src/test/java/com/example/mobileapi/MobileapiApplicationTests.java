package com.example.mobileapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

// Kunci: Gunakan anotasi ini untuk menimpa konfigurasi DB utama
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties") // Arahkan ke file konfigurasi test (Langkah 3)
class MobileapiApplicationTests {

    @Test
    void contextLoads() {
        // Test ini hanya memuat konteks Spring (konteks yang dimuat sekarang menggunakan H2).
        // Jika konteks dimuat, test ini lulus.
    }
}
