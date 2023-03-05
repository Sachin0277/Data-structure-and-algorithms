import java.util.HashMap;
import java.util.ArrayList;
public class MorseCodeToEnglish{
    public static String morseToEnglish(String morsecode) 
	{
       String[] codes = { ".-", "-...", "-.-.", "-..",
                            ".", "..-.", "--.", "....", 
                            "..", ".---", "-.-", ".-..",
                            "--", "-.", "---", ".--.", 
                            "--.-", ".-.", "...", "-",
                            "..-", "...-", ".--", "-..-",
                            "-.--", "--..", "-----", ".----",
                            "..---", "...--", "....-", ".....",
                            "-....", "--...", "---..", "----." };

        // Initialize a HashMap having (key - value), where key = morsecode , value = letter (a - z, 0 - 9)
        HashMap<String, Character> map = new HashMap();

        // Traverse in codes array
        for(int i = 0; i < codes.length; i++) 
        {
            // First 26 have hashcodes for (a - z)
            if(i < 26) 
            {
                map.put(codes[i], (char)('a' + i));
            }
            // Last 10 have hashcodes for (0 - 9)
            else 
            {
                map.put(codes[i], (char)('0' + i - 26));
            }   
        }

        StringBuffer ans = new StringBuffer();
        ArrayList<String> morse = new ArrayList<>();
        StringBuffer word = new StringBuffer();
        for (int i = 0; i < morsecode.length(); i++) 
        {  
            
            // If space found push in list
            if (morsecode.charAt(i) == ' ') 
            {
                if(word.length() > 0) 
                {
                    morse.add(word.toString());
                }
                word.delete(0, word.length());
            }
            else 
            {
                word.append(morsecode.charAt(i));
            }

        }
        morse.add(word.toString());
         for(int i = 0; i < morse.size(); i++) 
        {

            // Initialize the variable used to store the character
            if(map.containsKey(morse.get(i))) 
            {
                char temp = map.get(morse.get(i));
                
                // Append the current character in ans
                ans.append(temp);
            }

        }

        // Return the string formed
        return ans.toString();
        

    }
    public static void main(String[] args) {
        
        String morsecode ="----. ---.. ....- ..... -----";

        String ans = morseToEnglish(morsecode);
        System.out.println(ans);

    }
}