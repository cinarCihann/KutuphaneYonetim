package dao;

import model.Kitap;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KitapDAO {

    public void kitapEkle(String baslik, String yazar) {
        String sql = "INSERT INTO kitaplar (baslik, yazar) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, baslik);
            ps.setString(2, yazar);
            ps.executeUpdate();
            System.out.println("Kitap eklendi: " + baslik);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kitapSil(int id) {
        String sql = "DELETE FROM kitaplar WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Kitap silindi, ID: " + id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void oduncAl(int id) {
        String sql = "UPDATE kitaplar SET odunc_alindi = TRUE WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Kitap ödünç alındı, ID: " + id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void iadeEt(int id) {
        String sql = "UPDATE kitaplar SET odunc_alindi = FALSE WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Kitap iade edildi, ID: " + id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Kitap> kitaplariListele() {
        List<Kitap> kitaplar = new ArrayList<>();
        String sql = "SELECT * FROM kitaplar";
        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Kitap kitap = new Kitap(
                        rs.getInt("id"),
                        rs.getString("baslik"),
                        rs.getString("yazar"),
                        rs.getBoolean("odunc_alindi")
                );
                kitaplar.add(kitap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kitaplar;
    }
}
