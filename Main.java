import java.util.*;
import java.util.Scanner;
import java.io.IOException;
 
 class Statistika{
	float mean(){
		int array[], i, n;
		array = new int[100];
		float rata, total=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan banyaknya elemen array: ");
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
				System.out.print("Masukkan banyak jumlah data :\t");
				int N = input.nextInt();
			int HModus=0, FrekModus, KandidatModus, FrekKandidatModus;
			boolean MasihSama;
			int [] A=new int[N];
			for(i=0;i<N;i++){
				System.out.print("Masukkan elemen data ke:"+i+"\t");
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
 
 class BangunRuang{
	float volume(){

		return 0;
	}
	float kubus(){
		System.out.println("\t\t\tRumus\nVolume \t\t\t\t: s^3\nLuas Permukaan \t\t\t: 6*s^2\nKeliling \t\t\t: 12*s\n=========================================================\ns = sisi");
		return 0;
	}
	float balok(){
		System.out.println("\t\t\tRumus\nVolume \t\t\t\t: p*l*t\nLuas Permukaan \t\t\t: 2*(p*l + p*t +l*t)\nKeliling \t\t\t: 4*(p+l+t)\n=========================================================\np = panjang, l = lebar, t = tinggi");
		return 0;
	}
	float prisma_segitiga(){
		System.out.println("\t\t\tRumus\nVolume \t\t\t\t: (1/2 x Alas Segitiga x Tinggi Segitiga) x Tinggi Prisma\nLuas Permukaan \t\t\t: {2 x (1/2 x a.s x t.s)} + 3 x t x t.s\n=========================================================\na.s = alas segitiga, t.s = tinggi segitiga, t = tinggi prisma");
		return 0;
	}
	float limas_segiempat(){
		System.out.println("\t\t\tRumus\nVolume \t\t\t\t: 1/3*luas_alas*t\nLuas Permukaan \t\t\t: luas_alas+luas_selimut\n=========================================================\nt = tinggi");
		return 0;
	}
	float limas_segitiga(){
		return 0;
	}
	float tabung(){
		return 0;
	}
	float kerucut(){
		return 0;
	}
	float bola(){
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
		return 0;
	}
	float lingkaran(){
		return 0;
	}
	float persegi_panjang(){
		return 0;
	}
	float segitiga(){
		System.out.println("\t\t\tRumus\nVolume \t\t\t\t: p*l*t\nLuas Permukaan \t\t\t: 2*(p*l + p*t +l*t)\nKeliling \t\t\t: 4*(p+l+t)\n=========================================================\ns = sisi");
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
		System.out.println("=====================PERSEGI PANJANG=====================");
		System.out.println("=========================================================");
		Segitiga segitiga = new Segitiga();
		System.out.print(">>Masukkan alas(cm) : ");
		int alas_bd_lingkaran = in.nextInt();
		System.out.print(">>Masukkan tinggi(cm) : ");
		int tinggi_bd_lingkaran = in.nextInt();
		segitiga.alas = alas_bd_lingkaran;
		segitiga.tinggi = tinggi_bd_lingkaran;
		System.out.println("=========================================================");
		segitiga.luas();
		System.out.println("=========================================================");
		System.out.println("=========================================================");
		break;

	}break;
	}
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
	}
}
	
	System.out.print(">>Apakah anda ingin keluar ? y/n : ");
	okeh = in.next().charAt(0);
	cls();
	}while (okeh=='n'||okeh=='N');
	}
	
	
	

}
