package PRAK203_2310817210015_MuhammadBukhariFitri;

//Pada baris ini terjadi error karena nama classnya harusnya Pegawai, bukan Employee
//public class Employee
public class Pegawai {
	public String nama;
//	seharusnya tipe data string bukan char
//	public char asal;
	public String asal;
	public String jabatan;
	public int umur;
	
	public String getNama() {
		return nama;
	}
	public String getAsal() {
		return asal;
	}
//	Kurang parameter j
//	public void setJabatan() {
	public void setJabatan(String j) {
		this.jabatan = j;
	}
}
