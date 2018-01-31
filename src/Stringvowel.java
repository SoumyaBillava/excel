import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stringvowel {
	public static void main(String args[])
	{
		String s = "Welcome to Sagarasft";
		Map<Character, Integer> result = new HashMap<>();
		
		List<Character> vowels = new ArrayList<>();
		
		/** Each string in args represents one character**/
		for (String string : args) {
			vowels.add(Character.valueOf(string.charAt(0)));
		}
		
		
		char charArray[] = s.toCharArray();
		for (char c : charArray) {
			Character current = Character.valueOf(c);
			if(vowels.contains(current)){
				if(result.containsKey(current)) {
					int count = result.get(current);
					result.put(current, count+1);		
				}
				else {
					result.put(current, 1);
				}
			}
		}
		
		System.out.println(result);
	}
}

/*
int a=0,e=0,i=0,o=0,u =0;

char c[] = s.toCharArray();
for(int j=0;j<c.length;j++ )
{
switch(c[j])
{
case 'a': a++;
break;
case 'e': e++;
break;
case 'i': i++;
break;
case 'o': o++;
break;
case 'u': u++;
break;
}
}
*/