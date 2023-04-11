package jd2_section1_project_kevseragir;


	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.Scanner;

	public class Main {
		public static void main(String[] args) {
			
			  int choice	=0;
			 Scanner sc	=new Scanner(System.in);
			UserManager userManager_	=new  UserManager(null, null, null, null);
			MovieManager movieManager_		=new MovieManager(null, null, null, null, null, null, null);
			  printMenu();
			  do {
		            System.out.print("Seçiminiz : ");
		            choice = sc.nextInt();
			
			  switch (choice) {
	                case 2 -> { 
	                    System.out.print("kullanıcı ıd :");
	                    Long id = sc.nextLong();
	                    System.out.print("Ad Soyad : ");
	                    sc.nextLine();
	                    String userName = sc.nextLine();
	                    System.out.print("Şifre : ");
	                    String password = sc.nextLine();
	                    System.out.print("Email Adresi : ");
	                    String email = sc.nextLine();
	                    User user = new User(id,userName,password,email); 
	                    userManager_.add(user);
	                    System.out.println(" -Kullanıcı Oluşturuldu " + userName);

	                }
	                
	      
	                case 3 -> {
	                    System.out.print("Silmek İstediğiniz Kullanıcı Id'si : ");
	                    Long id = sc.nextLong();
	                    userManager_.delete(id);
	                    System.out.println(" -Hesabınız Silindi-");
	                }
	                
	                
	       
	                case 4 -> { 
	                    System.out.print("Aramak İstediğiniz Kullanıcı Id'si Giriniz : ");
	                    sc.nextLine();
	                    Long id = sc.nextLong();
	                    userManager_.search(id);
	                }
	                case 5 -> { 
	                    System.out.print("Film Id'si : ");
	                    Long movieId = sc.nextLong();
	                    System.out.print("Film İsmi : ");
	                    sc.nextLine();
	                    String title = sc.nextLine();
	                    System.out.print("Yönetmeni : ");
	                    String director = sc.nextLine();
	                    System.out.print("Oyuncular : ");
	                    String actor=sc.nextLine();
	                    System.out.print("Yayın Tarihi : ");
	                    String date = sc.nextLine();
	                    System.out.print("Açıklaması : ");
	                    String detail=sc.nextLine();
	                    System.out.print("Türü : ");
	                    String type = sc.nextLine();
	                    Movie movie = new Movie( movieId,title,  director, actor, date,  detail, type);
	                    movieManager_.add(movie);
	                    System.out.println(" -Film Eklendi- ");
	                }
	                
	                
	                case 6 -> { //Movie Delete
	                    System.out.println("--------------------------------");
	                    System.out.println("Silmek İstediğiniz Filmin IDini Giriniz :");
	                    sc.nextLine();
	                    Long id = sc.nextLong();
	                    movieManager_.delete(id);
	                    System.out.println("--------------------------------");
	      
	                }
	                case 7 -> {
	                    System.out.println("--------------------------------");
	                    System.out.println("Aramak İstediğiniz Filmin IDsini Giriniz : ");
	                    sc.nextLine();
	                    int id = sc.nextInt();
	                    movieManager_.search(id);
	                    System.out.println("--------------------------------");
	                }
	                
	                
	                
	                case 8 -> {
	                    System.out.println("*************************************");
	                    System.out.print("filmler - - - - - - - - - - - - - - - - - - \n");
	                 
	                  System.out.println(   movieManager_.movies.toString() );  
	                  
	                }

	                case 0 -> {
	                    System.out.println(" İyi Günler");
	                }
	                default -> printMenu();
	            }
			  } while (choice != 0);

	}
		
	private static void printMenu() {
	    System.out.println("< < <-----------Menü--------------> > >");
	    System.out.println("1 -> Giriş Yapmak İçin");
	    System.out.println("2 -> Kullanıcı Hesabı Oluşturmak İçin");
	    System.out.println("3 -> Kullanıcı Hesabı Silmek İçin");
	    System.out.println("4 -> Kullanıcı Hesabı Aramak İçin");
	    System.out.println("5 -> Film Eklemek İçin");
	    System.out.println("6 -> Film Silmek İçin");
	    System.out.println("7 -> Film Aramak İçin");
	    System.out.println("8 -> Filmleri Listelemek İçin");
	    System.out.println("0: Çıkış Yapmak İçin \n\n");
	}

	}

