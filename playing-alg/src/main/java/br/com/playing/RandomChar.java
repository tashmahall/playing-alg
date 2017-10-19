package br.com.playing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomChar {
	private Character[] lower = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private Character[] upper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private Character[] numbs = {'0','1','2','3','4','5','6','7','8','9'};
	private List<Character> lcharTemp = new ArrayList<Character>();
	private List<Character> lowerList = new ArrayList<Character>();
	private List<Character> upperList = new ArrayList<Character>();
	private List<Character> numbsList = new ArrayList<Character>();
	public RandomChar(){
		ArrayList<Character> alLower =new ArrayList<Character>(Arrays.asList(lower));
		ArrayList<Character> alUpper =new ArrayList<Character>(Arrays.asList(upper));
		ArrayList<Character> alNumbs =new ArrayList<Character>(Arrays.asList(numbs));
		lcharTemp.addAll(alLower);
		lcharTemp.addAll(alUpper);
		lcharTemp.addAll(alNumbs);
		lowerList.addAll(alLower);
		upperList.addAll(alUpper);
		numbsList.addAll(alNumbs);
	}
	public String returnThreeNumbers(){
		Random c =new Random();
		String temp = numbsList.get(c.nextInt(numbsList.size())).toString()+numbsList.get(c.nextInt(numbsList.size())).toString()+numbsList.get(c.nextInt(numbsList.size())).toString();
		return temp;
	}
	public String returnThreeChar(){
		Random c =new Random();
		String temp = lcharTemp.get(c.nextInt(lcharTemp.size())).toString()+lcharTemp.get(c.nextInt(lcharTemp.size())).toString()+lcharTemp.get(c.nextInt(lcharTemp.size())).toString();
		return temp;
	}
	public Character returnRandoChar(){
		
		return lcharTemp.get(new Random().nextInt(lcharTemp.size()));
		
	}
	public String substChar(String string){
		Pattern p = Pattern.compile(Pattern.quote("?"));
		Matcher m = p.matcher(string);
 		while (m.find()){
 			string =  m.replaceFirst(returnRandoChar().toString());
 			m = p.matcher(string);
		}
		return string.toString();
	}

}
