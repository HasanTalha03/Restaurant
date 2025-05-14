package paket;

import java.util.ArrayList;

public class Menu {

	private ArrayList<String> menu=new ArrayList<String>();
	private ArrayList<String> icecekler=new ArrayList<String>();
    private ArrayList<String> tatlilar=new ArrayList<String>();
    private ArrayList<Integer> menu_fiyatlari=new ArrayList<Integer>();
    private ArrayList<Integer> icecek_fiyatlari=new ArrayList<Integer>();
    private ArrayList<Integer> tatli_fiyatlari=new ArrayList<Integer>();
    
   
   
   
   
	 {
		menu.add("Lahmacun menu");   
		menu.add("Iskender menu");  
		menu.add("Karışık pide menu"); 
		icecekler.add("Ayran");
        icecekler.add("Su");   
        icecekler.add("Kola"); 
        tatlilar.add("Sufle");  
        tatlilar.add("Puding"); 
        tatlilar.add("Künefe"); 
        menu_fiyatlari.add(350);
        menu_fiyatlari.add(400);
        menu_fiyatlari.add(350);
        icecek_fiyatlari.add(30);
        icecek_fiyatlari.add(10);
        icecek_fiyatlari.add(35);
        tatli_fiyatlari.add(50);
        tatli_fiyatlari.add(50);
        tatli_fiyatlari.add(75);
	}
	 
	 public void hazir_menu_goruntule() {
		 
		 for(String a:menu) {
			 
			 
			 System.out.println(a);
		 }
		 for(int d: menu_fiyatlari) {
			 
			 System.out.println(d);
			 
		 }

	 }
	 
	 public void icecekleri_goruntule() {
		 
		 for(String b: icecekler) {
			 
			 System.out.println(b);
		 }
		 for(int e:icecek_fiyatlari) {
			 
			 
			 System.out.println(e);
		 }

	 }
	 
	 public void tatlilari_goruntule() {
			
			
			for(String c: tatlilar) {
				
				System.out.println(c);
			}
		 for(int f: tatli_fiyatlari) {
			 
			 System.out.println(f);
			 
		 }
		}
			
	 
	
	

	
	
	
	
	
	
	
	
}
