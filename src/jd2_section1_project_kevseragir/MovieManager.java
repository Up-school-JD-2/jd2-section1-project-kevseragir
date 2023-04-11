package jd2_section1_project_kevseragir;

	import java.util.ArrayList;
import java.util.Arrays;


	public class MovieManager extends Movie{
	
		
		 ArrayList<Movie> movies = new ArrayList<Movie>();


		public MovieManager(Long movieİd, String title, String director, String actor, String date, String detail,String type) {
				super(movieİd, title, director, actor, date, detail, type);
		}	

		public void add(Movie movie) { 
			
			movies.add(movie);
			 
			for (Movie m : movies) {
				System.out.println(m.toString() );
			} 
		}

		public void delete(Long id) {	 //(-) MovieDelete	
			
			int i=0;
			
			for (Movie m : movies) {
				
				if(m.getId() == id )
				{
					movies.remove(i);
					System.out.println( "kayıt silindi" );
					break;
				}
				i++; 
			}   
		}
		
		public void search( int id) {		
			
			for (Movie m : movies) {
				if(m.getId() == id )
					System.out.println(m.toString() );
				else System.out.println( "kayıt bulunamadı" );
			}  
		}
	}



