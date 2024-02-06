1.덧셈식 출력
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int plus = a+b;
        System.out.printf("%d + %d = %d", a,b,plus);
    }
}
------------------------------------------------
2.문자열 붙여쓰기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String arr= a +b;
        String str = a.replace(" ","");
        
    }
}
----------------------------------------------
3.문자열 곱하기
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        
        for(int i=0; i<k;i++){
            answer = answer+my_string;
        }
        return answer;
    }
}
-----------------------------------------------
4. 홀짝 구분하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%2==0){
            System.out.print(n+" is even");
        }
        else {
            System.out.print(n+ " is odd");
        }
    }
}
----------------------------------------------
5번. 문자열 겹쳐쓰기
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String switch_string = my_string.substring(0,s);
        String answer1 = switch_string + overwrite_string;
        answer = answer1;
        
        //본래 문자에서 answer만큼 제거-> 나머지 문자를 더해주면 정답
        if(answer1.length() < my_string.length()){
            String final_string = my_string.substring(answer.length());
            answer = answer1 + final_string;
        }
        return answer;
    }
}
