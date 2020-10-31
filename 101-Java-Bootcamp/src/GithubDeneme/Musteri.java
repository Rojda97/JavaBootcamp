package GithubDeneme;

public class Musteri {

	private String isim;
	private String soyisim;
	private String telefonno;
	private String email;
	
	public Musteri(String _isim, String _soyisim, String _telefonno, String _email) 
	
	{
	
		
		this.isim=_isim;
		this.soyisim=_soyisim;
		this.telefonno=_telefonno;
		this.email=_email;
		
	}
	
	public void musteriTanýt()
	    {
		
		System.out.println("Isim: "+isim+ " Soyisim: "+soyisim+" Telefon numarasi: "+telefonno + 
				" Email: "+ email);
		}
	
	public void MerhabaDe() 
	{
		System.out.println("Merhaba");
	}
	
}
