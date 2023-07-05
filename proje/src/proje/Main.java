package proje;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

interface Robot {
/*
public int MotorSayisi=0;
    public int YukMiktari=0;;  
    public String RobotTipi="";
    */
    int getMotorSayisi();
    int getYukMiktari();
    String getRobotTipi();
    
    void setMotorSayisi(int MotorSayisi);
    void setYukMiktari(int YukMiktari);
    void setRobotTipi(String RobotTipi);
 
    
}

//--------------------------------------------------------> Gezgin Robotlar

interface Gezgin extends Robot{
//public int GezinmeHizi=0;

int getGezinmeHizi();
void setGezinmeHizi(int GezinmeHizi);
}

//--------------------------------------------------------> Tekerlekli (Gezgin)

class Tekerlekli implements Gezgin{
private int TekerlekSayisi;
private double EngeldenGecmeSuresi;
private int MotorSayisi;
private int YukMiktari;  
private String RobotTipi;
private int GezinmeHizi;

public double EngelGecmeSuresiBul (int MotorSayisi){
 
return MotorSayisi*0.5;
}

public Tekerlekli() {
super();
}

public Tekerlekli(int tekerlekSayisi, double engeldenGecmeSuresi, int motorSayisi, int yukMiktari, String robotTipi,
int gezinmeHizi) {
super();
this.TekerlekSayisi = tekerlekSayisi;
this.EngeldenGecmeSuresi = engeldenGecmeSuresi;
this.MotorSayisi = motorSayisi;
this.YukMiktari = yukMiktari;
this.RobotTipi = robotTipi;
this.GezinmeHizi = gezinmeHizi;
}
public int getTekerlekSayisi() {
return TekerlekSayisi;
}
public void setTekerlekSayisi(int tekerlekSayisi) {
this.TekerlekSayisi = tekerlekSayisi;
}
public double getEngeldenGecmeSuresi() {
return EngeldenGecmeSuresi;
}
public void setEngeldenGecmeSuresi(double engeldenGecmeSuresi) {
this.EngeldenGecmeSuresi = engeldenGecmeSuresi;
}
public int getMotorSayisi() {
return MotorSayisi;
}
public void setMotorSayisi(int motorSayisi) {
this.MotorSayisi = motorSayisi;
}
public int getYukMiktari() {
return YukMiktari;
}
public void setYukMiktari(int yukMiktari) {
this.YukMiktari = yukMiktari;
}
public String getRobotTipi() {
return RobotTipi;
}
public void setRobotTipi(String robotTipi) {
this.RobotTipi = robotTipi;
}
public int getGezinmeHizi() {
return GezinmeHizi;
}
public void setGezinmeHizi(int gezinmeHizi) {
this.GezinmeHizi = gezinmeHizi;
}

/*
  public double EngelGecmeSuresiBul()
{
EngeldenGecmeSuresi=MotorSayisi*3;
return EngeldenGecmeSuresi;
}*/
 

}

//--------------------------------------------------------> Paletli (Gezgin)

class Paletli implements Gezgin{

private int PaletSayisi;
private double EngeldenGecmeSuresi;
private int MotorSayisi;
private int YukMiktari;  
private String RobotTipi;
private int GezinmeHizi;

public double EngelGecmeSuresiBul (int MotorSayisi){
 
return MotorSayisi*3;
}

public Paletli() {
super();
}

public Paletli(int paletSayisi, double engeldenGecmeSuresi, int motorSayisi, int yukMiktari, String robotTipi,
int gezinmeHizi) {
super();
PaletSayisi = paletSayisi;
EngeldenGecmeSuresi = engeldenGecmeSuresi;
MotorSayisi = motorSayisi;
YukMiktari = yukMiktari;
RobotTipi = robotTipi;
GezinmeHizi = gezinmeHizi;
}

public int getPaletSayisi() {
return PaletSayisi;
}
public void setPaletSayisi(int paletSayisi) {
this.PaletSayisi = paletSayisi;
}
public double getEngeldenGecmeSuresi() {
return EngeldenGecmeSuresi;
}
public void setEngeldenGecmeSuresi(double engeldenGecmeSuresi) {
this.EngeldenGecmeSuresi = engeldenGecmeSuresi;
}
public int getMotorSayisi() {
return MotorSayisi;
}
public void setMotorSayisi(int motorSayisi) {
this.MotorSayisi = motorSayisi;
}
public int getYukMiktari() {
return YukMiktari;
}
public void setYukMiktari(int yukMiktari) {
this.YukMiktari = yukMiktari;
}
public String getRobotTipi() {
return RobotTipi;
}
public void setRobotTipi(String robotTipi) {
this.RobotTipi = robotTipi;
}
public int getGezinmeHizi() {
return GezinmeHizi;
}
public void setGezinmeHizi(int gezinmeHizi) {
this.GezinmeHizi = gezinmeHizi;
}

/*
public double EngelGecmeSuresiBul()
{
EngeldenGecmeSuresi=MotorSayisi*0.5;
return EngeldenGecmeSuresi;
}
*/
 

}

//--------------------------------------------------------> Spider (Gezgin)

