
public class Main {
    static int countSquares = 0, countRectangles = 0, countPolygons=0;
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
