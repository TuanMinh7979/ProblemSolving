package Dynamic;

public class climbing {

    public int hdl(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return hdl(n-1)+hdl(n-2);

    }

    public int hdl1(int n){
        int sum=0;
        if(n==1) return 1;
        if(n==2) return 2;
        int [] steps= new int[n+1];
        steps[0]=0;
        steps[1]=1;
        steps[2]=2;
        for(int i=3; i<= n; i++){
            steps[i]=steps[i-1]+steps[i-2];
        }
        return steps[n];

    }

    public static void main(String[] args) {

        climbing obj = new climbing();
        int a=obj.hdl1(35);
        System.out.println(a);
    }
}
