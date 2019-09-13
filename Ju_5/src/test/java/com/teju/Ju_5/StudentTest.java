package com.teju.Ju_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void groupedassertions() {
		Student s=new Student("raj","kumara");
		
		assertAll("student", () -> assertEquals("raj",s.getFirstName(),"first name is not matching"),
							 () ->assertEquals("kumara",s.getLastName())
				
				
				);
	}
	
	
	@Test
	void dependentAssertion()
	
	// Within a code block, if an assertion fails the
    // subsequent code in the same block will be skipped.
	{
		Student student=new Student("kamala","shivakumar");
		
		assertAll("propertioes",
				
				()->{
					String firstName=student.getFirstName();
					
					// Executed only if the previous assertion is valid.
					assertNotNull(firstName);
					
					assertAll("first name",
							()->assertTrue(firstName.startsWith("k")),
							()->assertTrue(firstName.endsWith("a"))
							);	
				},
				
				()->
				{
					
					// Grouped assertion, so processed independently
	                // of results of first name assertions.
					String lastName=student.getLastName();	
					
					assertNotNull(lastName);
					
					// Executed only if the previous assertion is valid.
					assertAll("last name",
							()-> assertTrue(lastName.startsWith("s")),
							()->assertTrue(lastName.endsWith("r"))
							
							);
				}
				
				
				
				);
	}
	
	
	
}
