import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

    }

    public class Greed{

        int [] dice = {5,1,3,4,1};
        public static int greedy(int[] dice){
            int result = 0;
            int counter = 0;

            for (int number : dice){
                switch (number){
                    case 1:
                        result +=100;
                        if (result == 300){
                            result+=700;
                        }
                        break;
                    case 2:
                        counter +=1;
                        if (counter == 3){
                            result+=200;
                        }
                        break;
                    case 3:
                        counter +=1;
                        if (counter == 3){
                            result+=300;
                        }
                        break;
                    case 4:
                        counter +=1;
                        if (counter == 3){
                            result+=400;
                        }
                        break;
                    case 5:
                        result +=50;
                        if (result == 150){
                            result+=350;
                        }
                        break;
                    case 6:
                        counter +=1;
                        if (counter == 3){
                            result+=600;
                        }
                        break;
                }

            }

            return result;
        }
    }
}