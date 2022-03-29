package other;

import java.util.HashMap;
import java.util.Map;

public class RobotReturn {
    public static boolean checkRobotReturn(String moves){
        Map<Character, Integer> hsm= new HashMap<>();
        hsm.put('R', 1);
        hsm.put('L', -1);
        hsm.put('U', 2);
        hsm.put('D', -2);
        int len= moves.length();
        if(len%2!=0) return false;
        char[] movearr= moves.toCharArray();
        int sum=0;
        for(int i=0 ; i< movearr.length; i++){
           sum+=hsm.get(movearr[i]);
        }
        return sum == 0;


    }
    public static void main(String[] args) {
        System.out.println(checkRobotReturn("LURD"));
    }
}
