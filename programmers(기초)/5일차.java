1. 코드 처리하기
class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') mode = 1 - mode;
            else if (i % 2 == mode) answer += code.charAt(i);
        }
        return "".equals(answer) ? "EMPTY" : answer;
    }
}

2. 등차수열의 특정 항만 더하기
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int sum =0; // true 일때 더할 변수
        int il =0; //일반항
        //등차수열의 일반항 : an = a1 + (n-1)d, 
        //인덱스는 0부터 시작이니까 a2 = 3 + 7()
        for(int i=0; i<included.length;i++){
            il = a + i*d;
            System.out.println(il);
            System.out.println(included[i]);
            if(included[i] == true) {
                sum = sum + il;
                answer = sum;
                //System.out.println(sum);
            }
        }
        return answer;
    }
}
3.주사위 게임2
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a!=b && b!=c){
            answer = a+b+c;
        }else if(a==b || a==c || b==c){
            answer = (a+b+c) *(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)) ;
        }else if((a==b)&&(b==c)&&(c==a)){
            answer = (a+b+c) *(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)) *
                (int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
        }
        
        return answer;
    }
}
4.원소들의 곱과 합
class Solution {
    public int solution(int[] num_list) {
        int answer=0;
        int gop=1;
        int addD = 0;
        
        for(int i=0;i<num_list.length;i++){
            gop *= num_list[i];
            addD +=num_list[i]; 
        }
        addD = addD * addD;
        answer = (gop > addD)? 0 : 1;
        return answer;
    }
}
5.이어 붙인 수

class Solution {
    public int solution(int[] num_list) {
        String hol="";
        String jak="";
        
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                jak += Integer.toString(num_list[i]);
            }else {
                hol += Integer.toString(num_list[i]);
            }
        }
        ;
        return Integer.parseInt(jak) + Integer.parseInt(hol);
    }
}
