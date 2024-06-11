import java.util.Arrays;

public class Greed{
        public static int greedy(int[] dice){

            int result = 0;

            int count = (int) Arrays.stream(dice).filter(i -> i == 1).count();
            if (count >=3){
                result +=1000;
                int modulo = count%3;
                result = result +(modulo*100);
            }else{
                result=count*100;
            }
            count = (int) Arrays.stream(dice).filter(i -> i == 2).count();
            if (count >=3){
                result +=200;
            }
            count = (int) Arrays.stream(dice).filter(i -> i == 3).count();
            if (count >=3){
                result +=300;
            }
            count = (int) Arrays.stream(dice).filter(i -> i == 4).count();
            if (count >=3){
                result +=400;
            }
            count = (int) Arrays.stream(dice).filter(i -> i == 5).count();
            if (count >=3){
                result +=500;
                int modulo = count%3;
                result = result +(modulo*50);
            }else {
                result= result + count*50;
            }
            count = (int) Arrays.stream(dice).filter(i -> i == 6).count();
            if (count >=3){
                result +=600;
            }
            System.out.println("Final result: "+ result);
            return result;
        }
}