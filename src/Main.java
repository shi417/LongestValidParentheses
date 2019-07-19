public class Main {

    public static void main(String[] args) {
        String s="()(()())((((())";


        int[] flag=new int[s.length()];
        for(int i=0;i<flag.length;i++){
            flag[i]=0;
        }

        boolean have=true;
        while(have) {
            have=false;
            for (int j = 1; j < flag.length; j++) {

                if (s.charAt(j) == ')' &&flag[j]!=1) {

                    for(int m=j-1;m>=0;m--){
                        if(flag[m]!=1&&s.charAt(m)=='('){
                            flag[j]=1;
                            flag[m] = 1;
                            have = true;

                            break;
                        }
                    }

                }


            }
        }
        for (int i : flag) {
            System.out.println(i);
        }

        int length = 0;
        int max = 0;
        for(int i=0;i<flag.length;i++){
            if(flag[i] == 1){
                length++;
                continue;
            }
            if (length > max){
                max = length;
            }
            length=0;
        }
        if (length > max){
            max = length;
        }
        System.out.println(max);

    }
}