class Spider implements Gezgin{

private int BacakSayisi;
private int MotorSayisi;
private int YukMiktari;  
private String RobotTipi;
private int GezinmeHizi;

public Spider() {
super();
}

public Spider(int bacakSayisi, int motorSayisi, int yukMiktari, String robotTipi, int gezinmeHizi) {
super();
BacakSayisi = bacakSayisi;
MotorSayisi = motorSayisi;
YukMiktari = yukMiktari;
RobotTipi = robotTipi;
GezinmeHizi = gezinmeHizi;
}

public int getBacakSayisi() {
return BacakSayisi;
}
public void setBacakSayisi(int bacakSayisi) {
this.BacakSayisi = bacakSayisi;
}
public int getMotorSayisi() {
return MotorSayisi;
}
public void setMotorSayisi(int motorSayisi) {
this.MotorSayisi = motorSayisi;
}
public int getYukMiktari() {
return YukMiktari;
}
public void setYukMiktari(int yukMiktari) {
this.YukMiktari = yukMiktari;
}
public String getRobotTipi() {
return RobotTipi;
}
public void setRobotTipi(String robotTipi) {
this.RobotTipi = robotTipi;
}
public int getGezinmeHizi() {
return GezinmeHizi;
}
public void setGezinmeHizi(int gezinmeHizi) {
this.GezinmeHizi = gezinmeHizi;
}
 
}

//--------------------------------------------------------> Gezmeyen Robotlar

interface Gezmeyen extends Robot{
/*
public int YukKapasitesi=0;
public int KolUzunlugu=0;
public int TasimaHizi=0;
*/

int getYukKapasitesi();
int getKolUzunlugu();
int getTasimaHizi();
 

void setYukKapasitesi(int YukKapasitesi);
 
void setKolUzunlugu(int KolUzunlugu);
 
void setTasimaHizi(int TasimaHizi);

}

//--------------------------------------------------------> Seri(Gezmeyen)

class Seri implements Gezmeyen{

private int MaxUzunluk;    //=kol uzunluðu
private int MotorSayisi;
    private int YukMiktari;  
    private String RobotTipi;
    private int YukKapasitesi;
    private int KolUzunlugu;
    private int TasimaHizi;
    
    public Seri() {
super();
}
    
public Seri(int maxUzunluk, int motorSayisi, int yukMiktari, String robotTipi, int yukKapasitesi, int kolUzunlugu,
int tasimaHizi) {
super();
MaxUzunluk = maxUzunluk;
MotorSayisi = motorSayisi;
YukMiktari = yukMiktari;
RobotTipi = robotTipi;
YukKapasitesi = yukKapasitesi;
KolUzunlugu = kolUzunlugu;
TasimaHizi = tasimaHizi;
}

public int getMaxUzunluk() {
return MaxUzunluk;
}
public void setMaxUzunluk(int maxUzunluk) {
this.MaxUzunluk = maxUzunluk;
}
public int getMotorSayisi() {
return MotorSayisi;
}
public void setMotorSayisi(int motorSayisi) {
this.MotorSayisi = motorSayisi;
}
public int getYukMiktari() {
return YukMiktari;
}
public void setYukMiktari(int yukMiktari) {
this.YukMiktari = yukMiktari;
}
public String getRobotTipi() {
return RobotTipi;
}
public void setRobotTipi(String robotTipi) {
this.RobotTipi = robotTipi;
}
public int getYukKapasitesi() {
return YukKapasitesi;
}
public void setYukKapasitesi(int yukKapasitesi) {
this.YukKapasitesi = yukKapasitesi;
}
public int getKolUzunlugu() {
return KolUzunlugu;
}
public void setKolUzunlugu(int kolUzunlugu) {
this.KolUzunlugu = kolUzunlugu;
}
public int getTasimaHizi() {
return TasimaHizi;
}
public void setTasimaHizi(int tasimaHizi) {
this.TasimaHizi = tasimaHizi;
}

}

//--------------------------------------------------------> Paralel(Gezmeyen)

class Paralel implements Gezmeyen{

private int MaxUzunluk;    //=KolUzunlugu;
private int MotorSayisi;
private int YukMiktari;  
private String RobotTipi;
private int YukKapasitesi;
private int KolUzunlugu;
private int TasimaHizi;
 

public Paralel() {
super();
}

public Paralel(int maxUzunluk, int motorSayisi, int yukMiktari, String robotTipi, int yukKapasitesi,
int kolUzunlugu, int tasimaHizi) {
super();
MaxUzunluk = maxUzunluk;
MotorSayisi = motorSayisi;
YukMiktari = yukMiktari;
RobotTipi = robotTipi;
YukKapasitesi = yukKapasitesi;
KolUzunlugu = kolUzunlugu;
TasimaHizi = tasimaHizi;
}

public int getMaxUzunluk() {
return MaxUzunluk;
}
public void setMaxUzunluk(int maxUzunluk) {
this.MaxUzunluk = maxUzunluk;
}
public int getMotorSayisi() {
return MotorSayisi;
}
public void setMotorSayisi(int motorSayisi) {
this.MotorSayisi = motorSayisi;
}
public int getYukMiktari() {
return YukMiktari;
}
public void setYukMiktari(int yukMiktari) {
this.YukMiktari = yukMiktari;
}
public String getRobotTipi() {
return RobotTipi;
}
public void setRobotTipi(String robotTipi) {
this.RobotTipi = robotTipi;
}
public int getYukKapasitesi() {
return YukKapasitesi;
}
public void setYukKapasitesi(int yukKapasitesi) {
this.YukKapasitesi = yukKapasitesi;
}
public int getKolUzunlugu() {
return KolUzunlugu;
}
public void setKolUzunlugu(int kolUzunlugu) {
this.KolUzunlugu = kolUzunlugu;
}
public int getTasimaHizi() {
return TasimaHizi;
}
public void setTasimaHizi(int tasimaHizi) {
this.TasimaHizi = tasimaHizi;
}
 
}

