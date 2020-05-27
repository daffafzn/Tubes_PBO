import java.util.*;
import java.util.Scanner;
import java.io.IOException;


 //DAFFA
 class BangunRuang{
	float volume(){

		return 0;
	}
	float kubus(){
		System.out.println("\t\t\tRumus\n=========================================================\nVolume \t\t\t\t: s^3\nLuas Permukaan \t\t\t: 6*s^2\nKeliling \t\t\t: 12*s\n=========================================================\ns = sisi");
		return 0;
	}
	float balok(){
		System.out.println("\t\t\tRumus\n=========================================================\nVolume \t\t\t\t: p*l*t\nLuas Permukaan \t\t\t: 2*(p*l + p*t +l*t)\nKeliling \t\t\t: 4*(p+l+t)\n=========================================================\np = panjang, l = lebar, t = tinggi");
		return 0;
	}
	float prisma_segitiga(){
		System.out.println("\t\t\tRumus\n=========================================================\nVolume \t\t\t\t: (1/2 x Alas Segitiga x Tinggi Segitiga) x Tinggi Prisma\nLuas Permukaan \t\t\t: {2 x (1/2 x a.s x t.s)} + 3 x t x t.s\n=========================================================\na.s = alas segitiga, t.s = tinggi segitiga, t = tinggi prisma");
		return 0;
	}
	float limas_segiempat(){
		System.out.println("\t\t\tRumus\n=========================================================\nVolume \t\t\t\t: 1/3*luas_alas*t\nLuas Permukaan \t\t\t: luas_alas+luas_selimut\n=========================================================\nt = tinggi");
		return 0;
	}
	float limas_segitiga(){
		System.out.println("\t\t\tRumus\n=========================================================\nVolume \t\t\t\t: 1/3*luas_alas*t\nLuas Permukaan \t\t\t:  L_alas+L_selimut\n=========================================================\nLa = luas alas, t = tinggi, ");
		return 0;
	}
	float tabung(){
		System.out.println("\t\t\tRumus\n=========================================================\nVolume \t\t\t\t: PI×r×r×t\nLuas Permukaan \t\t\t:  2 × π × r × (r + t)\n=========================================================\nPI = 3.14, r = jari-jari, t = tinggi");
		
		return 0;
	}
	float kerucut(){
		System.out.println("\t\t\tRumus\n=========================================================\nVolume \t\t\t\t: 1/3*π*r*r*t\nLuas Permukaan \t\t\t:  π*r*(r + s)\n=========================================================\nPI = 3.14, s = panjang garis pelukis, r = jari2, t = tinggi");
		return 0;
	}
	float bola(){
		System.out.println("\t\t\tRumus\n=========================================================\nVolume \t\t\t\t: 4/3*π*r*r*r\nLuas Permukaan \t\t\t:  4*π*r*r\n=========================================================\nr = jari-jari, PI = 3.14");
		return 0;
	}	
	float keliling(){
		
		return 0;
	}
	float luaspermukaan(){
		return 0;
	}
}

class BangunDatar{
	float luas(){
		return 0;
	}
	float keliling(){
		return 0;
	}
	float persegi(){
		System.out.println("\t\t\tRumus\n=========================================================\nLuas \t\t\t\t: sisi*sisi\nKeliling \t\t\t:  4*sisi\n=========================================================");
		return 0;
	}
	float lingkaran(){
		System.out.println("\t\t\tRumus\n=========================================================\nLuas \t\t\t\t: p*r*r\nKeliling \t\t\t:  2*p*r\n=========================================================\np = 3.14, r = jari-jari");
		return 0;
	}
	float persegi_panjang(){
		System.out.println("\t\t\tRumus\n=========================================================\nLuas \t\t\t\t: p*l\nKeliling \t\t\t:  2*(p+l)\n=========================================================\np = panjang, l = lebar");
		return 0;
	}
	float segitiga(){
		System.out.println("\t\t\tRumus\n=========================================================\nLuas \t\t\t\t: 1/2*a*t\nKeliling \t\t\t:  sisi*3\n=========================================================\na = alas, t = tinggi");
		return 0;
	}
}

class Persegi extends BangunDatar{
	float sisi;

	@Override
	float luas(){
		 float luas = sisi * sisi;
		 System.out.println ("Luas Persegi \t\t\t: "+luas+" cm persegi");
		 return luas;
	}

	@Override
	float keliling(){
		float keliling = sisi*4;
		System.out.println ("keliling Persegi \t\t: "+keliling+" cm");
		return keliling;
	}
}

class Lingkaran extends BangunDatar{
	float r;

	@Override
	float luas(){
		float luas = (float) Math.PI * r * r;
		System.out.println ("Luas Lingkaran \t\t\t: "+luas+" cm persegi");
		return luas;

	}

	@Override
	float keliling(){
		float keliling = (float) Math.PI * 2 * r;
		System.out.println ("keliling Lingkaran \t\t: "+keliling+" cm");
		return keliling;
	}
}

class PersegiPanjang extends BangunDatar{
	float alas, lebar;

	@Override
	float luas(){
		float luas = alas * lebar;
		System.out.println ("Luas Persegi Panjang \t\t: "+luas+" cm persegi");
		return luas;
	}

	@Override
	float keliling(){
		float keliling = 2*alas + 2*lebar;
		System.out.println("keliling Persegi Panjang \t: "+keliling+" cm");
		return keliling;
	}
}

class Segitiga extends BangunDatar{
	float alas, tinggi;

	@Override
	float luas(){
		float luas = (float) 0.5*alas*tinggi;
		System.out.println ("Luas segitiga \t\t: "+luas+" cm persegi");
		return luas;
	}
	

}

class Kubus extends BangunRuang{
	float sisi;
	
	@Override
	float volume(){
		float volume = sisi*sisi*sisi;
		System.out.println("Volume Kubus  \t\t\t:"+volume+" cm kubik");
		return volume;
	}

