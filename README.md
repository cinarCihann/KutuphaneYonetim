# 📚 KutuphaneYonetim

KutuphaneYonetim, bir kütüphane yönetim sistemidir. Bu proje, kütüphane kitaplarının takibini ve kullanıcı işlemlerini yönetmeyi amaçlamaktadır.

## 🚀 Başlangıç

### Gereksinimler

- Java 8 veya daha yeni bir sürüm  
- Eclipse IDE veya IntelliJ IDEA gibi bir Java geliştirme ortamı  
- PostgreSQL veritabanı (library.sql dosyası ile kullanılabilir)

### Kurulum

1. Bu repository'yi bilgisayarınıza klonlayın:

   ```bash
   git clone https://github.com/cinarCihan/KutuphaneYonetim.git
Projeyi tercih ettiğiniz Java IDE'sinde açın.

Veritabanını oluşturun:

PostgreSQL’e giriş yapın ve yeni bir veritabanı oluşturun:
```sql
CREATE DATABASE kutuphane;
```
library.sql dosyasını kullanarak tabloları ve örnek verileri ekleyin:
```bash
psql -U [kullanici_adi] -d kutuphane -f library.sql
```
IDE üzerinden veritabanı bağlantı ayarlarını yapın (kullanıcı adı, şifre, veritabanı adı).

Projeyi çalıştırın.

🔧 Kullanım

Kitap ekleme, silme ve güncelleme işlemleri

Kullanıcı ekleme ve yönetimi

Kitap ödünç alma ve iade işlemleri

Raporlama ve istatistikler

🗄️ Veritabanı

library.sql dosyası, gerekli tabloları ve ö
