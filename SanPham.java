import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SanPham {
    // Thuộc tính (private)
    private String maSP;
    private String tenSP;
    private double donGia;     // hàng mới về chưa có giá -> mặc định 0
    private int soLuongTon;


    public SanPham() {
    }

    public SanPham(String maSP, String tenSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
    }

    public SanPham(String maSP, String tenSP, double donGia, int soLuongTon) {
        this(maSP, tenSP);
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }

    // Getter / Setter
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    // Phương thức hỗ trợ: định dạng tiền kiểu 450.000
    public static String dinhDangTien(double soTien) {
        DecimalFormatSymbols kyHieu = new DecimalFormatSymbols();
        kyHieu.setGroupingSeparator('.');
        return new DecimalFormat("#,###", kyHieu).format(soTien);
    }

    // In thông tin sản phẩm ra màn hình
    public void hienThi() {
        System.out.printf("%-5s %-16s %9s   tồn %d%n",
                maSP, tenSP, dinhDangTien(donGia), soLuongTon);
    }
}
