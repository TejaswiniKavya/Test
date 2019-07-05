package com.teju.DemoHibernate;

import javax.persistence.Embeddable;
import javax.persistence.Entity;


//@Entity  // if I give @ Entity , it creates new table in the database, but i dont want new table just i ewant to embed with the other table
@Embeddable  // this is to embed with theAlien table
public class AlienName {


		private  String fname;
		private String lname;
		private String mname;
		
		
		
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getMname() {
			return mname;
		}
		public void setMname(String mname) {
			this.mname = mname;
		}
		
		

		@Override
		public String toString() {
			return "AlienName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + "]";
		}
	
}
