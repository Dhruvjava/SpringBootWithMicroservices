package com.dhruv.beans;

import java.util.Date;

public class WishMassegeGenerator {
	
	private Date date;//ctrl+shift+o :: to import pkg

	

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generateWishMassege(String user) {
		int hour=date.getHours();
		if(hour<12)
			return "GM::"+user;
		else if(hour<16)
			return "GA::"+user;
		else if(hour<20)
			return "GE::"+user;
		else
			return "GN::"+user;
		
		
	}
	

}
