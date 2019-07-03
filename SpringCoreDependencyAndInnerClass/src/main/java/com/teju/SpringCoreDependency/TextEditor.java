package com.teju.SpringCoreDependency;

public class TextEditor {
	
	private SpellChecker spellchecker;
	
	/*  public TextEditor()   
	{
		SpellChecker=new SpellChecker();  //ths is dependent on TextEditor. So we need to create seperate class for this
	}  */
		
	
	/* public TextEditor( SpellChecker spellchecker)
	{
		this.spellchecker=spellchecker;   // Constructor based Dependency injectoin
	}  */

	
	
	public void setSpellChecker(SpellChecker spellchecker) // this is setter based dependency injection
	{
		System.out.println("Inside setspellChecker:.");
		this.spellchecker = spellchecker;
	}
	
	
	public SpellChecker getSpellChecker() {
		return spellchecker;
	}
	
	
	
	
	public void spellCheck()
	{
		spellchecker.checkSpelling();
	}

	

}
