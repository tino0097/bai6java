
package khachsan;

public class hoadon {
    private String mahd;
    private String ngayhd;
    private String tenkh;
    private String maphong;
    private int dongia;

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getNgayhd() {
        return ngayhd;
    }

    public void setNgayhd(String ngayhd) {
        this.ngayhd = ngayhd;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public hoadon(String mahd, String ngayhd, String tenkh, String maphong, int dongia) {
        this.mahd = mahd;
        this.ngayhd = ngayhd;
        this.tenkh = tenkh;
        this.maphong = maphong;
        this.dongia = dongia;
    }
    
    public hoadon() {
        this.mahd = "";
        this.ngayhd = "";
        this.tenkh = "";
        this.maphong = "";
        this.dongia = 0;
    }
    
    @Override
    public String toString(){
        String st="";
        st+=this.mahd+"\t\t";
        st+=this.ngayhd+"\t\t";
        st+=this.tenkh+"\t\t";
        st+=this.maphong+"\t\t";
        st+=this.dongia+"\t\t";
        return st;
    }
    
}
