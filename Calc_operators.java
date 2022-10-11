
package Calc_essentials;
public final class Calc_operators {
        public static String SentenceStarter = "The answer is: ";
        public static void Add(float x, float y){
                float answer = x + y;
                System.out.print(SentenceStarter + answer);
        }
        public static void Minus(float x, float y){
                float answer = x - y;
                System.out.print(SentenceStarter + answer);
        }
        public static void Multiply(float x, float y){
                float answer = x * y;
                System.out.print(SentenceStarter + answer);
        }
        public static void Divide(float x, float y){
                float answer = x / y;
                System.out.print(SentenceStarter + answer);
        }
}
