
public class Main {

    public static void main(String[] args){
        String[] str = {"pear",
                "amleth",
                "dormitory",
                "tinsel",
                "dirty room",
                "hamlet",
                "listen",
                "silent"};
        String[] result = Anagram.Solution(str);
        for(String outputStr: result)
        System.out.println(outputStr);
    }
}
