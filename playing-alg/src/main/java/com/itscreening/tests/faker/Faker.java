package com.itscreening.tests.faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Faker {
	
	private Character[] lower = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private Character[] numbs = {'0','1','2','3','4','5','6','7','8','9'};
	private List<Character> lcharTempBothify = new ArrayList<Character>();
	private List<Character> lcharTempLetterify = new ArrayList<Character>();
	private List<Character> lcharTempNumerify = new ArrayList<Character>();

	public Faker(){
		ArrayList<Character> alLower =new ArrayList<Character>(Arrays.asList(lower));
		ArrayList<Character> alNumbs =new ArrayList<Character>(Arrays.asList(numbs));
		lcharTempBothify.addAll(alLower);
		lcharTempBothify.addAll(alNumbs);
		lcharTempLetterify.addAll(alLower);
		lcharTempNumerify.addAll(alNumbs);
	}

    public String letterify(String letterString) {
		Pattern p = Pattern.compile(Pattern.quote("?"));
		Matcher m = p.matcher(letterString);
 		while (m.find()){
 			letterString =  m.replaceFirst(returnRandoChar().toString());
 			m = p.matcher(letterString);
		}
		return letterString.toString();
    }
	private Character returnRandoChar(){
		return lcharTempLetterify.get(new Random().nextInt(lcharTempLetterify.size()));
		
	}
	private Character returnRandoCharNumber(){
		return lcharTempNumerify.get(new Random().nextInt(lcharTempNumerify.size()));
		
	}

    public String numerify(String numberString) {
		Pattern p = Pattern.compile(Pattern.quote("#"));
		Matcher m = p.matcher(numberString);
 		while (m.find()){
 			numberString =  m.replaceFirst(returnRandoCharNumber().toString());
 			m = p.matcher(numberString);
		}
		return numberString.toString();
    }

    public String bothify(String string) {
    	string=letterify(string);
    	string=numerify(string);
        return string;
    }

}
