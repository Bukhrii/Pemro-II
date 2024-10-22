package PRAK203_2310817210015_MuhammadBukhariFitri;

public class Soal3Main {
	public static void main(String[] args) {
		Pegawai p1 = new Pegawai();
//		Kurang titik koma
//		p1.nama = "Roi"
		p1.nama = "Roi";
		p1.asal = "Kingdom of Orvel";
		p1.setJabatan("Assasin");
//		menambahkan variabel umur karena sebelumnya tidak ada
		p1.umur = 17;
		
//		Tidak sesuai outputnya dengan contoh di modul
//		System.out.println("Nama Pegawai: " + p1.getNama());
		System.out.println("Nama: " + p1.getNama());
		System.out.println("Asal: " + p1.getAsal());
		System.out.println("Jabatan: " + p1.jabatan);
//		Kurang kata "tahun" setelah memanggil p1.umur pada output
//		System.out.println("Umur: " + p1.umur);
		System.out.println("Umur: " + p1.umur + " tahun");
	}

}