	@Override
	float luaspermukaan(){
		float luaspermukaan = (float) 6*(sisi*sisi);
		System.out.println("Luas Permukaan Kubus  \t\t:"+luaspermukaan+" cm persegi");
		return luaspermukaan; 
	}

	@Override
	float keliling(){
		float keliling = 12*sisi;
		System.out.println("keliling Kubus  \t\t:"+keliling+" cm");
		return keliling;
	}

}

class Balok extends BangunRuang{
	float panjang, lebar, tinggi;

	@Override
	float volume(){
		float volume = panjang*lebar*tinggi;
		System.out.println("Volume Balok \t\t\t: "+volume+" cm kubik");
		return volume;
	}

	@Override
	float luaspermukaan(){
		float luaspermukaan = (float) 2*(panjang*lebar + lebar*tinggi + panjang*tinggi);
		System.out.println("Luas Permukaan Balok \t\t: "+luaspermukaan+" cm persegi");
		return luaspermukaan;
	}

	@Override
	float keliling(){
		float keliling = (float) 4*(panjang+lebar+tinggi);
		System.out.println("keliling Balok \t\t\t: "+keliling+" cm");
		return keliling;
	}
}

class PrismaSegitiga extends BangunRuang{
	float panjang, luasalas, tinggi, kelilingalas;

	
	
	

	@Override
	float volume(){
		luasalas = panjang*tinggi;
		float volume = luasalas*tinggi;
		System.out.println("Volume Prisma Segitiga \t\t: "+volume+" cm kubik");
		return volume;

	}

	@Override
	float luaspermukaan(){
		kelilingalas = 2*(panjang*tinggi);
		float luaspermukaan = (float) (kelilingalas*tinggi+2*luasalas);
		System.out.println("Luas Permukaan \t\t\t: "+luaspermukaan+" cm persegi");
		return luaspermukaan;
	}


}


class LimasSegiempat extends BangunRuang{
	float p, l, t;

	@Override
	float volume(){
		float volume = (float) 0.333*p*l*t;
		System.out.println("Volume Limas Segiempat \t\t: "+volume+" cm kubik");
		return volume;
	}
}


class LimasSegitiga extends BangunRuang{
	float alas, tinggi, luasalas;

	@Override
	float volume(){
		luasalas = (float) 1/2*alas*tinggi;
		float volume = (float) 0.333*luasalas*tinggi;
		System.out.println("Volume Limas Segitiga \t\t: "+volume+" cm kubik");
		return volume;


	}

}

class Tabung extends BangunRuang{
	float r, t;


	@Override
	float volume(){
		float volume = (float) Math.PI*r*r*t;
		System.out.println("Volume Tabung \t\t\t: "+volume+" cm kubik");
		return volume;
	}

	@Override

	float luaspermukaan(){
		float luasalas = (float) Math.PI*r*r;
		float kelilingalas = (float) Math.PI*r*2;
		float luaspermukaan = (float) (luasalas*2+kelilingalas*t);
		System.out.println("Luas Permukaan Tabung \t\t: "+luaspermukaan+" cm persegi");
		return luaspermukaan;

	}
}



class Kerucut extends BangunRuang{
	float r, t, s;

	@Override
	float volume(){
		float volume = (float) Math.PI*r*r*t*0.333F;
		System.out.println("Volume Kerucut \t\t: "+volume+" cm kubik");
		return volume;

	}


	@Override
	float luaspermukaan(){
		float luaspermukaan = (float) (Math.PI*r*s+Math.PI*r*r);
		System.out.println("Luas Permukaan \t\t: "+luaspermukaan+" cm persegi");
		return luaspermukaan;
	}
}

class Bola extends BangunRuang{
	float r;

	@Override
	float volume(){
		float volume = (float) Math.PI*r*r*r*1.333F;
		System.out.println("Volume Bola \t\t\t: "+volume+" cm kubik");
		return volume;
	}

	@Override
	float luaspermukaan(){
		float luaspermukaan = (float) Math.PI*r*r*4F;
		System.out.println("luaspermukaan Bola \t\t: "+luaspermukaan+" cm persegi");
		return luaspermukaan;
	}
}
//NABHAN
class Perkec{
	Scanner in = new Scanner(System.in);
	float percepatan(){
		System.out.print("Masukkan jarak : ");
		int jrk = in.nextInt();
		System.out.print("Masukkan waktu : ");
		int wkt = in.nextInt();
		float hasil = jrk/wkt;
		System.out.println("=========================================================");
		System.out.println("Kecepatan : "+hasil+" m/s");
		System.out.println("=========================================================");
		return 0;
	}
	float kecepatan(){
		System.out.print("Masukkan perubahan kecepatan : ");
		float pk = in.nextFloat();
		System.out.print("Masukkan perubahan waktu : ");
		float pw = in.nextFloat();
		float hasil2 = (float) pk/pw;
		System.out.println("=========================================================");
		System.out.println("Kecepatan : "+hasil2+" m/s");
		System.out.println("=========================================================");
		return 0;
	}
}

//REZA
class Aritmatika{
	Scanner in = new Scanner (System.in);
	int n, a, b;
	float Un, Sn;
	
	float BarisAritmatika() {
		System.out.print (">>Masukkan n : ");
		n = in.nextInt();
		System.out.print (">>Masukkan suku pertama : ");
		a = in.nextInt();
		System.out.print (">>Masukkan Selisih / beda : ");
		b = in.nextInt();
		System.out.println("=========================================================");
		System.out.println ("rumus baris aritmatika Un = a + (n-1) b");
		System.out.println("=========================================================");
		Un = a + (n - 1) * b;
		System.out.println ("Hasil Baris Aritmatika = " + Un);
		System.out.println("=========================================================");
		return 0;
	}
	
