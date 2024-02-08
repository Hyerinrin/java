1. n의 배수
class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        
        answer = (num%n==0)? 1 : 0;
        return answer;
    }
}
  
2.  공배수
  class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        answer = (number%n==0 && number%m==0)? 1 : 0;
        return answer;
    }
}
    
3. 홀짝에 따라 다른 값 반환하기
    class Solution {
    public int solution(int n) {
        int answer = 0;
        int pl=0;
        if(n%2==0){         //짝수
            for(int i=0;i<=n;i++){
                if(i%2==0){
                    double pow = Math.pow(i,2);
                    System.out.println(pow);
                    answer = answer + (int)pow;
                }
            }
            
        }else {             //홀수
            for(int j=0;j<=n;j++){
                if(j%2!=0){
                    pl = j + pl;
                    answer = pl;
                }
            }
        }
        return answer;
    }
}
4. 조건 문자열
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
         boolean answer = false;
        if (ineq.equals(">") && eq.equals("="))
            answer = n >= m;
        else if (ineq.equals("<") && eq.equals("="))
            answer = n <= m;
        else if (ineq.equals(">") && eq.equals("!"))
            answer = n > m;
        else 
            answer = n < m;
        return answer ? 1 : 0;
    }
}

  
5. 플래그에 따라 다른 값 반환하기
  class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        
        answer = (flag==true)? a+b : a-b;
        return answer;
    }
}
