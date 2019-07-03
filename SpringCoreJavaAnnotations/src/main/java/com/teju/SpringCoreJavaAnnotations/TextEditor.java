package com.teju.SpringCoreJavaAnnotations;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	
	
	

	public TextEditor(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}

	
	
	public void spellCheck()
	{
		spellChecker.checkSpelling();
	}
	

}
