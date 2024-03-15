1. 마지막 두 원소
import java.util.*;
class Solution {
    public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<num_list.length;i++){
            answer.add(num_list[i]);
        }
        
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
            answer.add(num_list[num_list.length -1] - num_list[num_list.length -2]);
        } else {
            answer.add(num_list[num_list.length -1]*2);
        }
        System.out.println(answer.get(0));
        return answer;
    }
}
2. 수 조작하기1
class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(int i=0;i<control.length();i++){
            if(control.charAt(i)=='w'){
                n +=1;
            }else if(control.charAt(i)=='s'){
                n-=1;
            }else if(control.charAt(i)=='d'){
                n+=10;
            }else if(control.charAt(i)=='a'){
                n-=10;
            }
        }
        answer =n;
        return answer;
    }
}
3. 수 조작하기2
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i=0;i<numLog.length-1;i++){ //0~11가지 반복 -> 인덱스12가 에러 발생, result가 11자니 최대 인덱스                                                는 11
          if(numLog[i+1] == numLog[i]+1){
              answer += "w";
          }else if(numLog[i+1]== numLog[i]-1){
              answer += "s";
          }else if(numLog[i+1]==numLog[i]+10){
              answer += "d";
          }else if(numLog[i+1]==numLog[i]-10){
              answer += "a";
          }
        }
        //System.out.println(answer.length());
        return answer;
    }
}
4. 수열과 구간 쿼리 3
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int E=0;
        for(int i=0;i<queries.length;i++){
            E = arr[queries[i][0]];
            System.out.println(arr[queries[i][0]]);
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = E;
            
            
        }
        answer = arr;
        return answer;
    }
}
5. 수열과 구간 쿼리 2
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, Integer.MAX_VALUE);
        
        for(int i=0; i<queries.length;i++){ //전체 for문 범위
            for(int j=queries[i][0]; j<=queries[i][1];j++){ //j for문 -> arr배열의 값을 하나씩 조건에 비교하기 위해 사용
                
                if(arr[j] > queries[i][2]){ //i>k 조건 
                    if(answer[i] > arr[j] ){ //최솟값 조건
                        answer[i] = arr[j];
                    }
                }
              }
             if(answer[i] == Integer.MAX_VALUE) { //답이 존재하지 않는 경우
                    answer[i] = -1;
            }
        }
        return answer;
    }
}
