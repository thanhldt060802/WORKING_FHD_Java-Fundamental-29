public class XeGanMay {
    
    private String bienSo;
    private String mauSac;
    private int phanKhoi;

    // public XeGanMay() {
        
    // }
    
    public XeGanMay(String bienSo, String mauSac, int phanKhoi) {
        this.bienSo = bienSo;
        this.mauSac = mauSac;
        this.phanKhoi = phanKhoi;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getPhanKhoi() {
        return phanKhoi;
    }

    public void setPhanKhoi(int phanKhoi) {
        this.phanKhoi = phanKhoi;
    }

    public void chay() {
        System.out.println("Dang chay ...");
    }

    public void phanh() {
        System.out.println("Dang phanh ...");
    }

}
