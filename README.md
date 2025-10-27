# 📚 KutuphaneYonetim

**KutuphaneYonetim**, bir **kütüphane yönetim sistemidir**.  
Bu proje, kütüphane kitaplarının takibini, kullanıcı işlemlerini ve ödünç alma-iade süreçlerini yönetmeyi amaçlamaktadır.

---

## 🚀 Başlangıç

### Gereksinimler

- Java 8 veya daha yeni bir sürüm  
- Eclipse IDE veya IntelliJ IDEA gibi bir Java geliştirme ortamı  
- PostgreSQL veritabanı (📄 `library.sql` dosyası ile birlikte gelir)

---

## ⚙️ Kurulum

1. Bu projeyi klonlayın:
   ```bash
   git clone https://github.com/cinarCihan/KutuphaneYonetim.git
   ```

2. Projeyi tercih ettiğiniz Java IDE’sinde açın (Eclipse, IntelliJ vb.).

3. Veritabanını oluşturun:

   PostgreSQL’e giriş yapın ve yeni bir veritabanı oluşturun:
   ```sql
   CREATE DATABASE kutuphane;
   ```

4. `library.sql` dosyasını kullanarak tabloları ve örnek verileri ekleyin:
   ```bash
   psql -U [kullanici_adi] -d kutuphane -f library.sql
   ```

5. IDE üzerinden veritabanı bağlantı ayarlarını yapın (kullanıcı adı, şifre, veritabanı adı vb.).

6. Projeyi çalıştırın 🚀

---

## 🔧 Kullanım

Uygulama üzerinden aşağıdaki işlemleri gerçekleştirebilirsiniz:

- 📗 **Kitap Yönetimi:** Kitap ekleme, silme ve güncelleme  
- 👤 **Kullanıcı Yönetimi:** Yeni kullanıcı ekleme ve mevcut kullanıcıları yönetme  
- 🔄 **Ödünç İşlemleri:** Kitap ödünç alma ve iade etme  
- 📊 **Raporlama:** Kütüphane istatistiklerini görüntüleme  

---

## 🗄️ Veritabanı

`library.sql` dosyası aşağıdaki tabloları içerir:

- **kitaplar** – Kitap bilgileri (ID, ad, yazar, kategori, stok vb.)  
- **kullanicilar** – Kütüphane üyeleri  
- **odunc** – Ödünç alınan kitap kayıtları  
- **kategori** – Kitap kategorileri  

Ayrıca örnek veriler ile test edilmesi kolaylaştırılmıştır.

---

## 📦 Teknolojiler

- **Java 8+**  
- **PostgreSQL**  
- **JDBC**  
- **Maven** (isteğe bağlı)  
- **Swing / JavaFX** (arayüz için, projede kullanılıyorsa)

---

## 👨‍💻 Katkıda Bulunma

1. Bu repository’yi forklayın  
2. Yeni bir dal oluşturun: `feature/yeni-ozellik`  
3. Değişikliklerinizi yapın ve commit edin  
4. Pull Request gönderin 🎉

---

## 📝 Lisans

Bu proje açık kaynaklıdır. Detaylar için `LICENSE` dosyasına bakabilirsiniz.
