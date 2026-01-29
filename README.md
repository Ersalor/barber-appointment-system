# Barber Appointment System (Berber Randevu Sistemi)

Bu proje, bir berber dükkanının randevu süreçlerini yönetmek amacıyla geliştirilen Java tabanlı bir backend uygulamasıdır. Yazılım Mühendisliği eğitimim kapsamında, nesne yönelimli programlama (OOP) prensiplerini ve sınıflar arası ilişkileri (Many-to-One, One-to-Many) uygulamalı olarak öğrenmek için geliştirilmektedir.

## 🛠️ Kullanılan Teknolojiler
* **Dil:** Java
* **Versiyon Kontrol:** Git
* **IDE:** IntelliJ IDEA

## 🏗️ Proje Mimarisi
Projenin temel domain modelleri şunlardır:
* **User:** Müşteri ve Berber bilgilerini tutar.
* **Service:** Sunulan hizmetlerin (saç, sakal vb.) ad, fiyat ve süre bilgilerini içerir.
* **Appointment:** Randevu detaylarını ve durumunu yönetir.
* **AppointmentItem:** Bir randevuya eklenen hizmetlerin o anki fiyatıyla dondurulduğu ara modeldir.

## 🚀 Mevcut Durum ve Simülasyon (Playground)
Projenin ana geliştirme hattında temel sınıf yapıları (fields) oluşturulmuştur. 

Şu an aktif olarak `playground/simulation-test` branch'i üzerinde çalışılmaktadır:
* **Accessor Metodları:** Tüm sınıflar için getter ve setter metodları bu branch'te tamamlanmıştır.
* **Main.java Simülasyonu:** Veritabanı bağlantısı öncesinde, nesnelerin çalışma mantığını ve birbirleriyle olan bağlarını test etmek için `Main.java` dosyası üzerinden bir "canlı randevu senaryosu" koşturulmaktadır. Bu sayede randevu detaylarının hesaplanması ve müşteri-randevu ilişkisi doğrulanmaktadır.

## 📝 Gelecek Planları
* JPA ve Hibernate ile veritabanı entegrasyonu.
* Spring Boot framework'ü ile RESTful API katmanının yazılması.
* Randevu çakışmalarını önleyen iş mantığı (business logic) geliştirmeleri.
