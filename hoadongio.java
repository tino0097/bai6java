
package khachsan;

public class hoadongio extends hoadon{
    private int sogiothue;



    public hoadongio(int sogiothue,String mahd, String ngayhd, String tenkh, String maphong, int dongia) {
        super(mahd, ngayhd,  tenkh, maphong,  dongia);
        this.sogiothue = sogiothue;
    }

    public hoadongio() {
        super();
        this.sogiothue = 0;
    }
    

    public int getSogiothue() {
        return sogiothue;
    }

    public void setSogiothue(int sogiothue) {
        this.sogiothue = sogiothue;
    }
    
    


    
    @Override
    public String toString(){
        String st="";
        st+=super.toString();
        st+=this.sogiothue+"\t\t";
        return st;
    }
}
