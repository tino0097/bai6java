
package khachsan;

import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class quanly {
    ArrayList<hoadongio> listhdg=new ArrayList();
    ArrayList<hoadonngay> listhdn=new ArrayList();
    Scanner sc=new Scanner(System.in);
    
    public hoadongio Hoadongio(){
     String mahd=sc.nextLine();
     String ngayhd=sc.nextLine();
     String tenkh=sc.nextLine();
     String maphong=sc.nextLine();
     int dongia=sc.nextInt();
     int sogiothue=sc.nextInt();
     hoadongio hdg=new hoadongio(sogiothue, mahd, ngayhd,  tenkh, maphong,  dongia);
     return hdg;
    }
    
    public void nhaphdg(){
        String traloi;
        do
        {
            this.listhdg.add(this.Hoadongio());
            System.out.println("MOI BAN NHAP TIEP"); 
            traloi=sc.next();
        }while(traloi.equals("c"));
    }
    
    public hoadonngay Hoadonngay(){
     String mahd=sc.nextLine();
     String ngayhd=sc.nextLine();
     String tenkh=sc.nextLine();
     String maphong=sc.nextLine();
     int dongia=sc.nextInt();
     int songaythue=sc.nextInt();
     hoadonngay hdn=new hoadonngay(songaythue, mahd, ngayhd,  tenkh, maphong,  dongia);
     return hdn;
    }
    
    public void nhaphdn(){
        String traloi;
        do
        {
            this.listhdn.add(this.Hoadonngay());
            System.out.println("MOI BAN NHAP TIEP"); 
            traloi=sc.next();
        }while(traloi.equals("c"));
    } 
    
    
    public void thanhtienhdtheogio(){
        for(int i=0;i<listhdg.size();i++){
            if(24<listhdg.get(i).getSogiothue()&&listhdg.get(i).getSogiothue()<30)
            {
                int a=listhdg.get(i).getDongia()*24;
                System.out.println(a);
            }
            else if(listhdg.get(i).getSogiothue()>30)
                    {
                        System.out.println("KHONG DUNG HOA DON THEO GIO"); 
                             
                    }
        }
    }
    
    public double hoadontheongay(){
            double a=0;
            double b=0;
         for(int i=0;i<listhdg.size();i++){
             if(listhdn.get(i).getSongaythue()>7){
                 System.out.println("GIA TIEN CAC NGAY CON LAI");
                 a=(double) (listhdn.get(i).getSongaythue()-7)* listhdn.get(i).getDongia()*0.8;
                 return a;}
             else
                 {
                 System.out.println("GIA TIEN 7 NGAY");
                 b=(double) listhdn.get(i).getSongaythue()* listhdn.get(i).getDongia();
                 }
         }
      return 0;   
}
    
        public void tbthanhtienhdtheogio(){
            SimpleDateFormat sp=new SimpleDateFormat("MM-yyyy");
            Calendar cal=Calendar.getInstance();
            Date date1;
            Date date2;
            int c=0;
            int d=0;
            double h=0;
            try
            {for(int i=0;i<listhdg.size();i++){
                String ngayhd=listhdg.get(i).getNgayhd();
                String ngaynhap="09-2013";
                date1=sp.parse(ngayhd);
                date2=sp.parse(ngaynhap);
                if(date1.compareTo(date2)==0)
                {
                    if(24<listhdg.get(i).getSogiothue()&&listhdg.get(i).getSogiothue()<30)
                {
                    int a=listhdg.get(i).getDongia()*24;
                    c+=a;
                }
                     else if(listhdg.get(i).getSogiothue()>30)
                {
                        System.out.println("KHONG DUNG HOA DON THEO GIO"); 
                             
                }
                    else
                { 
                     int b=listhdg.get(i).getDongia()*listhdg.get(i).getSogiothue();
                     d+=b;
                }
                    
                }
                h=(double)(c+d)/listhdg.size();
                        System.out.println(h);
            }
                
            }catch(ParseException e){
                
            }    
    }

        
        
        public void tbthanhtienhdtheongay(){
            SimpleDateFormat sp=new SimpleDateFormat("MM-yyyy");
            Calendar cal=Calendar.getInstance();
            Date date1;
            Date date2;
            int c=0;
            int d=0;
            double h=0;
            try
            {for(int i=0;i<listhdn.size();i++){
                String ngayhd=listhdn.get(i).getNgayhd();
                String ngaynhap="09-2013";
                date1=sp.parse(ngayhd);
                date2=sp.parse(ngaynhap);
                if(date1.compareTo(date2)==0)
                {
                    if(24<listhdn.get(i).getSongaythue()&&listhdn.get(i).getSongaythue()<30)
                {
                    int a=listhdn.get(i).getDongia()*24;
                    c+=a;
                }
                     else if(listhdn.get(i).getSongaythue()>30)
                {
                        System.out.println("KHONG DUNG HOA DON THEO GIO"); 
                             
                }
                    else
                { 
                     int b=listhdn.get(i).getDongia()*listhdn.get(i).getSongaythue();
                     d+=b;
                }
                    
                }
                h=(double)(c+d)/listhdn.size();
                        System.out.println(h);
            }
                
            }catch(ParseException e){
                
            }    
    }
    
}