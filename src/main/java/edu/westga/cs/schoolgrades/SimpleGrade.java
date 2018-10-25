package edu.westga.cs.schoolgrades;

public class SimpleGrade implements Grade {

	private double aSingleGrade;
	
	public SimpleGrade(String aGrade) {
		try  
		  {  
			this.aSingleGrade = Double.parseDouble(aGrade);  
		  }  
		  catch(NumberFormatException nfe)  
		  {  
		   
		  }  
		
	}
	
	@Override
	public double getValue() {
		return this.aSingleGrade;
	}

}
