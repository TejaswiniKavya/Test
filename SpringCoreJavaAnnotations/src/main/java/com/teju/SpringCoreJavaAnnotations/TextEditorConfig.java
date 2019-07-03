package com.teju.SpringCoreJavaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TextEditorConfig { // this is used instead of xml file

	@Bean
	public TextEditor textEditor()
	{
		return new TextEditor(spellChecker());
				
	}
	
	@Bean
	public SpellChecker spellChecker()
	{
		return new SpellChecker();
	}
	
	
	
}