//--------------------------------------------------------> Hibrit

class Hibrit implements Gezgin, Gezmeyen{
private int SabitlenmeSuresi;
private int GecisSuresi;
private int MotorSayisi;
private int YukMiktari;  
private String RobotTipi;
private int YukKapasitesi;
private int KolUzunlugu;
private int TasimaHizi;
private int GezinmeHizi;

public Hibrit() {
super();
}

public Hibrit(int sabitlenmeSuresi, int gecisSuresi, int motorSayisi, int yukMiktari, String robotTipi,
int yukKapasitesi, int kolUzunlugu, int tasimaHizi, int gezinmeHizi) {
super();
SabitlenmeSuresi = sabitlenmeSuresi;
GecisSuresi = gecisSuresi;
MotorSayisi = motorSayisi;
YukMiktari = yukMiktari;
RobotTipi = robotTipi;
YukKapasitesi = yukKapasitesi;
KolUzunlugu = kolUzunlugu;
TasimaHizi = tasimaHizi;
GezinmeHizi = gezinmeHizi;
}

public Hibrit(int motorSayisi, int yukMiktari, String robotTipi) {  // Robot için constractor
super();
 
this.MotorSayisi = motorSayisi;
this.YukMiktari = yukMiktari;
this.RobotTipi = robotTipi;

}

public Hibrit(int gezinmeHizi) {                                    // Gezgin için constractor
super();
this.GezinmeHizi = gezinmeHizi;
}

public Hibrit(int kolUzunlugu, int tasimaHizi, int yukKapasitesi) {  //Gezmeyen için constractor
super();
this.YukKapasitesi = yukKapasitesi;
this.KolUzunlugu = kolUzunlugu;
this.TasimaHizi = tasimaHizi;
}

public int getSabitlenmeSuresi() {
return SabitlenmeSuresi;
}
public void setSabitlenmeSuresi(int sabitlenmeSuresi) {
this.SabitlenmeSuresi = sabitlenmeSuresi;
}
public int getGecisSuresi() {
return GecisSuresi;
}
public void setGecisSuresi(int gecisSuresi) {
this.GecisSuresi = gecisSuresi;
}
public int getMotorSayisi() {
return MotorSayisi;
}
public void setMotorSayisi(int motorSayisi) {
this.MotorSayisi = motorSayisi;
}
public int getYukMiktari() {
return YukMiktari;
}
public void setYukMiktari(int yukMiktari) {
this.YukMiktari = yukMiktari;
}
public String getRobotTipi() {
return RobotTipi;
}
public void setRobotTipi(String robotTipi) {
this.RobotTipi = robotTipi;
}
public int getYukKapasitesi() {
return YukKapasitesi;
}
public void setYukKapasitesi(int yukKapasitesi) {
this.YukKapasitesi = yukKapasitesi;
}
public int getKolUzunlugu() {
return KolUzunlugu;
}
public void setKolUzunlugu(int kolUzunlugu) {
this.KolUzunlugu = kolUzunlugu;
}
public int getTasimaHizi() {
return TasimaHizi;
}
public void setTasimaHizi(int tasimaHizi) {
this.TasimaHizi = tasimaHizi;
}
public int getGezinmeHizi() {
return GezinmeHizi;
}
public void setGezinmeHizi(int gezinmeHizi) {
this.GezinmeHizi = gezinmeHizi;
}
 
}
//--------------------------------------------------------------------------------------------> Main

public class Main {

