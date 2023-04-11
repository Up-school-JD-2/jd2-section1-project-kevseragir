package jd2_section1_project_kevseragir;


public class Movie {
	
	private Long id;
	private String Title;
	private String director;
	private String actor;
	private String date;
	private String detail;
	private String type;



	public Movie(Long movieId, String title, String director, String actor, String date, String detail, String type) {
		this.id = movieId;
		this.Title = title;
		this.director = director;
		this.actor = actor;
		this.date = date;
		this.detail = detail;
		this.type = type;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		actor = actor;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		date = date;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

    @Override
    public String toString() {
        return "id: "+ this.id.toString() +
        	   "  Film Başlığı :" + this.getTitle() +
        	   "  Film Türü   :" + this.getType() + 
         	   "  Aktör : " + this.actor +" Yayınlanma Tarihi :"+this.date+
         	   "  Açıklaması :" +this.detail+ " Oyuncular :"+this.actor;
    }
        
	
	
	}


