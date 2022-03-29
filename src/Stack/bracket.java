package Stack;


import java.util.Stack;

public class bracket {
    public static boolean isMatched(String exp){
        String open="({[";
        String close=")}]";
        if(exp.length()%2!=0) return false;
        Stack<Character> sta= new Stack<>();
        for(Character ch: exp.toCharArray()){

            if(open.indexOf(ch)>=0){
//                System.out.println("them vao character: "+ch);
                sta.push(ch);
            }else{
                char outOpenCh= sta.pop();
//                System.out.println("index trong close: "+ close.indexOf(ch)+" index trong open: "+open.indexOf(outOpenCh));
                if(close.indexOf(ch)!=open.indexOf(outOpenCh)) return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String exp= "{[(}]}";
        System.out.println(isMatched(exp));
    }
}