	public static void gui(int x1, int y1, int x2, int y2, int engelx[], int engely[], int engelSayisi) {
		JFrame gui = new JFrame();
		gui.setTitle("IZGARA");
		gui.setSize(1000, 1000);
		
		JPanel izgara = new JPanel();
		izgara.setLayout(new GridLayout(20, 20));
		JButton[][] Buttons = new JButton[20][20];
		
		for(int i=19;i>=0;i--) {
			for(int j=0; j<20; j++) {
				Buttons[i][j] = new JButton("");
				izgara.add(Buttons[i][j]);
			}
		}
		Buttons[x1][y1].setBackground(Color.RED);
		Buttons[x2][y2].setBackground(Color.GREEN);
		
		for(int i=0; i<engelSayisi; i++) {
			Buttons[engelx[i]][engely[i]].setBackground(Color.BLACK);
		}
		
		gui.add(izgara);
		gui.setVisible(true);
		
	}
	public static void gui(int x1, int y1, int x2, int y2) {
		JFrame gui = new JFrame();
		gui.setTitle("IZGARA");
		gui.setSize(1000, 1000);
		
		JPanel izgara = new JPanel();
		izgara.setLayout(new GridLayout(20, 20));
		JButton[][] Buttons = new JButton[20][20];
		
		for(int i=19;i>=0;i--) {
			for(int j=0; j<20; j++) {
				Buttons[i][j] = new JButton("");
				izgara.add(Buttons[i][j]);
			}
		}
		Buttons[x1][y1].setBackground(Color.RED);
		Buttons[x2][y2].setBackground(Color.GREEN);
		
		gui.add(izgara);
		gui.setVisible(true);
		
	}
	public static void gui(int x1, int y1, int x2, int y2, int x3, int y3, int engelx[], int engely[], int engelSayisi) {
		JFrame gui = new JFrame();
		gui.setTitle("IZGARA");
		gui.setSize(1000, 1000);
		
		JPanel izgara = new JPanel();
		izgara.setLayout(new GridLayout(20, 20));
		JButton[][] Buttons = new JButton[20][20];
		
		for(int i=19;i>=0;i--) {
			for(int j=0; j<20; j++) {
				Buttons[i][j] = new JButton("");
				izgara.add(Buttons[i][j]);
			}
		}
		Buttons[x1][y1].setBackground(Color.RED);
		Buttons[x2][y2].setBackground(Color.GREEN);
		Buttons[x3][y3].setBackground(Color.BLUE);
		
		for(int i=0; i<engelSayisi; i++) {
			Buttons[engelx[i]][engely[i]].setBackground(Color.BLACK);
		}
		
		gui.add(izgara);
		gui.setVisible(true);
		
	}
public static void gezginHareketi(int RobotTipi, int hiz, double gecmeSuresi) {      //----------------------------->Gezgin Hareketi
Scanner scan=new Scanner(System.in);
int Robot=RobotTipi;
double gecenZaman=0;
int yenix,yeniy;
int x,y,engelSayisi=0;
int engelCevap;
int[] engelx=new int[20];
int[] engely=new int[20];
do {
System.out.print("Robotun baslangic yeri icin X koordinatini giriniz :");
x=scan.nextInt();
System.out.print("Robotun baslangic yeri icin Y koordinatini giriniz :");
y=scan.nextInt();
if(x<0 || x>20 || y<0 || y>20)
System.out.println("X ve Y degerleri 0 ile 20 arasýnda olmali!");
}while(x<0 || x>20 || y<0 || y>20);

System.out.print("Engel konulacak mi? Engel konulacaksa klavyeden '0' giriniz : ");
engelCevap=scan.nextInt();
if(engelCevap==0) {

System.out.print("Kac adet engel konulacak :");
engelSayisi=scan.nextInt();

for(int i=0;i<engelSayisi;i++)
{
System.out.print((i+1)+". Engelin x koordinatini giriniz :");
engelx[i]=scan.nextInt();
System.out.print((i+1)+". Engelin y koordinatini giriniz :");
engely[i]=scan.nextInt();
 
}
}

System.out.print("+X (Sað) yonunde kac birim hareket edecek :");
int x1=scan.nextInt();
yenix=x+x1;
if(Robot==1) {
gecenZaman=gecenZaman+(double)x1*10/(double)hiz;
}
if(engelCevap==0 && Robot==1) {
for(int i=0;i<engelSayisi;i++) {
if(engelx[i]>x && engelx[i]<yenix && engely[i]==y) {
gecenZaman+=(double)gecmeSuresi;
}
}
 
}
if(Robot==2) {
gecenZaman=gecenZaman+(double)x1*10/(double)hiz;
}
if(engelCevap==0 && Robot==2) {
for(int i=0;i<engelSayisi;i++) {
if(engelx[i]>x && engelx[i]<yenix && engely[i]==y) {
gecenZaman+=(double)gecmeSuresi;
}
}
 
}
if(engelCevap==0 && Robot==3) {
for(int i=0;i<engelSayisi;i++) {
if(engelx[i]>x && engelx[i]<yenix && engely[i]==y) {
System.out.println("Spider robotlar engelden gecemez!");
yenix=engelx[i]-1;
}
}
 
}


System.out.print("-X (Sol) yonunde kac birim hareket edecek :");
int x2=scan.nextInt();
yenix-=x2;
if(Robot==1) {
gecenZaman=gecenZaman+(double)x2*10/(double)hiz;
}
if(engelCevap==0 && Robot==1) {
for(int i=0;i<engelSayisi;i++) {
if(engelx[i]<x && engelx[i]>yenix && engely[i]==y) {
gecenZaman+=(double)gecmeSuresi;
}
}
 
}
if(Robot==2) {
gecenZaman=gecenZaman+(double)x2*10/(double)hiz;
}
if(engelCevap==0 && Robot==2) {
for(int i=0;i<engelSayisi;i++) {
if(engelx[i]<x && engelx[i]>yenix && engely[i]==y) {
gecenZaman+=(double)gecmeSuresi;
}
}
 
}
if(engelCevap==0 && Robot==3) {
for(int i=0;i<engelSayisi;i++) {
if(engelx[i]<x && engelx[i]>yenix && engely[i]==y) {
System.out.println("Spider robotlar engelden gecemez!");
yenix=engelx[i]+1;
}
}

}
System.out.print("+Y (Yukari) yonunde kac birim hareket edecek :");
int y1=scan.nextInt();
yeniy=y+y1;
if(Robot==1) {
gecenZaman=gecenZaman+(double)y1*10/(double)hiz;
}
if(engelCevap==0 && Robot==1) {
for(int i=0;i<engelSayisi;i++) {
if(engely[i]>x && engely[i]<yenix && engelx[i]==yenix) {
gecenZaman+=(double)gecmeSuresi;
}
}
 
}
if(Robot==2) {
gecenZaman=gecenZaman+(double)y1*10/(double)hiz;
}
if(engelCevap==0 && Robot==2) {
for(int i=0;i<engelSayisi;i++) {
if(engely[i]>x && engely[i]<yenix && engelx[i]==yenix) {
gecenZaman+=(double)gecmeSuresi;
}
}
 
}
if(engelCevap==0 && Robot==3) {
for(int i=0;i<engelSayisi;i++) {
if(engely[i]>x && engely[i]<yenix && engelx[i]==yenix) {
System.out.println("Spider robotlar engelden gecemez!");
yeniy=engely[i]-1;
}
}
 
}
System.out.print("-Y (Asagi) yonunde kac birim hareket edecek :");
int y2=scan.nextInt();
yeniy-=y2;
if(Robot==1) {
gecenZaman=gecenZaman+(double)y2*10/(double)hiz;
}
if(engelCevap==0 && Robot==1) {
for(int i=0;i<engelSayisi;i++) {
if(engely[i]<y && engely[i]>yeniy && engelx[i]==yenix) {
gecenZaman+=(double)gecmeSuresi;
}
}
 
}
if(Robot==2) {
gecenZaman=gecenZaman+(double)y2*10/(double)hiz;
}
if(engelCevap==0 && Robot==2) {
for(int i=0;i<engelSayisi;i++) {
if(engely[i]<y && engely[i]>yeniy && engelx[i]==yenix) {
gecenZaman+=(double)gecmeSuresi;
}
}
 
}
if(engelCevap==0 && Robot==3) {
for(int i=0;i<engelSayisi;i++) {
if(engely[i]<y && engely[i]>yeniy && engelx[i]==yenix) {
System.out.println("Spider robotlar engelden gecemez!");
yeniy=engely[i]+1;
}
}

}
if(yenix<0 || yenix>20 || yeniy<0 || yeniy>20)
System.out.println("Robot izgaranin disina cikti!");
else
System.out.println("Robotun son konumu :" +yenix+ ","+yeniy);
    System.out.println("Robotun konum deðiþim süresince gecen zaman : "+gecenZaman+ " sn");
    System.out.println("Kýrmýzý = Baþlangýç - Yeþil = Son - Siyah = Engel");
    gui(x,y,yenix,yeniy,engelx,engely,engelSayisi);


}

public static void sabitHareketi(int kolUzunlugu, int tasimaHizi) {            //---------------------------->Sabit (Manipülatör) hareketi
Scanner scan=new Scanner(System.in);
int x,y, yenix,yeniy;
double mesafe, gecenZaman=0;
do {
System.out.print("Robotun sabitlenme yeri icin X koordinatini giriniz :");
x=scan.nextInt();
System.out.print("Robotun sabitlenme yeri icin Y koordinatini giriniz :");
y=scan.nextInt();
if(x<0 || x>20 || y<0 || y>20)
System.out.println("X ve Y degerleri 0 ile 20 arasýnda olmali!");
}while(x<0 || x>20 || y<0 || y>20);

do {
System.out.print("+X (Sað) yonunde kac birim hareket edecek :");
int x1=scan.nextInt();
yenix=x+x1;
gecenZaman=gecenZaman+(double)x1*10/(double)tasimaHizi;
System.out.print("-X (Sol) yonunde kac birim hareket edecek :");
int x2=scan.nextInt();
yenix-=x2;
gecenZaman=gecenZaman+(double)x2*10/(double)tasimaHizi;
System.out.print("+Y (Yukari) yonunde kac birim hareket edecek :");
int y1=scan.nextInt();
yeniy=y+y1;
gecenZaman=gecenZaman+(double)y1*10/(double)tasimaHizi;
System.out.print("-Y (Asagi) yonunde kac birim hareket edecek :");
int y2=scan.nextInt();
yeniy-=y2;
gecenZaman=gecenZaman+(double)y2*10/(double)tasimaHizi;
mesafe=Math.sqrt(Math.pow((yenix-x), 2)+Math.pow((yeniy-y), 2));
if(mesafe>kolUzunlugu) {
System.out.println("Kol uzunlugunu astiniz. Koordinatlari tekrar girin!");
}
}while(mesafe>kolUzunlugu);
if(yenix<0 || yenix>20 || yeniy<0 || yeniy>20)
System.out.println("Yuk izgaranin disina cikti!");
else
System.out.println("Yukun son konumu :" +yenix+ ","+yeniy);
System.out.println("Toplam hareket suresi : "+gecenZaman+" sn");
System.out.println("Kýrmýzý = Robotun Bulunduðu Konum - Yeþil = Yükün Konumu");
gui(x,y,yenix,yeniy);

}

public static void hibritHareketi(int sabitlenmeSuresi, int gecisSuresi, int gezinmeHizi, int tasimaHizi, int kolUzunlugu, int yukAktarmaSuresi) {  // ------>Hibrit Hareketi                           
Scanner scan=new Scanner(System.in);
int x,y,yenix,yeniy,yenixx,yeniyy,engelCevap,engelSayisi=0;
double gecenZaman=0,mesafe,sonZaman;
int[] engelx=new int[20];
int[] engely=new int[20];
do {
System.out.print("Robotun baslangic yeri icin X koordinatini giriniz :");
x=scan.nextInt();
System.out.print("Robotun baslangic yeri icin Y koordinatini giriniz :");
y=scan.nextInt();
if(x<0 || x>20 || y<0 || y>20)
System.out.println("X ve Y degerleri 0 ile 20 arasýnda olmali!");
}while(x<0 || x>20 || y<0 || y>20);

System.out.print("Engel konulacak mi? Engel konulacaksa klavyeden '0' giriniz : ");
engelCevap=scan.nextInt();
if(engelCevap==0) {

System.out.print("Kac adet engel konulacak :");
engelSayisi=scan.nextInt();

for(int i=0;i<engelSayisi;i++)
{
System.out.print((i+1)+". Engelin x koordinatini giriniz :");
engelx[i]=scan.nextInt();
System.out.print((i+1)+". Engelin y koordinatini giriniz :");
engely[i]=scan.nextInt();
 
}
}

System.out.print("+X (Sað) yonunde kac birim harekt edecek :");
int x1=scan.nextInt();
yenix=x+x1;
gecenZaman=gecenZaman+(double)x1*10/(double)gezinmeHizi;
    if(engelCevap==0) {
for(int i=0;i<engelSayisi;i++) {
if(engelx[i]>x && engelx[i]<yenix && engely[i]==y) {
gecenZaman+=(double)gecisSuresi;
  }
    }
 
    }
System.out.print("-X (Sol) yonunde kac birim harekt edecek :");
int x2=scan.nextInt();
yenix-=x2;
gecenZaman=gecenZaman+(double)x2*10/(double)gezinmeHizi;
if(engelCevap==0) {
for(int i=0;i<engelSayisi;i++) {
if(engelx[i]>x && engelx[i]<yenix && engely[i]==y) {
gecenZaman+=(double)gecisSuresi;
  }
    }
 
    
}
System.out.print("+Y (Yukari) yonunde kac birim harekt edecek :");
int y1=scan.nextInt();
yeniy=y+y1;
gecenZaman=gecenZaman+(double)y1*10/(double)gezinmeHizi;
if(engelCevap==0) {
for(int i=0;i<engelSayisi;i++) {
if(engelx[i]>x && engelx[i]<yenix && engely[i]==y) {
gecenZaman+=(double)gecisSuresi;
  }
    }
 
    
}
System.out.print("-Y (Asagi) yonunde kac birim hareket edecek :");
int y2=scan.nextInt();
yeniy-=y2;
gecenZaman=gecenZaman+(double)y2*10/(double)gezinmeHizi;
if(engelCevap==0) {
for(int i=0;i<engelSayisi;i++) {
if(engelx[i]>x && engelx[i]<yenix && engely[i]==y) {
gecenZaman+=(double)gecisSuresi;
  }
    }
 
    
}
if(yenix<0 || yenix>20 || yeniy<0 || yeniy>20)
System.out.println("Robot izgaranin disina cikti!");
else
System.out.println("Robotun sabitlendigi konum :" +yenix+ ","+yeniy);
    gecenZaman+=sabitlenmeSuresi+yukAktarmaSuresi;
    do {
    do {
    sonZaman=gecenZaman;
System.out.print("+X (Sað) yonunde kac birim hareket edecek :");
int xx1=scan.nextInt();
yenixx=yenix+xx1;
sonZaman=sonZaman+(double)xx1*10/(double)tasimaHizi;
System.out.print("-X (Sol) yonunde kac birim hareket edecek :");
int xx2=scan.nextInt();
yenixx-=xx2;
sonZaman=sonZaman+(double)xx2*10/(double)tasimaHizi;
System.out.print("+Y (Yukari) yonunde kac birim hareket edecek :");
int yy1=scan.nextInt();
yeniyy=yeniy+yy1;
sonZaman=sonZaman+(double)yy1*10/(double)tasimaHizi;
System.out.print("-Y (Asagi) yonunde kac birim hareket edecek :");
int yy2=scan.nextInt();
yeniyy-=yy2;
sonZaman=sonZaman+(double)yy2*10/(double)tasimaHizi;
mesafe= Math.sqrt(Math.pow((yenixx-yenix), 2)+Math.pow((yeniyy-yeniy), 2));
if(mesafe>kolUzunlugu) {
System.out.println("Kol uzunlugunu astiniz. Koordinatlari tekrar girin!");
}
}while(mesafe>kolUzunlugu);
if(yenixx<0 || yenixx>20 || yeniyy<0 || yeniyy>20)
System.out.println("Yuk izgaranin disina cikti! Tekrar degerleri giriniz!");

            }while(yenixx<0 || yenixx>20 || yeniyy<0 || yeniyy>20);
    System.out.println("Toplam hareket suresi : "+sonZaman+" sn");
    System.out.println("Kýrmýzý = Baþlangýç - Yeþil = Son - Mavi = Yük - Siyah = Engel");
gui(x,y,yenix,yeniy,yenixx,yeniyy,engelx,engely,engelSayisi);
}


public static void main(String[] args) {
Scanner scan=new Scanner(System.in);


Gezgin gezgin=new Hibrit();
Gezmeyen gezmeyen=new Hibrit();
Robot robot=new Hibrit();


Tekerlekli tekerlekli=new Tekerlekli();
Paletli paletli=new Paletli();
Spider spider=new Spider();
Hibrit hibrit=new Hibrit();
Seri seri=new Seri();
Paralel paralel=new Paralel();
 

int cevap;

do
{

System.out.println("Tekerlekli icin 1 :");
System.out.println("Paletli icin    2 :");
System.out.println("Spider icin     3 :");
System.out.println("Hibrit icin     4 :");
System.out.println("Seri için       5 :");
System.out.println("Paralel icin    6 :");
System.out.print("Olusturulacak robot tipini giriniz :");

int robotSecim=scan.nextInt();

switch(robotSecim)
{
case 1:        //Tekerlekli

/*
private int TekerlekSayisi;
private double EngeldenGecmeSuresi;
private int MotorSayisi;
private int YukMiktari;  
private String RobotTipi;
private int GezinmeHizi;
*/

System.out.print("Tekerlek sayisini giriniz :");
int tekerlekSayisi=scan.nextInt();
tekerlekli.setTekerlekSayisi(tekerlekSayisi);
System.out.print("Motor sayisini giriniz :");
int motorSayisi=scan.nextInt();
tekerlekli.setMotorSayisi(motorSayisi);
double engeldenGecmeSuresi=tekerlekli.EngelGecmeSuresiBul(motorSayisi);
tekerlekli.setEngeldenGecmeSuresi(engeldenGecmeSuresi);
System.out.print("Yuk miktarini giriniz : ");
int yukMiktari=scan.nextInt();
tekerlekli.setYukMiktari(yukMiktari);
tekerlekli.setRobotTipi("Tekerlekli");
System.out.print("Gezinme hizini giriniz :");
int gezinmeHizi=scan.nextInt();
tekerlekli.setGezinmeHizi(gezinmeHizi);
gezginHareketi(1,tekerlekli.getGezinmeHizi(),tekerlekli.getEngeldenGecmeSuresi());
break;

case 2:     //Paletli

/*
private int PaletSayisi;
private double EngeldenGecmeSuresi;
private int MotorSayisi;
private int YukMiktari;  
private String RobotTipi;
private int GezinmeHizi;
*/

System.out.print("Palet sayisini giriniz : ");
int paletSayisi=scan.nextInt();
paletli.setPaletSayisi(paletSayisi);
System.out.print("Motor sayisini giriniz : ");
int motorSayisiPaletli=scan.nextInt();
paletli.setMotorSayisi(motorSayisiPaletli);
double engeldenGecmeSuresiPaletli=paletli.EngelGecmeSuresiBul(motorSayisiPaletli);
paletli.setEngeldenGecmeSuresi(engeldenGecmeSuresiPaletli);
System.out.print("Yuk miktarini giriniz : ");
int yukMiktariPaletli=scan.nextInt();
paletli.setYukMiktari(yukMiktariPaletli);
String robotTipiPaletli="Paletli";
paletli.setRobotTipi(robotTipiPaletli);
System.out.print("Gezinme hizini giriniz :");
int gezinmeHiziPaletli=scan.nextInt();
paletli.setGezinmeHizi(gezinmeHiziPaletli);
 
gezginHareketi(2,paletli.getGezinmeHizi(),paletli.getEngeldenGecmeSuresi());
break;

case 3:    // Spider


/*
private int BacakSayisi;
private int MotorSayisi;
private int YukMiktari;  
private String RobotTipi;
private int GezinmeHizi;
*/

System.out.print("Bacak sayisini giriniz : ");
int bacakSayisi=scan.nextInt();
spider.setBacakSayisi(bacakSayisi);
System.out.print("Motor sayisini giriniz : ");
int motorSayisiSpider=scan.nextInt();
spider.setMotorSayisi(motorSayisiSpider);
System.out.print("Yuk miktarini giriniz : ");
int yukMiktariSpider=scan.nextInt();
spider.setYukMiktari(yukMiktariSpider);
String robotTipiSpider="Spider";
spider.setRobotTipi(robotTipiSpider);
System.out.print("Gezinme hizi giriniz : ");
int gezinmeHiziSpider=scan.nextInt();
spider.setGezinmeHizi(gezinmeHiziSpider);
gezginHareketi(3,spider.getGezinmeHizi(),1);

break;

case 4:    //Hibrit


/*
        SabitlenmeSuresi = sabitlenmeSuresi;
    GecisSuresi = gecisSuresi;
    
MotorSayisi = motorSayisi;
    
YukMiktari = yukMiktari;
    RobotTipi = robotTipi;
    
YukKapasitesi = yukKapasitesi;
    
KolUzunlugu = kolUzunlugu;
    
TasimaHizi = tasimaHizi;
    
GezinmeHizi = gezinmeHizi;
    
EngeldenGecmeSuresi;
*/

System.out.print("Sabitlenme suresi giriniz : ");
int sabitlenmeSuresi=scan.nextInt();
hibrit.setSabitlenmeSuresi(sabitlenmeSuresi);
System.out.print("Gecis suresi giriniz : ");
int gecisSuresi=scan.nextInt();
hibrit.setGecisSuresi(gecisSuresi);
System.out.print("Motor sayisi giriniz : ");
int motorSayisiHibrit=scan.nextInt();
hibrit.setMotorSayisi(motorSayisiHibrit);
hibrit.setRobotTipi("Hibrit");
System.out.print("Yuk kapasitesini giriniz :");
int yukKapasitesiHibrit=scan.nextInt();
hibrit.setYukKapasitesi(yukKapasitesiHibrit);
System.out.print("Kol uzunluðunu giriniz : ");
int kolUzunluguHibrit=scan.nextInt();
hibrit.setKolUzunlugu(kolUzunluguHibrit);
System.out.print("Tasima hizini giriniz : ");
    int tasimaHiziHibrit=scan.nextInt();
    hibrit.setTasimaHizi(tasimaHiziHibrit);
    System.out.print("Gezinme hizini giriniz : ");
    int gezinmeHiziHibrit=scan.nextInt();
    hibrit.setGezinmeHizi(gezinmeHiziHibrit);
    System.out.print("Yuk aktarma suresini giriniz :");
    int yukAktarmaSuresi=scan.nextInt();
   
    do {
    System.out.print("Yuk miktarini giriniz :");
int yukMiktariHibrit=scan.nextInt();
hibrit.setYukMiktari(yukMiktariHibrit);
if(hibrit.getYukKapasitesi()<hibrit.getYukMiktari())
System.out.println("Yuk miktari yuk kapasitesinden fazla olamaz yeni yuk miktari giriniz!");
    }while(hibrit.getYukKapasitesi()<hibrit.getYukMiktari());
   
    hibritHareketi(hibrit.getSabitlenmeSuresi(),hibrit.getGecisSuresi(),hibrit.getGezinmeHizi(), hibrit.getTasimaHizi(),hibrit.getKolUzunlugu(),yukAktarmaSuresi);
break;

case 5:      //Seri


/*
private int MaxUzunluk;    //=kol uzunluðu
private int MotorSayisi;
    private int YukMiktari;  
    private String RobotTipi;
    private int YukKapasitesi;
    private int KolUzunlugu;
    private int TasimaHizi;
    */

System.out.print("Maksimum uzunlugu giriniz :");
int maxUzunlukSeri=scan.nextInt();
seri.setMaxUzunluk(maxUzunlukSeri);
System.out.print("Motor sayisini giriniz : ");
int motorSayisiSeri=scan.nextInt();
seri.setMotorSayisi(motorSayisiSeri);
seri.setRobotTipi("Seri");
System.out.print("Yuk kapasitesi giriniz : ");
int yukKapasitesiSeri=scan.nextInt();
seri.setYukKapasitesi(yukKapasitesiSeri);
int kolUzunluguSeri=seri.getMaxUzunluk();
seri.setKolUzunlugu(kolUzunluguSeri);
System.out.print("Tasima hizini giriniz : ");
int tasimaHiziSeri=scan.nextInt();
seri.setTasimaHizi(tasimaHiziSeri);

do {
System.out.print("Yuk miktarini giriniz : ");
int yukMiktariSeri=scan.nextInt();
seri.setYukMiktari(yukMiktariSeri);
if(seri.getYukKapasitesi()<seri.getYukMiktari())
System.out.println("Yuk miktari yuk kapasitesinden fazla olamaz yeni yuk miktari giriniz!");
}while(seri.getYukKapasitesi()<seri.getYukMiktari());

sabitHareketi(seri.getKolUzunlugu(),seri.getTasimaHizi());
break;

case 6:         //Paralel


/*
private int MaxUzunluk;    //=KolUzunlugu;
private int MotorSayisi;
private int YukMiktari;  
private String RobotTipi;
private int YukKapasitesi;
private int KolUzunlugu;
private int TasimaHizi;  
*/

System.out.print("Maksimum uzunlugu giriniz : ");
int maxUzunlukParalel=scan.nextInt();
paralel.setMaxUzunluk(maxUzunlukParalel);
System.out.print("Motor sayisini giriniz : ");
int motorSayisiParalel=scan.nextInt();
paralel.setMotorSayisi(motorSayisiParalel);
paralel.setRobotTipi("Paralel");
System.out.print("Yuk kapasitesini giriniz : ");
int yukKapasitesiParalel=scan.nextInt();
paralel.setYukKapasitesi(yukKapasitesiParalel);
int kolUzunluguParalel=paralel.getMaxUzunluk();
paralel.setKolUzunlugu(kolUzunluguParalel);
System.out.print("Tasima hizini giriniz : ");
int tasimaHiziParalel=scan.nextInt();
paralel.setTasimaHizi(tasimaHiziParalel);

do {
System.out.print("Yuk miktarini giriniz : ");
int yukMiktariParalel=scan.nextInt();
paralel.setYukMiktari(yukMiktariParalel);
if(paralel.getYukKapasitesi()<paralel.getYukMiktari())
System.out.println("Yuk miktari yuk kapasitesinden fazla olamaz yeni yuk miktari giriniz!");
}while(paralel.getYukKapasitesi()<paralel.getYukMiktari());

sabitHareketi(paralel.getKolUzunlugu(),paralel.getTasimaHizi());
break;
 
default : 
System.out.println("Gecerli bir deger girmediniz!");
break;
}
System.out.print("Yeni bir robot girmek istiyorsaniz '0' a basiniz : ");
cevap=scan.nextInt();

}while(cevap==0);
 

}


}

