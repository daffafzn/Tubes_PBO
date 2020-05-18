import java.util.Scanner;
import java.util.*;

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
		System.out.println ("Menghitung luas bangun datar");
		return 0;
	}
	float keliling(){
		System.out.println ("Menghitung keliling bangun datar");
		return 0;
	}
}

class Persegi extends BangunDatar{
	float sisi;

	@Override
	float luas(){
		 float luas = sisi * sisi;
		 System.out.println ("Luas Persegi : "+luas);
		 return luas;
	}

	@Override
	float keliling(){
		float keliling = sisi*4;
		System.out.println ("keliling Persegi : "+keliling);
		return keliling;
	}
}

class Lingkaran extends BangunDatar{
	float r;

	@Override
	float luas(){
		float luas = (float) Math.PI * r * r;
		System.out.println ("Luas Lingkaran : "+luas);
		return luas;

	}

	@Override
	float keliling(){
		float keliling = (float) Math.PI * 2 * r;
		System.out.println ("keliling Lingkaran : "+keliling);
		return keliling;
	}
}

class PersegiPanjang extends BangunDatar{
	float alas, lebar;

	@Override
	float luas(){
		float luas = alas * lebar;
		System.out.println ("Luas Persegi Panjang : "+luas);
		return luas;
	}

	@Override
	float keliling(){
		float keliling = 2*alas + 2*lebar;
		System.out.println("keliling Persegi Panjang : "+keliling);
		return keliling;
	}
}

class Segitiga extends BangunDatar{
	float alas, tinggi;

	@Override
	float luas(){
		float luas = (float) 0.5*alas*tinggi;
		System.out.println ("Luas segitiga : "+luas);
		return luas;
	}
	

}

class Kubus extends BangunRuang{
	float sisi;
	
	@Override
	float volume(){
		float volume = sisi*sisi*sisi;
		System.out.println("Volume Kubus : "+volume);
		return volume;
	}

	@Override
	float luaspermukaan(){
		float luaspermukaan = (float) 6*(sisi*sisi);
		System.out.println("Luas Permukaan Kubus : "+luaspermukaan);
		return luaspermukaan; 
	}

	@Override
	float keliling(){
		float keliling = 12*sisi;
		System.out.println("keliling Kubus : "+keliling);
		return keliling;
	}

}

class Balok extends BangunRuang{
	float panjang, lebar, tinggi;

	@Override
	float volume(){
		float volume = panjang*lebar*tinggi;
		System.out.println("Volume Balok : "+volume);
		return volume;
	}

	@Override
	float luaspermukaan(){
		float luaspermukaan = (float) 2*(panjang*lebar + lebar*tinggi + panjang*tinggi);
		System.out.println("Luas Permukaan Balok : "+luaspermukaan);
		return luaspermukaan;
	}

	@Override
	float keliling(){
		float keliling = (float) 4*(panjang+lebar+tinggi);
		System.out.println("keliling Balok : "+keliling);
		return keliling;
	}
}

class PrismaSegitiga extends BangunRuang{
	float panjang, luasalas, tinggi, kelilingalas;

	
	
	

	@Override
	float volume(){
		luasalas = panjang*tinggi;
		float volume = luasalas*tinggi;
		System.out.println("Volume Prisma Segitiga : "+volume);
		return volume;

	}

	@Override
	float luaspermukaan(){
		kelilingalas = 2*(panjang*tinggi);
		float luaspermukaan = (float) (kelilingalas*tinggi+2*luasalas);
		System.out.println("Luas Permukaan : "+luaspermukaan);
		return luaspermukaan;
	}


}


class LimasSegiempat extends BangunRuang{
	float p, l, t;

	@Override
	float volume(){
		float volume = (float) 0.333*p*l*t;
		System.out.println("Volume Limas Segiempat : "+volume);
		return volume;
	}
}


class LimasSegitiga extends BangunRuang{
	float alas, tinggi, luasalas;

	@Override
	float volume(){
		luasalas = (float) 1/2*alas*tinggi;
		float volume = (float) 0.333*luasalas*tinggi;
		System.out.println("Volume Limas Segitiga : "+volume);
		return volume;


	}

}

