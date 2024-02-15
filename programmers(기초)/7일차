1. 수열과 구간 쿼리4
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(j%queries[i][2]==0){ //배수 판별
                   arr[j] += 1;
                }
            }
        }
        
        return arr;
    }
}
2. 배열 만들기2
import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            if(String.valueOf(i).matches("[05]+")){ //정규식 : []안의 숫자 0과 5를 한 번이상 포함하는가
                list.add(i);
            }
        }
        if(list.isEmpty()){
            return new int[] {-1};
        }
        int[] answer = list.stream().mapToInt(in->in).toArray();
        return answer;
    }
}

3. 카운트 업
import java.util.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int i=start_num-1; i<end_num;i++){
            list.add(i+1);
        }
        answer = list.stream().mapToInt(in->in).toArray();
        return answer;
    }
}

4. 콜라츠 수열 -->while 반복문에서 반복 조건문을 잘 생각하자
import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(n); //시작값
        
        while(n !=1){
            
            if(n%2==0){ //짝수
                n /=2;
            }else {
                n= 3*n+1;
            }
            list.add(n);
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}

5. 배열 만들기4 ---> for문의 증감식은 i를 조건식에서 증감시켜주시에 굳이 사용하지 않아도 된다.(여기서 런타임 에러가 났다.) / if문을 남발하지 말 것!!!
  import java.util.*;
class Solution {
    public List solution(int[] arr) {
        //int[] stk = {};
        List<Integer> stk = new ArrayList<>();
        
        for(int i=0; i<arr.length;){
            if(stk.size()==0){
                stk.add(arr[i]); i++;
            }else if(stk.size()!=0 && stk.get(stk.size()-1) < arr[i]){
                stk.add(arr[i]); i++;
            }else {
                stk.remove(stk.size()-1);
            }
        }
        return stk;
    }
}
