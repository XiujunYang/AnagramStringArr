import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class Anagram {
    
    public static String[] Solution(String[] str){
        ArrayList<char[]> group = new ArrayList<char[]>();
        ArrayList<ArrayList<String>> originalList = new ArrayList<ArrayList<String>>();
        String[] tempstr = str.clone(); //clone could do deep copy, and avoid to change str.
        
        //Category group for str.
        outerloop:
        for(int pos=0; pos<tempstr.length; pos++){
            tempstr[pos]= tempstr[pos].trim().replaceAll(" ", "");
            char[] c = new char[tempstr[pos].length()];
            tempstr[pos].getChars(0,tempstr[pos].length(),c,0); //last character is at index srcEnd-1 
            Arrays.sort(c);//ignore character's order in string.
            ArrayList<String> sArrList = new ArrayList<String>();
            
            Iterator<char[]> it = group.iterator();
            while(it.hasNext()){
                sArrList.clear();
                char[] comparedChars = (char[])it.next();
                if(Arrays.equals(comparedChars,c)){//only compare character in same index.
                    sArrList = originalList.get(group.indexOf(comparedChars));
                    sArrList.add(str[pos]);
                    continue outerloop;
                }
            }
            // can not find group
            sArrList.add(str[pos]);
            originalList.add(sArrList);
            group.add(c);
        }
         
        //Following begin to do sorting.
        String[] groupStr = new String[group.size()];
        Iterator<ArrayList<String>> it2 = originalList.iterator();
        for(int groupId=0 ; groupId<group.size() && it2.hasNext(); groupId++){
            ArrayList<String> temp = it2.next();
            Collections.sort(temp); // let string in each single row sort by alphabet.
            for(Iterator it3 = temp.iterator();it3.hasNext();){
                String ss = (String) it3.next();
                if(groupStr[groupId]==null || groupStr[groupId].length()==0) groupStr[groupId] = ss;
                else groupStr[groupId] += "," + ss;
            }
        }
        
        Arrays.sort(groupStr);// let group sort by alphabet. 
        return groupStr;
    }
}
