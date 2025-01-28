package Day3.NoOfWords;

public class NoOfWords {
    public static int words(String s) {
int c = 0;
char [] m = s.toCharArray();
for(int i = 0; i < m.length; i++){
    if((m[i] == ' ') || (m[i] == ' '))
        c++;
}
    return c+1;
} 
public static void main(String[] args){
    String s1 = "This is Java World";
    System.out.println("Words: " + words(s1));
}
    }
    

