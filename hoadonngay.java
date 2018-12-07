
package khachsan;

public class hoadonngay extends hoadon{
    private int songaythue;

    public int getSongaythue()  {
        return songaythue;
    }

    public void setSongaythue(int songaythue) {
        this.songaythue = songaythue;
    }

    public hoadonngay(int songaythue,String mahd, String ngayhd, String tenkh, String maphong, int dongia) {
       super(mahd, ngayhd,  tenkh, maphong,  dongia);
       this.songaythue = songaythue;
    }

    public hoadonngay() {
        this.songaythue = 0;
    }
    
    
    @Override
    public String toString(){
        String st="";
        st+=super.toString();
        st+=this.songaythue+"\t\t";
        return st;
    }
    
}
