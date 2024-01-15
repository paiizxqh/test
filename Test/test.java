public class Test{
    public int num;

    public statis void intToRoman(int num){
        char r[] = new char[];
        int i = 0;  

        if(num<1){
            System.out.println("!!");
            return;
        }

        while(num > 0){
            if(num >= 1000){
                i = digit('M',num/1000,i,r)
                num = num % 1000; //mod เศษ
            }

            if(num >= 500){
                if(num <= 900){
                    i = digit('D',num/500,i,r);
                    num = num % 500;
                }
                else{
                    i =s_digit('C','M',i,r);
                    num = num % 100;
                } 
            }

            else if(num >= 100){
                if(num <= 400){
                    i = digit('C',num/100,i,r);
                    num = num % 100;
                }
                else{
                    i = s_digit('L','D',i,r);
                    num = num % 50;
                }
            }

            else if (num >= 50){
                if(num <= 90){
                    i = digit('L',num/50,i,r);
                    num = num % 50;
                }
                else{
                    i = s_digit('X','C',i,r);
                    num = num % 10;
                }
            }

            else if (num >= 10){
                if (num <= 40){
                    i = digit('X',num/10,i,r);
                    num = num % 10;
                }
                else{
                    i = s_digit('V','L',i,r);
                    num = num % 5;
                }
            }

            else if (num >= 5){
                if (num <= 9){
                    i = digit('V',num/5,i,r);
                    num = num % 5;
                }
                else{
                    i = s_digit('I','X',i,r);
                    num = num % 1;
                }
            }
            else if (num >= 1){
                if(num <= 4){
                    i = digit('I',num,i,r)
                }
            }

        }
    }

    public static int digit(char c, int n, int i , char[] r){
        for(int j =0, j<n; j++){
            r[i++] = c;
        }
        return i;
    }

    public static int s_digit (char c1,char c2,int i, char[] r){
        r[i++] = c1;
        r[i++] = c2;
        return i;
    }



}