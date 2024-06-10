package mondaikaiketuryoku;

public class ch3_7 {
    public static void main(String[] args){
        System.out.println("aaa");
        String s="1945";

        double allPattern=Math.pow(2,s.length()-1);

        int sum=0;
        StringBuffer sb = new StringBuffer();

        for(int bit=0; bit< allPattern;bit++){
            String binary = Integer.toBinaryString(bit);

            boolean appendFlg = false;
            for(int i=0; i<s.length();i++){
                if(!appendFlg){
                    sb.append(s.charAt(i));
                    appendFlg=true;
                }

                if(binary.charAt(i) == '1'){

                    String num =sb.toString();
                    int number = Integer.parseInt(num);
                    sum +=number;
                    sb.delete(0, sb.length());
                }

                sb.append(s.charAt(i+1));


            }
        }

        System.out.println(sum);
        //000
        //001
        //010
        //011
        //100
        //101
        //110
        //111
        



    

    }
}
