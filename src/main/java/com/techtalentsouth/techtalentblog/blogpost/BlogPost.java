package com.techtalentsouth.techtalentblog.blogpost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity		//storing obj persistently using Java persistance API (JPA)
			// entity modifys this class

public class BlogPost {
	
	
	
	@Id     //marks as primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;  //primary key
	
	private String title;

	private String author;

	private String blogEntry;

	public BlogPost(){			//non-argument constructor needed for JPA
	    
	}	
		
	public BlogPost(String title, String author, String blogEntry) {	
		this.title=title;
	
		this.author=author;
		
		this.blogEntry=blogEntry;
	
}

	public Long getId() {
		return id;
	}

	
	public String getTitle() {
		return title;
	}

	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	
	}
	
	 @Override
	    public String toString() {
		return "BlogPost [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
	    }

	public void setTitle(String title2) {
		// TODO Auto-generated method stub
		
	}
	
}
