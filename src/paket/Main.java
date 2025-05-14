package paket;

import java.util.Scanner;

public class Main {
	
	
	
	
	
	 private static Scanner scan=new Scanner(System.in);
	
	 
	
	
	public static void islemler() {
		
		System.out.println("1-Hazır menüleri görüntüle");
		System.out.println("2-İçecekleri görüntüle");
		System.out.println("3-Tatlilari görüntüle");
		System.out.println("4-Sipariş ver");
		System.out.println("5-Hesabı göster");
		System.out.println("6-Çıkış");
		
	}

	public static void main(String[] args) {
		
		 int hesap=0;
		 int lahmacun=0;
		 int iskender=0;
		 int pide=0;
		 int  ayran=0;
		 int kola=0;
		 int su=0;
		 int sufle=0;
		 int puding=0;
		 int kunefe=0;
		 
		 Menu menuler=new Menu();
	 
	 
		boolean durum=true;
		System.out.println("Restoranımıza hoş geldiniz");
		System.out.println("Lütfen seçiminizi yapınız");
		System.out.println("****************************");
		islemler();
		
		
		
		
		while(durum) {
		
		
		int secim=scan.nextInt();
		
		
		
		 
			
			switch(secim) {
			
			case 1:
				menuler.hazir_menu_goruntule();

				break;
				
				
			case 2:
				menuler.icecekleri_goruntule();
				break;
				
				
			case 3:
				menuler.tatlilari_goruntule();
				
				break;
				
				
				//sipariş kısmı
			case 4:
				System.out.println("Sipariş alınıyor");
				System.out.println("Hazır menülerden sipariş vermek istiyorsanız 1 i");
				System.out.println("İçecek sipariş vermek istiyorsanız 2 yi");
				System.out.println("Tatlı sipariş etmek istiyorsanız 3 ü tuşlayın");
				int siparis=scan.nextInt();
				
				
				
				
				// hazır menü seçim kısmı
				if(siparis==1) {
					
				System.out.println("Lahmacun menü için 1 i");
				System.out.println("İskender menü için 2 yi");
				System.out.println("Pide menü için 3 ü tuşlayın ");	
				System.out.println("Geri dönmek için 4 ü tuşlayın");
				int menu_secim=scan.nextInt();
				boolean dogru_karar=false;
				
				
				// bir önceki kısma dönmek için döngü kısmı
				while(!dogru_karar) {
				if(menu_secim==1) {
					
					
					System.out.println("Lahmacun menünüz hazırlanmaya başladı.");
					System.out.println("Başka işlem yapmak ister misiniz");
					islemler();
					hesap+=350;
				
					lahmacun++;
				 dogru_karar=true;
					
				}
				else if(menu_secim==2) {
					
					System.out.println("İskender menünüz hazırlanmaya başladı");
					System.out.println("Başka işlem yapmak ister misiniz");
					islemler();
					hesap+=400;
					iskender++;
					dogru_karar=true;
				}
				else if(menu_secim==3) {
					
					System.out.println("Pide menünüz hazırlanmaya başladı");
					System.out.println("Başka işlem yapmak ister misiniz");
					islemler();
					hesap+=350;
					pide++;
					dogru_karar=true;
					
				}
				else if(menu_secim==4) {
					
					System.out.println("Bir önceki sayfaya dönülüyor");
					islemler();
					
					dogru_karar=true;
					
				}
				else
					System.out.println("Geçersiz seçim");
				
					
					
					
				}
				}
				
				
				// içecek seçimi kısmı
				
				else if (siparis==2) {
					
					System.out.println("Hangi icecekten istiyorsunuz");
					System.out.println("Ayran için 1");
					System.out.println("Kola için 2");
					System.out.println("Su için 3");
					System.out.println("Bir önceki ekrana dönmek için 4");
				int icecek_secimi=scan.nextInt();
				boolean dogru_karar=false;
				
				
				// bir önceki kısma dönmek için döngü kısmı
				while(!dogru_karar) {
				if(icecek_secimi==1) {
					System.out.println("Ayranınız yolda.");
					System.out.println("Başka işlem yapmak ister misiniz");
					islemler();
					hesap+=30;
					ayran++;
					dogru_karar=true;
					
				}
				else if (icecek_secimi==2) {
					
					
					System.out.println("Kolanız yolda.");
					System.out.println("Başka işlem yapmak ister misiniz");
					islemler();
					hesap+=35;
					kola++;
					dogru_karar=true;
				}
				else if(icecek_secimi==3) {
					
					
					System.out.println("Suyunuz yolda.");
					System.out.println("Başka işlem yapmak ister misiniz");
					islemler();
					hesap+=10;
					su++;
					dogru_karar=true;
				}
				
				else if(icecek_secimi==4) {
					
					System.out.println("Bir önceki ekrana dönülüyor");
					islemler();
					dogru_karar=true;
					
				}
				else
					System.out.println("Geçersiz seçim");
				}
				}
				
				
				
				// tatlı seçimi kısmı
				else if (siparis==3) {
					
					System.out.println("Hangi tatlıdan istiyorsunuz");
					System.out.println("Sufle için 1");
					System.out.println("Puding için 2");
					System.out.println("Künefe için 3");
					System.out.println("Bir önceki ekrana dönmek için 4");
					int tatli_secimi=scan.nextInt();
					boolean dogru_karar=false;
					
					
					// bir önceki kısma dönmek için döngü kısmı
					while(!dogru_karar) {
						
					
					if(tatli_secimi==1) {
						
						System.out.println("Sufleniz hazırlanıyor");
						System.out.println("Başka işlem yapmak ister misiniz");
						islemler();
						hesap+=50;
						sufle++;
						dogru_karar=true;
					}
					else if (tatli_secimi==2) {
						
						System.out.println("Pudinginiz hazırlanıyor");
						System.out.println("Başka işlem yapmak ister misiniz");
						islemler();
						hesap+=50;
						puding++;
						dogru_karar=true;
					}
					else if(tatli_secimi==3) {
						
						System.out.println("Künefeniz hazırlanıyor");
						System.out.println("Başka işlem yapmak ister misiniz");
						islemler();
					hesap+=75;
					kunefe++;
					dogru_karar=true;
					
					}
					else if (tatli_secimi==4) {
						
						
						System.out.println("Bir önceki ekrana dönülüyor");
						islemler();
						dogru_karar=true;
					}
					else
						System.out.println("Geçersiz seçim");
				}
			}	
			
				
				break;
			
			
			case 5:
				System.out.println("Yenilen lahmacun menu adedi"+lahmacun);
				System.out.println("Yenilen iskender menu adedi"+iskender);
				System.out.println("Yenilen pide menu adedi"+pide);
				System.out.println("İçilen ayran adedi"+ayran);
				System.out.println("İçilen kola adedi"+kola);
				System.out.println("İçilen su adedi"+su);
				System.out.println("Yenilen sufle adedi"+sufle);
				System.out.println("Yenilen puding adedi"+puding);
				System.out.println("Yenilen künefe adedi"+kunefe);
				System.out.println("Toplam hesap:"+hesap);
				System.out.println("6 tuşuna tıklayarak sistemden çıkabilirsiniz");
				
				break;
				
				
				
			case 6:
			System.out.println("Sistemden çıkış yapılıyor");
			durum=false;
			break;
			
			
			}
			
			
			
			
		}
	

	}

}
