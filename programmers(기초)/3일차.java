1. 문자열섞기
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        
        for(int i=0;i<str1.length();i++){
            answer += arr1[i] + arr2[i];
        }
      
        return answer.toString();
    }
}
2.리스트 문자열로 변환
class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
         for(int i=0; i<arr.length; i++) {
            answer = answer+arr[i];
        }
        return answer;
    }
}

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
4. 더 크게 합치기
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        int case1 = Integer.parseInt(a1+b1);
        int case2= Integer.parseInt(b1+a1);
        
        
        if(case1 >= case2){
            answer = case1;
        }else if(case1 < case2){
            answer = case2;
        }
        return answer;
    }
}
5. 두 수의 연산값 비교
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int aLong = Integer.parseInt(""+a+b);
        int result = 2*a*b;
        
        answer = (aLong > result)? aLong : result ;
        return answer;
        
    }
}