class Tabung extends BangunRuang{
	float r, t;


	@Override
	float volume(){
		float volume = (float) Math.PI*r*r*t;
		System.out.println("Volume Tabung : "+volume);
		return volume;
	}

	@Override

	float luaspermukaan(){
		float luasalas = (float) Math.PI*r*r;
		float kelilingalas = (float) Math.PI*r*2;
		float luaspermukaan = (float) (luasalas*2+kelilingalas*t);
		System.out.println("Luas Permukaan Tabung : "+luaspermukaan);
		return luaspermukaan;

	}
}

class Kerucut extends BangunRuang{
	float r, t, s;

	@Override
	float volume(){
		float volume = (float) Math.PI*r*r*t*0.333F;
		System.out.println("Volume Kerucut : "+volume);
		return volume;

	}


	@Override
	float luaspermukaan(){
		float luaspermukaan = (float) (Math.PI*r*s+Math.PI*r*r);
		System.out.println("Luas Permukaan : "+luaspermukaan);
		return luaspermukaan;
	}
}

class Bola extends BangunRuang{
	float r;

	@Override
	float volume(){
		float volume = (float) Math.PI*r*r*r*1.333F;
		System.out.println("Volume Bola : "+volume);
		return volume;
	}

	@Override
	float luaspermukaan(){
		float luaspermukaan = (float) Math.PI*r*r*4F;
		System.out.println("luaspermukaan Bola : "+luaspermukaan);
		return luaspermukaan;
	}
}

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println ("1. RUMUS BANGUN RUANG\n2. RUMUS BANGUN DATAR");
		System.out.println ("Masukkan Pilihan : ");
		int pil = in.nextInt();
		switch (pil){
		case 1 :
		BangunRuang br = new BangunRuang();
		System.out.println("1. KUBUS\n2. BALOK\n3. PRISMA SEGITIGA\n4. LIMAS SEGI EMPAT\n5. LIMAS SEGITIGA\n6. TABUNG\n7. KERUCUT\n8. BOLA");
		System.out.println("Masukkan Pilihan : ");
		int pilih = in.nextInt();
		switch (pilih){
		case 1 :
		System.out.println("--KUBUS--");	
		Kubus kubus = new Kubus();
		System.out.println("Masukkan sisi kubus : ");
		int sisi_br_kubus = in.nextInt(); 
		kubus.sisi = sisi_br_kubus;
		kubus.volume();
		kubus.luaspermukaan();
		kubus.keliling();
		break;
		case 2 :
		System.out.println("--BALOK--");
		Balok balok = new Balok();
		System.out.println("Masukkan panjang : ");
		int panjang_br_balok = in.nextInt();
		System.out.println("Masukkan lebar : ");
		int lebar_br_balok = in.nextInt();
		System.out.println("Masukkan tinggi : ");
		int tinggi_br_balok = in.nextInt();
		balok.panjang = panjang_br_balok;
		balok.lebar = lebar_br_balok;
		balok.tinggi = tinggi_br_balok;
		balok.volume();
		balok.luaspermukaan();
		balok.keliling();
		break;
		case 3 :
		System.out.println("--PRISMA SEGITIGA--");
		PrismaSegitiga prismasegitiga = new PrismaSegitiga();
		System.out.println("Masukkan panjang : ");
		int panjang_br_segitiga = in.nextInt();
		System.out.println("Masukkan tinggi : ");
		int tinggi_br_segitiga = in.nextInt();
		prismasegitiga.panjang = panjang_br_segitiga;
		prismasegitiga.tinggi = tinggi_br_segitiga;
		prismasegitiga.volume();
		prismasegitiga.luaspermukaan();
		break;
		case 4 :
		System.out.println("--LIMAS SEGI EMPAT--");
		LimasSegiempat limassegiempat = new LimasSegiempat();
		System.out.println("Masukkan panjang : ");
		int p_br_limassegiempat = in.nextInt();
		System.out.println("Masukkan lebar : ");
		int l_br_limassegiempat = in.nextInt();
		System.out.println("Masukkan tinggi : ");
		int t_br_limassegiempat = in.nextInt();
		limassegiempat.p = p_br_limassegiempat;
		limassegiempat.l = l_br_limassegiempat;
		limassegiempat.t = t_br_limassegiempat;
		break;
		case 5 :
		System.out.println("--LIMAS SEGITIGA--");
		LimasSegitiga limassegitiga = new LimasSegitiga();
		System.out.println("Masukkan alas : ");
		int alas_br_limassegitiga = in.nextInt();
		System.out.println("Masukkan tinggi : ");
		int tinggi_br_limassegitiga = in.nextInt();
		limassegitiga.alas = alas_br_limassegitiga;
		limassegitiga.tinggi = tinggi_br_limassegitiga;
		limassegitiga.volume();
		break;

		case 6 :
		System.out.println("--TABUNG--");
		Tabung tabung = new Tabung();
		System.out.println("Masukkan jari-jari : ");
		int r_br_tabung = in.nextInt();
		System.out.println("Masukkan tinggi : ");
		int t_br_tabung = in.nextInt();
		tabung.r = r_br_tabung;
		tabung.t = t_br_tabung;
		tabung.volume();
		tabung.luaspermukaan();
		break;
		case 7 :
		System.out.println("--KERUCUT--");
		Kerucut kerucut = new Kerucut();
		System.out.println("Masukkan jari-jari : ");
		int r_br_kerucut = in.nextInt();
		System.out.println("Masukkan tinggi : ");
		int t_br_kerucut = in.nextInt();
		System.out.println("Masukkan sisi miring : ");
		int s = in.nextInt();
		kerucut.r = r_br_kerucut;
		kerucut.t = t_br_kerucut;
		kerucut.s = s;
		kerucut.volume();
		kerucut.luaspermukaan();
		break;
		case 8 :
		System.out.println("--BOLA--");
		Bola bola = new Bola();
		System.out.println("Masukkan jari-jari : ");
		int r_br_bola = in.nextInt();
		bola.r = r_br_bola;
		bola.volume();
		bola.luaspermukaan();
		break;
		}

		br.volume();
		br.keliling();
		br.luaspermukaan();

		break;

		case 2 :
		BangunDatar bd = new BangunDatar();
		System.out.println("1. KUBUS\n2. LINGKARAN\n3. PERSEGI PANJANG\n4. SEGITIGA");
		System.out.println("Masukkan Pilihan : ");
		int pilihh = in.nextInt();
		switch (pilihh){
		case 1 : 
		System.out.println("--KUBUS--");
		Persegi persegi = new Persegi();
		System.out.println("Masukkan sisi : ");
		int sisi_bd = in.nextInt();
		persegi.sisi = sisi_bd;
		persegi.luas();
		persegi.keliling();break;
		case 2 :
		System.out.println("--LINGKARAN--");
		Lingkaran lingkaran = new Lingkaran();
		System.out.println("Masukkan jari-jari : ");
		int r_bd = in.nextInt();
		lingkaran.r = r_bd;
		lingkaran.luas();
		lingkaran.keliling();break;
		case 3 :
		System.out.println("--PERSEGI PANJANG--");
		PersegiPanjang persegipanjang = new PersegiPanjang();
		System.out.println("Masukkan alas : ");
		int alas_bd = in.nextInt();
		System.out.println("Masukkan lebar  : ");
		int lebar_bd = in.nextInt();
		persegipanjang.alas = alas_bd;
		persegipanjang.lebar = lebar_bd;
		persegipanjang.luas();
		persegipanjang.keliling();break;
		case 4 :
		System.out.println("--SEGITIGA--");
		Segitiga segitiga = new Segitiga();
		System.out.println("Masukkan alas : ");
		int alas_bd_lingkaran = in.nextInt();
		System.out.println("Masukkan tinggi : ");
		int tinggi_bd_lingkaran = in.nextInt();
		segitiga.alas = alas_bd_lingkaran;
		segitiga.tinggi = tinggi_bd_lingkaran;
		segitiga.luas();
		break;
	}
		bd.luas();
		bd.keliling();

		
		
		
		
		
		
		
		break;
	}





	}
}



 
