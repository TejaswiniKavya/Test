package com.teju.HibernateFetching;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;



@Entity
@Table(name="alien_table")

public class Alien {

	
		@Id
		private int id;
		private String aname;
		
		@OneToMany(mappedBy="alien",fetch=FetchType.EAGER)//by default it is lazy we need to make it eager
		private Collection<Laptopp> laps=new ArrayList<Laptopp>();
		
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAname() {
			return aname;
		}
		public void setAname(String aname) {
			this.aname = aname;
		}
		public Collection<Laptopp> getLaps() {
			return laps;
		}
		public void setLaps(Collection<Laptopp> laps) {
			this.laps = laps;
		}
		
		@Override
		public String toString() {
			return "Alien [id=" + id + ", aname=" + aname + ", laps=" + laps + "]";
		}
		
		
		 
		
	

}
