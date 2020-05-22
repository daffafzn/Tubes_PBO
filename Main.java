import java.util.*;
import java.util.Scanner;
import java.io.IOException;
 
 class BangunRuang{
	float volume(){

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

public class menu{
	public static void main(String[] args){
		
	Scanner in = new Scanner(System.in);
	char okeh;
	do{
	System.out.println(" __  __   ___                       .           ");
	System.out.println("|  |/  `.'   `.                   .'|           ");
	System.out.println("|   .-.  .-.   '              .| <  |           ");
	System.out.println("|  |  |  |  |  |    __      .' |_ | |           ");
	System.out.println("|  |  |  |  |  | .:--.'.  .'     || | .'''-.    ");
	System.out.println("|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   ");
	System.out.println("|  |  |  |  |  |'. __ | |   |  |  |  /    | |   ");
	System.out.println("|__|  |__|  |__| .'.''| |   |  |  | |     | |   ");
	System.out.println("                / /   | |_  |  '.'| |     | |   ");
	System.out.println("                | .._,| '/  |   / | '.    | '.  ");
	System.out.println("                 `----- '   `'-'  '---'   '---' ");
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
	cls();
	switch(pil_menu_1){
	case 1 :
	System.out.println(" __  __   ___                       .           ");
	System.out.println("|  |/  `.'   `.                   .'|           ");
	System.out.println("|   .-.  .-.   '              .| <  |           ");
	System.out.println("|  |  |  |  |  |    __      .' |_ | |           ");
	System.out.println("|  |  |  |  |  | .:--.'.  .'     || | .'''-.    ");
	System.out.println("|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   ");
	System.out.println("|  |  |  |  |  |'. __ | |   |  |  |  /    | |   ");
	System.out.println("|__|  |__|  |__| .'.''| |   |  |  | |     | |   ");
	System.out.println("                / /   | |_  |  '.'| |     | |   ");
	System.out.println("                | .._,| '/  |   / | '.    | '.  ");
	System.out.println("                 `----- '   `'-'  '---'   '---' ");
	System.out.println("=========================================================");
	System.out.println("=======================MENU PILIHAN======================");
	System.out.println("=========================================================");
	System.out.println("|1| Menghitung Bangun Ruang\t\t\t\t|");
	System.out.println("|2| Menghitung Bangun Datar\t\t\t\t|");
	System.out.println("=========================================================");
	System.out.println("=========================================================");
	System.out.print(">>Masukkan Pilihan : ");
	int pil_menu_2 = in.nextInt();
	cls();
	

	switch (pil_menu_2){
	case 1 :
	System.out.println(" __  __   ___                       .           ");
	System.out.println("|  |/  `.'   `.                   .'|           ");
	System.out.println("|   .-.  .-.   '              .| <  |           ");
	System.out.println("|  |  |  |  |  |    __      .' |_ | |           ");
	System.out.println("|  |  |  |  |  | .:--.'.  .'     || | .'''-.    ");
	System.out.println("|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   ");
	System.out.println("|  |  |  |  |  |'. __ | |   |  |  |  /    | |   ");
	System.out.println("|__|  |__|  |__| .'.''| |   |  |  | |     | |   ");
	System.out.println("                / /   | |_  |  '.'| |     | |   ");
	System.out.println("                | .._,| '/  |   / | '.    | '.  ");
	System.out.println("                 `----- '   `'-'  '---'   '---' ");
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
		BangunDatar bd = new BangunDatar();
		System.out.println(" __  __   ___                       .           ");
  		System.out.println("|  |/  `.'   `.                   .'|           ");
  		System.out.println("|   .-.  .-.   '              .| <  |           ");
  		System.out.println("|  |  |  |  |  |    __      .' |_ | |           ");
  		System.out.println("|  |  |  |  |  | .:--.'.  .'     || | .'''-.    ");
  		System.out.println("|  |  |  |  |  |/ |   | |'--.  .-'| |/.'''. |   ");
  		System.out.println("|  |  |  |  |  |'. __ | |   |  |  |  /    | |   ");
  		System.out.println("|__|  |__|  |__| .'.''| |   |  |  | |     | |   ");
  		System.out.println("                / /   | |_  |  '.'| |     | |   ");
  		System.out.println("                | .._,| '/  |   / | '.    | '.  ");
  		System.out.println("                 `----- '   `'-'  '---'   '---' ");
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
	}
	System.out.print(">>Apakah anda ingin keluar ? y/n : ");
	okeh = in.next().charAt(0);
	cls();
	}while (okeh=='n'||okeh=='N');
	}
	public static void cls(){
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception E){
			System.out.println(E);
		}
	}
	

}
