package ArrayProblem;

public class isSubSequence {
    public boolean isSubsequence(String s, String t) {
        char[] tarr= t.toCharArray();
        char[] sarr=s.toCharArray();
        int j=0;
        for(int i=0; i< tarr.length ; i++){

            if(tarr[i]==sarr[j]){
                j++;

            }
            if(j==sarr.length) break;
        }
        if(j==sarr.length){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
       String s="agb";
       String t="ahbgdc";
       isSubSequence obj=new isSubSequence();
        System.out.println(obj.isSubsequence(s, t));
    }
}
