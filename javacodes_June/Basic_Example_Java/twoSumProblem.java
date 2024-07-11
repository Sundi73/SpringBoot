public class twoSumProblem {


    public static void checkSumOfTwoValueWithOutput(int[] a,int x){

        int c=0,d=0;

        for(int i = 0;i<(a.length-1);i++){
            for(int j = i+1 ; j<a.length;j++){
                if(a[i]+a[j] == x){
                   c = a[i];
                   d = a[j];
                   break;
                }
            }
        }

        System.out.println(c +" "+d);

    }

    public static void main(String[] args) {
        int[] a = {0, -1, 2, -3, 1};
        int x = -1;
        checkSumOfTwoValueWithOutput(a, x);

    }
    
}
