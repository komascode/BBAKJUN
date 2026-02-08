import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String str = st.nextToken(); // ZZZZZ가 담김.
        
        int exp = Integer.parseInt(st.nextToken()); // 36 (36진법)
        
        int sum = 0; // 총 값을 계산할 변수
        
        int length = str.length()-1;
        
        int result = 0;
        for(int i=0; i<str.length();i++){ //ZZZZZ가 총 문자열이 5임으로 5번반복
            char c = str.charAt(length-i); // 16진법을 계산할땐 맨 뒤부터.. (Z*36^0)부터 계산

            if(c>='A'&&c<='Z'){ //대문자로 값이 들어올 때
                
                result = c-55; // Z는 90이기에 - 55를 하면 문제의 값 처럼 35가 나옴
                
                sum = sum+(int)Math.pow(exp, i)*result; // 제곱승을 구하는 Math 함수. 찾아보셈 이건
                
            }else {
                result = c-'0'; // 그냥 정수로 들어올 경우 2~9까지는 정수로 표현가능 하지만
                
                //10부터는 A로 표현해야 하기 때문
                sum = sum+(int)Math.pow(exp, i)*result;

            }

        }

        System.out.println(sum);
    }

}