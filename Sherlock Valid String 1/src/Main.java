import java.util.HashMap;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.HashSet;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String word = "aabbcd";
        System.out.println(isValid(word));
    }

    public static String isValid(String s) {

        HashMap<Character,Integer> count= new HashMap<>();

        for (int i=0;i<s.length();i++){
            Character curChar=s.charAt(i);
            if (count.containsKey(curChar)){
                count.put(curChar,count.get(curChar)+1);
            }
            else {count.put(curChar,1);}
        }
        HashMap<Integer,Integer> frequenciesAndTheirFrequencies=new HashMap<>();

        for (int freq: count.values()){
            if (frequenciesAndTheirFrequencies.containsKey(freq)){
                frequenciesAndTheirFrequencies.put(freq,frequenciesAndTheirFrequencies.get(freq)+1);
            }
            else {frequenciesAndTheirFrequencies.put(freq,1);}
        }

        if (frequenciesAndTheirFrequencies.size()<2) return "YES";
        if (frequenciesAndTheirFrequencies.size()>2) return "NO";

        for (int freq: frequenciesAndTheirFrequencies.keySet()){
            if (freq==1 && frequenciesAndTheirFrequencies.get(1)==1){
                return "YES";
            }
            if (frequenciesAndTheirFrequencies.get(freq)==1 && frequenciesAndTheirFrequencies.containsKey(freq-1)){
                return "YES";
            }
        }
        return "NO";
    }
}