	float DeretAritmatika() {
		System.out.print (">>Masukkan n : ");
		n = in.nextInt();
		System.out.print (">>Masukkan suku pertama : ");
		a = in.nextInt();
		System.out.print (">>Masukkan Selisih / beda : ");
		b = in.nextInt();
		System.out.println("=========================================================");
		System.out.println ("rumus deret aritmatika Sn = n/2 * (2a + (n-1) b )");
		System.out.println("=========================================================");
		
		Sn = n/2 * (2*a+(n-1)*b);
		
		
		System.out.println ("Hasil Deret Aritmatika = " + Sn);
		System.out.println("=========================================================");
		return 0;
	}
}
class Geometri{
	Scanner in = new Scanner (System.in);
	int n, a, r;
	
	float BarisGeometri() {
		System.out.print (">>Masukkan n : ");
		n = in.nextInt();
		System.out.print (">>Masukkan suku pertama : ");
		a = in.nextInt();
		System.out.print (">>Masukkan rasio : ");
		r = in.nextInt();
		System.out.println("=========================================================");
		System.out.println ("rumus baris Geometri Un = (ar,(n-1))");
		System.out.println("=========================================================");
		
		double Un = Math.pow(a*r,(n-1));
		
		System.out.println ("Hasil Baris Geometri = " + Un);
		System.out.println("=========================================================");
		return 0;
	}
	
	float DeretGeometri() {
		System.out.print (">>Masukkan n : ");
		n = in.nextInt();
		System.out.print (">>Masukkan suku pertama : ");
		a = in.nextInt();
		System.out.print ("rasio : ");
		r = in.nextInt();
		System.out.println("=========================================================");
		System.out.println ("rumus deret Geometri");
		System.out.println("=========================================================");
		System.out.println ("Deret Turun Sn = a (1-(r,n)) / (1-r) . r < 1");
		System.out.println ("Deret Naik Sn = a ((r,n) - 1) / (r-1) . r > 1");
		System.out.println("=========================================================");
		
		double Sn_turun =  a*(1 - Math.pow(r,n))/(1-r);
		double Sn_naik =  a*(Math.pow(r,n) - 1)/(r-1);
		
		System.out.println ("Hasil Deret Geometri (Deret Turun) = " + Sn_turun);
		System.out.println("=========================================================");
		System.out.println ("Hasil Deret Geometri (Deret Naik) = " + Sn_naik);
		System.out.println("=========================================================");
		return 0;
	}
}
 //DADAN
 class Pythagoras{
	int a, b, sisi_miring;
	  float hasil;
	  Scanner in = new Scanner(System.in);
	  
	float sisimiring(){
		System.out.print(">>Masukkan sisi alas : ");
			a = in.nextInt();
			System.out.print(">>Masukkan sisi tegak : ");
			b = in.nextInt();
			hasil = (float) Math.sqrt(a*a+b*b);
			System.out.println("=========================================================");
			System.out.println("Hasil : "+hasil+" cm");
			System.out.println("=========================================================");
			return 0;
	}
	float sisitegak(){
		System.out.print(">>Masukkan sisi tegak : ");
			b = in.nextInt();
			System.out.print(">>Masukkan sisi sisi miring : ");
			sisi_miring = in.nextInt();
			hasil = (float) Math.sqrt(sisi_miring*sisi_miring-b*b);
			System.out.println("=========================================================");
			System.out.println("Hasil : "+hasil+" cm");
			System.out.println("=========================================================");
			return 0;
	}
	float sisialas(){
		System.out.println(">>Masukkan sisi alas : ");
			a = in.nextInt();
			System.out.println(">>Masukkan sisi miring : ");
			sisi_miring = in.nextInt();
			hasil = (float) Math.sqrt(sisi_miring*sisi_miring-a*a);
			System.out.println("=========================================================");
			System.out.println("Hasil : "+hasil+" cm");
			System.out.println("=========================================================");
			return 0;
	}

}
 //NAUFAL
 class Statistika{
	float mean(){
		int array[], i, n;
		array = new int[100];
		float rata, total=0;
		Scanner scan = new Scanner(System.in);
		System.out.print(">>Masukkan banyaknya elemen array: ");
		n = scan.nextInt();
		for(i = 1; i <= n; i++){
		  System.out.print("Nilai Ke-"+ i +" : ");
		  array[i] = scan.nextInt();
		  total = total + array[i];
		}
		rata = total/n;
		System.out.println("=========================================================");
		System.out.println("Hasil mean (rata-rata) : " + rata);
		System.out.println("Hasil jumlah setiap x : " + total);
		System.out.println("=========================================================");
		return 0;
	}
	float median(){
		double[] angka = new double[10];
        //memasukan angka
        for (int i = 0; i < 10; i=i+1) {
            System.out.print("angka ke " + (i+1) + " : ");
            angka[i] = new Scanner(System.in).nextDouble();
		}
        //mengurutkan
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (angka[j] > angka[j + 1]) {
                    double n = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = n;
				}
			}
		}
        double median = (angka[4]+angka[5])/2;
		System.out.println("=========================================================");
        System.out.println("Median : " + median);
		System.out.println("=========================================================");
		return 0;
	}
	float modus(){
		int i;
				Scanner input = new Scanner(System.in);
				System.out.print(">>Masukkan banyak jumlah data :\t");
				int N = input.nextInt();
			int HModus=0, FrekModus, KandidatModus, FrekKandidatModus;
			boolean MasihSama;
			int [] A=new int[N];
			for(i=0;i<N;i++){
				System.out.print(">>Masukkan elemen data ke:"+i+"\t");
				A[i]=input.nextInt();
			}
			//Pengurutan Data
			for(i=0;i<N-1;i++){
				for(int j=i+1;j<N;j++){
					if(A[j]<A[i]){
					   int temp=A[i];
					   A[i]=A[j];
					   A[j]=temp;
					}
				}
			}
			FrekModus = 0;
			i = 0;    
			while(i < N){
				KandidatModus = A[i];
				FrekKandidatModus = 1;
				i++;
				MasihSama = true;
				while(MasihSama&&i<N){
					if(A[i]==KandidatModus){
						FrekKandidatModus=FrekKandidatModus+1;
						MasihSama=true;
					}
					else{
						MasihSama=false;
					}
					i++;
				}
				if(FrekKandidatModus > FrekModus){
					HModus=KandidatModus;
					FrekModus=FrekKandidatModus;
				}
			}
			System.out.println("=========================================================");
			System.out.println("Modus :\t"+HModus);
			System.out.println("=========================================================");
			return 0;
		  }
				

	
}


