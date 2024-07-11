

public class FrequencyCountOfString {

    public static void countNumberOfString(String a){

        char[] ch = a.toCharArray();

        for(int i=0;i < ch.length; i++){

            char x = ch[i];
            int count = 0;

            for(int j = 0 ;j<ch.length;j++){
                if(ch[j] == x){
                    count++;
                    ch[j] = ' ';
                }
            }

            if(x == ' '){
                continue;
            }
            System.out.println(x+" ---- "+count);

        }


    }

    public static void main(String[] args) {
        System.out.println("Character And there frequency Count ");
        countNumberOfString("picture perfect");
    }
    
}
