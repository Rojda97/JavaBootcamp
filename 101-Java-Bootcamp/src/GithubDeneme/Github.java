package GithubDeneme;

public class Github {

	public static void main(String[] args) {
	
		Musteri musteri1=new Musteri("Deniz","Yýldýrým", "05347894569" , "denizyilmaz@gmail.com");
		
		musteri1.MerhabaDe();
		musteri1.musteriTanýt();
		
		Musteri musteri2=new Musteri("Aysun","Yazýcý","05553269887","aysunyazici@gmail.com");
		
		musteri2.MerhabaDe();
		musteri2.musteriTanýt();
		
	}

}
