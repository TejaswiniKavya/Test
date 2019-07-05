package com.teju.DemoHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="alien_table") // by default table name will be Alien(nae of the class), if we want to change the table name make it like this
public class Alien {
	
	//@Id  // this is to specify primary key
	//private int aid;
	
	//@Transient  // this automatically drops the aname column from the table 
	//private String aname;
	
	//@Column(name="alien_colour") // this to change the name of column in a database(By default it takes colour as a name of column in table)
	//private String colour;
	
	
	@Id
	private int aid;
	private AlienName aname;
	private String colour;
	
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	@Override // we need to override toString to fetches the data  otherwise uit gives hashCode(objects)
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", colour=" + colour + "]";
	}
	
	
	

}
