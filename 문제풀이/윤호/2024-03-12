<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <span id = 'text' style="background-color: #ffff00;">자동회전하는 텍스트입니다.</span>

    <script>
       let s = document.getElementById('text'); // 가공할 문자열 가져오기
       let time = setInterval('rotate()', 300) //0.3초 마다 rotate라는 함수를 실행

       //text 클릭하면 멈춤
       s.addEventListener('click', () => {
        clearInterval(time)
       })


       function rotate() {
            let str = s.innerHTML;  //문자열을 가공하기 위해 text를 가져옴
            let first = str.substr(0,1) //뒤로 보낼 첫 번째 글자만 자르기
            let etc = str.substr(1, str.length -1) //나머지 글자

            str = etc + first // 회전하는 효과를 주기 위해 첫 번째 글자를 나머지 글자 뒤로 옮김
            s.innerHTML = str; // 편집한 문자열을 실제로 반영

       }
    </script>
</body>
</html>
