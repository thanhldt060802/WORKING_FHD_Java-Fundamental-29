public class XeBay extends XeGanMay {

    private String loaiCanh;

    public XeBay(String bienSo, String mauSac, int phanKhoi, String loaiCanh) {
        super(bienSo, mauSac, phanKhoi);
        this.loaiCanh = loaiCanh;
    }

    public String getLoaiCanh() {
        return loaiCanh;
    }

    public void setLoaiCanh(String loaiCanh) {
        this.loaiCanh = loaiCanh;
    }

    public void bay() {
        System.out.println("Dang bay ...");
    }

    @Override
    public void phanh() {
        System.out.println("Co the phanh duoi dat va tren troi ...");
    }

    @Override
    public String toString() {
        return "XeBay [bienSo=" + super.getBienSo() + ", mauSac=" + super.getMauSac()
                + ", phanKhoi=" + super.getPhanKhoi() + ", loaiCanh=" + this.loaiCanh +  "]";
    }
    
}