public class Main{
	public static void cls(){
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception E){
			System.out.println(E);
		}
	}
	public static void apahayo(){
		try{
			new ProcessBuilder("cmd","/c","color C").inheritIO().start().waitFor();
		}
		catch(Exception E){
			System.out.println(E);
		}
	}
	public static void main(String[] args){
	apahayo();
	Scanner in = new Scanner(System.in);
	char okeh;
	for (int i=1;i<100;i++){
	System.out.println("rebuliding");
	}
	BangunRuang br = new BangunRuang();
	BangunDatar bd = new BangunDatar();
	do{
	cls();
	System.out.println("           HHHHHHHHHHHHHHHHH       "+"                                                "+"\n       HHHHHHHHHHHHHHHHHHHHHHHHH   "+"                                                "+"\n     HHHHHHHHHHHHHHHHH     HHHHHHH "+"                                                "+"\n   HHHHHHHHHHHHHHHHHHHH  ,HHHHH"+" __  __   ___                       .           "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH  "+"|  |/  `.'   `.                   .'|           "+"\n HHHHHHHHHHHHHHHHHHHHHHHHH     "+"|   .-.  .-.   '              .| <  |           "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |    __      .' |_ | |           "+"\n.HHHHHHHHHHHHHHHHHHHHH         "+"|  |  |  |  |  | .:--.'.  .'     || | .'''-.    "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   "+"\n HHHHHHHHHHHHHHHHHHHHHHHHHH    "+"|  |  |  |  |  |'. __ | |   |  |  |  /    | |   "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH*"+" |__|  |__|  |__| .'.''| |   |  |  | |     | |   "+"\n   .HHHHHHHHHHHHHHHHHHHHHHHHHHHH"+"               / /   | |_  |  '.'| |     | |   "+"\n     #HHHHHHHHHHHHHHHHHHHHHHHHHHH/"+"             | .._,| '/  |   / | '.    | '.  "+"\n        HHHHHHHHHHHHHHHHHHHHHHH  "+"               `----- '   `'-'  '---'   '---' "+"\n             HHHHHHHHHHHHH  	 "+"                                              ");	
	System.out.println("=========================================================");
	System.out.println("=======================MENU PILIHAN======================");
	System.out.println("=========================================================");
	System.out.println("|1| Bangun Datar & Bangun Ruang\t\t\t\t|");
	System.out.println("|2| Statistika\t\t\t\t\t\t|");
	System.out.println("|3| Phytagoras\t\t\t\t\t\t|");
	System.out.println("|4| Kecepatan dan Percepatan\t\t\t\t|");
	System.out.println("|5| Aritmatika dan Geometri\t\t\t\t|");
	System.out.println("=========================================================");
	System.out.println("=========================================================");
	System.out.print(">>Masukkan Pilihan : ");
	int pil_menu_1 = in.nextInt();
	
	if(pil_menu_1>5){
	System.out.println("=========================================================");
	System.out.println("=====================404 Fatal Error=====================");
	System.out.println("=========================================================");
		break;
	}
	cls();
	switch(pil_menu_1){
	case 1 :
	System.out.println("           HHHHHHHHHHHHHHHHH       "+"                                                "+"\n       HHHHHHHHHHHHHHHHHHHHHHHHH   "+"                                                "+"\n     HHHHHHHHHHHHHHHHH     HHHHHHH "+"                                                "+"\n   HHHHHHHHHHHHHHHHHHHH  ,HHHHH"+" __  __   ___                       .           "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH  "+"|  |/  `.'   `.                   .'|           "+"\n HHHHHHHHHHHHHHHHHHHHHHHHH     "+"|   .-.  .-.   '              .| <  |           "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |    __      .' |_ | |           "+"\n.HHHHHHHHHHHHHHHHHHHHH         "+"|  |  |  |  |  | .:--.'.  .'     || | .'''-.    "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   "+"\n HHHHHHHHHHHHHHHHHHHHHHHHHH    "+"|  |  |  |  |  |'. __ | |   |  |  |  /    | |   "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH*"+" |__|  |__|  |__| .'.''| |   |  |  | |     | |   "+"\n   .HHHHHHHHHHHHHHHHHHHHHHHHHHHH"+"               / /   | |_  |  '.'| |     | |   "+"\n     #HHHHHHHHHHHHHHHHHHHHHHHHHHH/"+"             | .._,| '/  |   / | '.    | '.  "+"\n        HHHHHHHHHHHHHHHHHHHHHHH  "+"               `----- '   `'-'  '---'   '---' "+"\n             HHHHHHHHHHHHH  	 "+"                                              ");
	System.out.println("=========================================================");
	System.out.println("=======================MENU PILIHAN======================");
	System.out.println("=========================================================");
	System.out.println("|1| Menghitung Bangun Ruang\t\t\t\t|");
	System.out.println("|2| Menghitung Bangun Datar\t\t\t\t|");
	System.out.println("=========================================================");
	System.out.println("=========================================================");
	System.out.print(">>Masukkan Pilihan : ");
	int pil_menu_2 = in.nextInt();
	if(pil_menu_2>2){
	System.out.println("=========================================================");
	System.out.println("=====================404 Fatal Error=====================");
	System.out.println("=========================================================");
		break;
	}
	cls();

	switch (pil_menu_2){
	case 1 :
	System.out.println("           HHHHHHHHHHHHHHHHH       "+"                                                "+"\n       HHHHHHHHHHHHHHHHHHHHHHHHH   "+"                                                "+"\n     HHHHHHHHHHHHHHHHH     HHHHHHH "+"                                                "+"\n   HHHHHHHHHHHHHHHHHHHH  ,HHHHH"+" __  __   ___                       .           "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH  "+"|  |/  `.'   `.                   .'|           "+"\n HHHHHHHHHHHHHHHHHHHHHHHHH     "+"|   .-.  .-.   '              .| <  |           "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |    __      .' |_ | |           "+"\n.HHHHHHHHHHHHHHHHHHHHH         "+"|  |  |  |  |  | .:--.'.  .'     || | .'''-.    "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   "+"\n HHHHHHHHHHHHHHHHHHHHHHHHHH    "+"|  |  |  |  |  |'. __ | |   |  |  |  /    | |   "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH*"+" |__|  |__|  |__| .'.''| |   |  |  | |     | |   "+"\n   .HHHHHHHHHHHHHHHHHHHHHHHHHHHH"+"               / /   | |_  |  '.'| |     | |   "+"\n     #HHHHHHHHHHHHHHHHHHHHHHHHHHH/"+"             | .._,| '/  |   / | '.    | '.  "+"\n        HHHHHHHHHHHHHHHHHHHHHHH  "+"               `----- '   `'-'  '---'   '---' "+"\n             HHHHHHHHHHHHH  	 "+"                                              ");
	System.out.println("=========================================================");
	System.out.println("=======================MENU PILIHAN======================");
	System.out.println("=========================================================");
	System.out.println("|1| Rumus Kubus\t\t\t\t\t\t|");
	System.out.println("|2| Rumus Balok \t\t\t\t\t|");
	System.out.println("|3| Rumus Prisma Segitiga\t\t\t\t|");
	System.out.println("|4| Rumus Limas Segiempat\t\t\t\t|");
	System.out.println("|5| Rumus Limas Segitiga\t\t\t\t|");
	System.out.println("|6| Tabung \t\t\t\t\t\t|");
	System.out.println("|7| Kerucut\t\t\t\t\t\t|");
	System.out.println("|8| Bola\t\t\t\t\t\t|");
	System.out.println("=========================================================");
	System.out.println("=========================================================");
	System.out.print(">>Masukkan Pilihan : ");
	int pil_menu_3 = in.nextInt();
	if(pil_menu_3>8){
	System.out.println("=========================================================");
	System.out.println("=====================404 Fatal Error=====================");
	System.out.println("=========================================================");
		break;
	}
	switch (pil_menu_3){
		case 1 :
		System.out.println("=========================================================");
		System.out.println("==========================KUBUS==========================");
		System.out.println("=========================================================");	
		Kubus kubus = new Kubus();
		System.out.print(">>Masukkan sisi kubus(cm) : ");
		int sisi_br_kubus = in.nextInt(); 
		kubus.sisi = sisi_br_kubus;
		System.out.println("=========================================================");
		kubus.volume();
		kubus.luaspermukaan();
		kubus.keliling();
		System.out.println("=========================================================");
		br.kubus();
		System.out.println("=========================================================");
		break;
		case 2 :
		System.out.println("=========================================================");
		System.out.println("==========================BALOK==========================");
		System.out.println("=========================================================");
		Balok balok = new Balok();
		System.out.print(">>Masukkan panjang(cm) : ");
		int panjang_br_balok = in.nextInt();
		System.out.print(">>Masukkan lebar(cm) : ");
		int lebar_br_balok = in.nextInt();
		System.out.print(">>Masukkan tinggi(cm) : ");
		int tinggi_br_balok = in.nextInt();
		balok.panjang = panjang_br_balok;
		balok.lebar = lebar_br_balok;
		balok.tinggi = tinggi_br_balok;
		System.out.println("=========================================================");
		balok.volume();
		balok.luaspermukaan();
		balok.keliling();
		System.out.println("=========================================================");
		br.balok();
		System.out.println("=========================================================");
		break;
		case 3 :
		System.out.println("=========================================================");
		System.out.println("===================PRISMA SEGITIGA=======================");
		System.out.println("=========================================================");
		PrismaSegitiga prismasegitiga = new PrismaSegitiga();
		System.out.print(">>Masukkan panjang(cm) : ");
		int panjang_br_segitiga = in.nextInt();
		System.out.print(">>Masukkan tinggi(cm) : ");
		int tinggi_br_segitiga = in.nextInt();
		System.out.println("=========================================================");
		prismasegitiga.panjang = panjang_br_segitiga;
		prismasegitiga.tinggi = tinggi_br_segitiga;
		prismasegitiga.volume();
		prismasegitiga.luaspermukaan();
		System.out.println("=========================================================");
		br.prisma_segitiga();
		System.out.println("=========================================================");
		break;
		case 4 :
		System.out.println("=========================================================");
		System.out.println("===================LIMAS SEGI EMPAT======================");
		System.out.println("=========================================================");
		LimasSegiempat limassegiempat = new LimasSegiempat();
		System.out.print(">>Masukkan panjang(cm) : ");
		int p_br_limassegiempat = in.nextInt();
		System.out.print(">>Masukkan lebar(cm) : ");
		int l_br_limassegiempat = in.nextInt();
		System.out.print(">>Masukkan tinggi(cm) : ");
		int t_br_limassegiempat = in.nextInt();
		limassegiempat.p = p_br_limassegiempat;
		limassegiempat.l = l_br_limassegiempat;
		limassegiempat.t = t_br_limassegiempat;
		System.out.println("=========================================================");
		limassegiempat.volume();
		System.out.println("=========================================================");
		br.limas_segiempat();
		System.out.println("=========================================================");
		break;
		case 5 :
		System.out.println("=========================================================");
		System.out.println("====================LIMAS SEGITIGA=======================");
		System.out.println("=========================================================");
		LimasSegitiga limassegitiga = new LimasSegitiga();
		System.out.print(">>Masukkan alas(cm) : ");
		int alas_br_limassegitiga = in.nextInt();
		System.out.print(">>Masukkan tinggi(cm) : ");
		int tinggi_br_limassegitiga = in.nextInt();
		limassegitiga.alas = alas_br_limassegitiga;
		limassegitiga.tinggi = tinggi_br_limassegitiga;
		System.out.println("=========================================================");
		limassegitiga.volume();
		System.out.println("=========================================================");
		br.limas_segitiga();
		System.out.println("=========================================================");
		break;
		case 6 :
		System.out.println("=========================================================");
		System.out.println("========================TABUNG===========================");
		System.out.println("=========================================================");
		Tabung tabung = new Tabung();
		System.out.print(">>Masukkan jari-jari(cm) : ");
		int r_br_tabung = in.nextInt();
		System.out.print(">>Masukkan tinggi(cm) : ");
		int t_br_tabung = in.nextInt();
		tabung.r = r_br_tabung;
		tabung.t = t_br_tabung;
		System.out.println("=========================================================");
		tabung.volume();
		tabung.luaspermukaan();
		System.out.println("=========================================================");
		br.tabung();
		System.out.println("=========================================================");
		break;
		case 7 :
		System.out.println("=========================================================");
		System.out.println("========================KERUCUT==========================");
		System.out.println("=========================================================");
		Kerucut kerucut = new Kerucut();
		System.out.print(">>Masukkan jari-jari(cm) : ");
		int r_br_kerucut = in.nextInt();
		System.out.print(">>Masukkan tinggi(cm) : ");
		int t_br_kerucut = in.nextInt();
		System.out.print(">>Masukkan sisi miring(cm) : ");
		int s = in.nextInt();
		kerucut.r = r_br_kerucut;
		kerucut.t = t_br_kerucut;
		kerucut.s = s;
		System.out.println("=========================================================");
		kerucut.volume();
		kerucut.luaspermukaan();
		System.out.println("=========================================================");
		br.kerucut();
		System.out.println("=========================================================");
		break;
		case 8 :
		System.out.println("=========================================================");
		System.out.println("=========================BOLA============================");
		System.out.println("=========================================================");
		Bola bola = new Bola();
		System.out.print(">>Masukkan jari-jari(cm) : ");
		int r_br_bola = in.nextInt();
		bola.r = r_br_bola;
		System.out.println("=========================================================");
		bola.volume();
		bola.luaspermukaan();
		System.out.println("=========================================================");
		br.bola();
		System.out.println("=========================================================");
		break;
	}break;
	case 2 :
	System.out.println("           HHHHHHHHHHHHHHHHH       "+"                                                "+"\n       HHHHHHHHHHHHHHHHHHHHHHHHH   "+"                                                "+"\n     HHHHHHHHHHHHHHHHH     HHHHHHH "+"                                                "+"\n   HHHHHHHHHHHHHHHHHHHH  ,HHHHH"+" __  __   ___                       .           "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH  "+"|  |/  `.'   `.                   .'|           "+"\n HHHHHHHHHHHHHHHHHHHHHHHHH     "+"|   .-.  .-.   '              .| <  |           "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |    __      .' |_ | |           "+"\n.HHHHHHHHHHHHHHHHHHHHH         "+"|  |  |  |  |  | .:--.'.  .'     || | .'''-.    "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   "+"\n HHHHHHHHHHHHHHHHHHHHHHHHHH    "+"|  |  |  |  |  |'. __ | |   |  |  |  /    | |   "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH*"+" |__|  |__|  |__| .'.''| |   |  |  | |     | |   "+"\n   .HHHHHHHHHHHHHHHHHHHHHHHHHHHH"+"               / /   | |_  |  '.'| |     | |   "+"\n     #HHHHHHHHHHHHHHHHHHHHHHHHHHH/"+"             | .._,| '/  |   / | '.    | '.  "+"\n        HHHHHHHHHHHHHHHHHHHHHHH  "+"               `----- '   `'-'  '---'   '---' "+"\n             HHHHHHHHHHHHH  	 "+"                                              ");
  		System.out.println("=========================================================");
  		System.out.println("=======================MENU PILIHAN======================");
  		System.out.println("=========================================================");
  		System.out.println("|1| Rumus Persegi\t\t\t\t\t|");
  		System.out.println("|2| Rumus Lingkaran\t\t\t\t\t|");
  		System.out.println("|3| Rumus Persegi Panjang\t\t\t\t|");
  		System.out.println("|4| Rumus Segitiga\t\t\t\t\t|");
  		System.out.println("=========================================================");
  		System.out.println("=========================================================");
  		System.out.print(">>Masukkan Pilihan : ");
		int pil_menu_4 = in.nextInt();
		if(pil_menu_4>4){
	System.out.println("=========================================================");
	System.out.println("=====================404 Fatal Error=====================");
	System.out.println("=========================================================");
		break;
	}
		switch (pil_menu_4){
		case 1 : 
		System.out.println("=========================================================");
		System.out.println("========================PERSEGI==========================");
		System.out.println("=========================================================");
		Persegi persegi = new Persegi();
		System.out.print(">>Masukkan sisi(cm) : ");
		int sisi_bd = in.nextInt();
		persegi.sisi = sisi_bd;
		System.out.println("=========================================================");
		persegi.luas();
		persegi.keliling();
		System.out.println("=========================================================");
		bd.persegi();
		System.out.println("=========================================================");
		break;
		case 2 :
		System.out.println("=========================================================");
		System.out.println("========================LINGKARAN========================");
		System.out.println("=========================================================");
		Lingkaran lingkaran = new Lingkaran();
		System.out.print(">>Masukkan jari-jari(cm) : ");
		int r_bd = in.nextInt();
		lingkaran.r = r_bd;
		System.out.println("=========================================================");
		lingkaran.luas();
		lingkaran.keliling();
		System.out.println("=========================================================");
		bd.lingkaran();
		System.out.println("=========================================================");
		break;
		case 3 :
		System.out.println("=========================================================");
		System.out.println("=====================PERSEGI PANJANG=====================");
		System.out.println("=========================================================");
		PersegiPanjang persegipanjang = new PersegiPanjang();
		System.out.print(">>Masukkan alas(cm) : ");
		int alas_bd = in.nextInt();
		System.out.print(">>Masukkan lebar(cm)  : ");
		int lebar_bd = in.nextInt();
		persegipanjang.alas = alas_bd;
		persegipanjang.lebar = lebar_bd;
		System.out.println("=========================================================");
		persegipanjang.luas();
		persegipanjang.keliling();
		System.out.println("=========================================================");
		bd.persegi_panjang();
		System.out.println("=========================================================");
		break;
		case 4 :
		System.out.println("=========================================================");
		System.out.println("=======================SEGITIGA==========================");
		System.out.println("=========================================================");
		Segitiga segitiga = new Segitiga();
		System.out.print(">>Masukkan alas(cm) : ");
		int alas_bd_segitiga = in.nextInt();
		System.out.print(">>Masukkan tinggi(cm) : ");
		int tinggi_bd_segitiga = in.nextInt();
		segitiga.alas = alas_bd_segitiga;
		segitiga.tinggi = tinggi_bd_segitiga;
		System.out.println("=========================================================");
		segitiga.luas();
		System.out.println("=========================================================");
		bd.segitiga();
		System.out.println("=========================================================");
		break;

	}break;
	}break;
	case 2 :
	Statistika statis = new Statistika();
	System.out.println("           HHHHHHHHHHHHHHHHH       "+"                                                "+"\n       HHHHHHHHHHHHHHHHHHHHHHHHH   "+"                                                "+"\n     HHHHHHHHHHHHHHHHH     HHHHHHH "+"                                                "+"\n   HHHHHHHHHHHHHHHHHHHH  ,HHHHH"+" __  __   ___                       .           "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH  "+"|  |/  `.'   `.                   .'|           "+"\n HHHHHHHHHHHHHHHHHHHHHHHHH     "+"|   .-.  .-.   '              .| <  |           "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |    __      .' |_ | |           "+"\n.HHHHHHHHHHHHHHHHHHHHH         "+"|  |  |  |  |  | .:--.'.  .'     || | .'''-.    "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   "+"\n HHHHHHHHHHHHHHHHHHHHHHHHHH    "+"|  |  |  |  |  |'. __ | |   |  |  |  /    | |   "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH*"+" |__|  |__|  |__| .'.''| |   |  |  | |     | |   "+"\n   .HHHHHHHHHHHHHHHHHHHHHHHHHHHH"+"               / /   | |_  |  '.'| |     | |   "+"\n     #HHHHHHHHHHHHHHHHHHHHHHHHHHH/"+"             | .._,| '/  |   / | '.    | '.  "+"\n        HHHHHHHHHHHHHHHHHHHHHHH  "+"               `----- '   `'-'  '---'   '---' "+"\n             HHHHHHHHHHHHH  	 "+"                                              ");
	System.out.println("=========================================================");
	System.out.println("=======================MENU PILIHAN======================");
	System.out.println("=========================================================");
	System.out.println("|1| Mencari Mean\t\t\t\t\t|");
	System.out.println("|2| Mencari Median\t\t\t\t\t|");
	System.out.println("|3| Mencari Modus\t\t\t\t\t|");
	System.out.println("=========================================================");
	System.out.println("=========================================================");
	System.out.print(">>Masukkan Pilihan : ");
	int pil_menu_statis = in.nextInt();
	if(pil_menu_statis>3){
	System.out.println("=========================================================");
	System.out.println("=====================404 Fatal Error=====================");
	System.out.println("=========================================================");
		break;
	}
	switch (pil_menu_statis){
		case 1 : 
		statis.mean();
		break;
		case 2 :
		statis.median();
		break;
		case 3 :
		statis.modus();
		break;
	}break;
	case 3 :
	Pythagoras pyt = new Pythagoras();
	System.out.println("           HHHHHHHHHHHHHHHHH       "+"                                                "+"\n       HHHHHHHHHHHHHHHHHHHHHHHHH   "+"                                                "+"\n     HHHHHHHHHHHHHHHHH     HHHHHHH "+"                                                "+"\n   HHHHHHHHHHHHHHHHHHHH  ,HHHHH"+" __  __   ___                       .           "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH  "+"|  |/  `.'   `.                   .'|           "+"\n HHHHHHHHHHHHHHHHHHHHHHHHH     "+"|   .-.  .-.   '              .| <  |           "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |    __      .' |_ | |           "+"\n.HHHHHHHHHHHHHHHHHHHHH         "+"|  |  |  |  |  | .:--.'.  .'     || | .'''-.    "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   "+"\n HHHHHHHHHHHHHHHHHHHHHHHHHH    "+"|  |  |  |  |  |'. __ | |   |  |  |  /    | |   "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH*"+" |__|  |__|  |__| .'.''| |   |  |  | |     | |   "+"\n   .HHHHHHHHHHHHHHHHHHHHHHHHHHHH"+"               / /   | |_  |  '.'| |     | |   "+"\n     #HHHHHHHHHHHHHHHHHHHHHHHHHHH/"+"             | .._,| '/  |   / | '.    | '.  "+"\n        HHHHHHHHHHHHHHHHHHHHHHH  "+"               `----- '   `'-'  '---'   '---' "+"\n             HHHHHHHHHHHHH  	 "+"                                              ");
	System.out.println("=========================================================");
	System.out.println("=======================MENU PILIHAN======================");
	System.out.println("=========================================================");
	System.out.println("|1| Mencari Sisi Miring\t\t\t\t\t|");
	System.out.println("|2| Mencari Sisi Tegak\t\t\t\t\t|");
	System.out.println("|3| Mencari Sisi Alas\t\t\t\t\t|");
	System.out.println("=========================================================");
	System.out.println("=========================================================");
	System.out.print(">>Masukkan Pilihan : ");
	int pil_menu_py = in.nextInt();
	if(pil_menu_py>3){
	System.out.println("=========================================================");
	System.out.println("=====================404 Fatal Error=====================");
	System.out.println("=========================================================");
		break;
	}
	switch(pil_menu_py){
		case 1 : 
		pyt.sisimiring();
		break;
		case 2 :
		pyt.sisitegak();
		break;
		case 3 :
		pyt.sisialas();
		break;
	}break;
	case 4 :
	Perkec pr = new Perkec();
	System.out.println("           HHHHHHHHHHHHHHHHH       "+"                                                "+"\n       HHHHHHHHHHHHHHHHHHHHHHHHH   "+"                                                "+"\n     HHHHHHHHHHHHHHHHH     HHHHHHH "+"                                                "+"\n   HHHHHHHHHHHHHHHHHHHH  ,HHHHH"+" __  __   ___                       .           "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH  "+"|  |/  `.'   `.                   .'|           "+"\n HHHHHHHHHHHHHHHHHHHHHHHHH     "+"|   .-.  .-.   '              .| <  |           "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |    __      .' |_ | |           "+"\n.HHHHHHHHHHHHHHHHHHHHH         "+"|  |  |  |  |  | .:--.'.  .'     || | .'''-.    "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   "+"\n HHHHHHHHHHHHHHHHHHHHHHHHHH    "+"|  |  |  |  |  |'. __ | |   |  |  |  /    | |   "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH*"+" |__|  |__|  |__| .'.''| |   |  |  | |     | |   "+"\n   .HHHHHHHHHHHHHHHHHHHHHHHHHHHH"+"               / /   | |_  |  '.'| |     | |   "+"\n     #HHHHHHHHHHHHHHHHHHHHHHHHHHH/"+"             | .._,| '/  |   / | '.    | '.  "+"\n        HHHHHHHHHHHHHHHHHHHHHHH  "+"               `----- '   `'-'  '---'   '---' "+"\n             HHHHHHHHHHHHH  	 "+"                                              ");
	System.out.println("=========================================================");
	System.out.println("=======================MENU PILIHAN======================");
	System.out.println("=========================================================");
	System.out.println("|1| Mencari Kecepatan\t\t\t\t\t|");
	System.out.println("|2| Mencari Percepatan\t\t\t\t\t|");
	System.out.println("=========================================================");
	System.out.println("=========================================================");
	System.out.print(">>Masukkan Pilihan : ");
	int pil_menu_pr = in.nextInt();
	if(pil_menu_pr>2){
	System.out.println("=========================================================");
	System.out.println("=====================404 Fatal Error=====================");
	System.out.println("=========================================================");
		break;
	}
	switch(pil_menu_pr){
		case 1 :
		pr.kecepatan();
		break;
		case 2 :
		pr.percepatan();
		break;
	}break;
	case 5 :
	Aritmatika aritm = new Aritmatika();
	Geometri geom = new Geometri();
	System.out.println("           HHHHHHHHHHHHHHHHH       "+"                                                "+"\n       HHHHHHHHHHHHHHHHHHHHHHHHH   "+"                                                "+"\n     HHHHHHHHHHHHHHHHH     HHHHHHH "+"                                                "+"\n   HHHHHHHHHHHHHHHHHHHH  ,HHHHH"+" __  __   ___                       .           "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH  "+"|  |/  `.'   `.                   .'|           "+"\n HHHHHHHHHHHHHHHHHHHHHHHHH     "+"|   .-.  .-.   '              .| <  |           "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |    __      .' |_ | |           "+"\n.HHHHHHHHHHHHHHHHHHHHH         "+"|  |  |  |  |  | .:--.'.  .'     || | .'''-.    "+"\n HHHHHHHHHHHHHHHHHHHHHHH       "+"|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   "+"\n HHHHHHHHHHHHHHHHHHHHHHHHHH    "+"|  |  |  |  |  |'. __ | |   |  |  |  /    | |   "+"\n  HHHHHHHHHHHHHHHHHHHHHHHHHHH*"+" |__|  |__|  |__| .'.''| |   |  |  | |     | |   "+"\n   .HHHHHHHHHHHHHHHHHHHHHHHHHHHH"+"               / /   | |_  |  '.'| |     | |   "+"\n     #HHHHHHHHHHHHHHHHHHHHHHHHHHH/"+"             | .._,| '/  |   / | '.    | '.  "+"\n        HHHHHHHHHHHHHHHHHHHHHHH  "+"               `----- '   `'-'  '---'   '---' "+"\n             HHHHHHHHHHHHH  	 "+"                                              ");
	System.out.println("=========================================================");
	System.out.println("=======================MENU PILIHAN======================");
	System.out.println("=========================================================");
	System.out.println("|1| Baris Aritmatika\t\t\t\t\t|");
	System.out.println("|2| Deret Aritmatika\t\t\t\t\t|");
	System.out.println("|3| Baris Geometri\t\t\t\t\t|");
	System.out.println("|4| Deret Geometri\t\t\t\t\t|");
	System.out.println("=========================================================");
	System.out.println("=========================================================");
	System.out.print(">>Masukkan Pilihan : ");
	int pil_menu_arit = in.nextInt();
	if(pil_menu_arit>4){
	System.out.println("=========================================================");
	System.out.println("=====================404 Fatal Error=====================");
	System.out.println("=========================================================");
		break;
	}
	switch(pil_menu_arit){
		case 1 :
		aritm.BarisAritmatika();
		break;
		case 2 :
		aritm.DeretAritmatika();
		break;
		case 3 :
		geom.BarisGeometri();
		break;
		case 4 :
		geom.DeretGeometri();
		break;	
	}break;
}
	
	System.out.print(">>Apakah anda ingin keluar ? y/n : ");
	okeh = in.next().charAt(0);
	cls();
	}while (okeh=='n'||okeh=='N');
	}
	
	
	

}	
