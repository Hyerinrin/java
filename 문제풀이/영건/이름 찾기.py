# 영건님 문제\

# 아래 names 문자열을 이용해서 1 ~ 4 번 문제 풀면됩니다!

names = "김영건,손흥민,박지성,나윤호,홍명보,심주찬,나윤호,유현준,김영건,표민,김하영,김영건,정소현,윤혜린,이환희,이영표,유현준,손흥민,정소현".split(",")

#1 김씨와 이씨 성을 가진 사람은 각각 몇명인지 출력
#>> list - lambda식 이용

# 김씨 성을 가진 사람의 수 출력
print("김씨 성을 가진 사람: ", len(list(filter(lambda x:x.startswith("김"),names))))
    
# 이씨 성을 가진 사람의 수 출력
print("이씨 성을 가진 사람: ", len(list(filter(lambda x:x.startswith("이"),names))))


#2 김영건 이름이 몇개 들어있는지 출력
#>> lambda식 이용
print("김영건 이름의 개수 : ", len(list(filter(lambda x:x.count("김영건"),names))))

#3 중복을 제거 후 출력
print("중복 제거", set(names))

#4 중복 제거 한 이름을 오름차순으로 출력
print("정렬 : ", sorted(set(names)))

---------------------------------------------------------
[출력]
김씨 성을 가진 사람:  4
이씨 성을 가진 사람:  2
김영건 이름의 개수 :  3
중복 제거 {'유현준', '김영건', '표민', '김하영', '윤혜린', '심주찬', '이환희', '정소현', '이영표', '홍명보', '나윤호', '손흥민', '박지성'}
정렬 :  ['김영건', '김하영', '나윤호', '박지성', '손흥민', '심주찬', '유현준', '윤혜린', '이영표', '이환희', '정소현', '표민', '홍명보']
