Package Lecture29CipherSchools;
public class Anagrams{
  static boolean is Anagram(String s1,String s2){
    if(s1.length() !=s2.length()) retrurn false;
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    int n=s1.length();
    int freqArr1[]= new int[26];
    int freqArr2[]= new int[26];
    for(int i-0;i<n;i++)
    {
      int index1=s1.charAt(i)-'a';
      freqArr1[index1]++;
      int index2=s2.charAt(i)-'a';
      freqArr1[index2]++;
    }
    for(int i=0;i<26;i++)
    {
      if(freqArr[i]!=freqArr2[i]){
        return false;
      }
    public static void main(String[] args){
      System.out.println(isAnagram("CAT","TAC"));
      System.out.println(isAnagram("CAT","TAG"));
      System.out.println(isAnagram("CAT","TACC"));
    }
    
}
