<!-- 2024.03.01 과제(하영)

문제: 2초 간격으로 콘솔에 숫자 출력

/* 1부터 시작하여 2초 간격으로 숫자를 1씩 증가시키며 
콘솔에 출력하는 JavaScript 코드를 작성하세요. 숫자가 10 이상이 되면 
출력을 멈추도록 만들어보세요. */ -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Interval Challenge</title>
    <script>
     
        /* clearinterval 사용 */
        // 'number'이라는 변수를 1로 초기화
        let number=1;

        // 'printNumber'라는 함수 정의
        // 'number'가 10에 도달하면 'intervalId'를 사용하여 간격을 지움

         function printNumber() {
           console.log(number);
           number++;
            if(number>=10){
                clearInterval(intervalid);
            }
         }

        // 2000밀리초(2초) 간격으로 'printNumber' 함수를 호출하는 간격 설정
        let intervalid = setInterval(printNumber,2000);
       
    </script>
</head>
<body>
    <!-- 이 예제에서는 본문이 비어 있음 -->
</body>
</html>
-------------------------
setInterval이 이미 일정한 간격으로 함수를 호출하기 때문에, 따로 for문을 사용할 필요는 없다.
