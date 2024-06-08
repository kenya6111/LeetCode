package z_javademanabu.chapter1;

public class prac3 {
    public static int med3(int a, int b, int c){

        if(a>=b){
            if(a>b){
                if(b>=c){
                    if(b>c){
                        return b;
                    }else{
                        return b;
                    }
                }else{
                    if(a>=c){
                        if(a>c){
                            return c;
                        }else{
                            return c;
                        }
                    }else{
                        return a;
                    }
                }

            }else{
                if(b>=c){
                    if(b>c){
                        return b;

                    }else{
                        return b;
                    }

                }else{
                    return b;
                }
            }
        }else{
            if(b>=c){
                if(b>c){
                    if(a>c){
                        return c;
                    }else{
                        return a;
                    }
                }else{

                }

            }else{

            }

        }

        return 1;

    }
    public static int medd3(int a, int b, int c){
        if(a>=b){
            if(a>b){
                if(a>c){
                    if(b>=c){
                        return b;
                    }else{
                        return c;
                    }
                }else{
                    if(c>a){
                        return a;
                    }else{
                        return a;
                    }
                }
            }else{
                return b;
            }
        }else{
            if(b>c){
                if(a>c){
                    return a;
                }else{
                    return a;
                }
            }else{
                if(c>b){
                    return b;
                }else{
                    return b;
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println("aaa"); 
     }
}
