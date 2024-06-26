# 아래에 링크에 접속하셔서 csv파일을 다운로드한 후, 문제를 풀어주세요:)
# 해당 데이터 다운 받기 : https://www.data.go.kr/data/15126554/fileData.do

import pandas as pd

# 데이터 불러오기(수업시간에 진행하는 것처럼 data파일 안의 excel파일에 다운로드를 하여 사용해주세요.)
datafile = pd.read_csv('./data/excel/한국언론진흥재단_뉴스빅데이터_연도 및 과목별 언론의 수능난이도 평가_20221231.csv', encoding='utf-8', delimiter=',')


# 데이터 확인
display(datafile)
print(type(datafile))

# 국어(korean)/수학(math)/ 영어(english) 과목 별로 따로 데이터를 저장하기
korean = datafile[datafile['과목']=='국어']

display(korean)

math =  datafile[datafile['과목']=='수학']
display(math)

english = datafile[datafile['과목']=='영어']
display(english)

# '보도 기사 수'가 많을 수록 난이도가 어렵다고 가정할때,  
# 1) 국어가 가장 어려웠던 연도와 가장 쉬웠던 연도의 정보를 구하라
# (해당 연도의 모든 정보 : 연도, 과목, 보도 기사 수, 언론의 추정 난이도 평균, 언론의 추정 난이도 표준편차에 대한 정보들)
print('국어')
# 1-1) 국어가 가장 어려웠던 연도
d_year = korean[korean['보도 기사 수']==korean['보도 기사 수'].max()]
display(d_year)

# 1-2) 국어가 가장 쉬웠던 연도의 정보
e_year = korean[korean['보도 기사 수']==korean['보도 기사 수'].min()]
display(e_year)

# 2) 수학이 가장 어려웠던 연도와 가장 쉬웠던 연도의 정보를 구하라
# (해당 연도의 모든 정보 : 연도, 과목, 보도 기사 수, 언론의 추정 난이도 평균, 언론의 추정 난이도 표준편차에 대한 정보들)
print('수학')
# 2-1) 수학이 가장 어려웠던 연도
d_year = math[math['보도 기사 수']==math['보도 기사 수'].max()]
display(d_year)

# 2-2) 수학이 가장 쉬웠던 연도의 정보
d_year = math[math['보도 기사 수']==math['보도 기사 수'].min()]
display(d_year)

# 3) 영어가 가장 어려웠던 연도와 가장 쉬웠던 연도의 정보를 구하라
# (해당 연도의 모든 정보 : 연도, 과목, 보도 기사 수, 언론의 추정 난이도 평균, 언론의 추정 난이도 표준편차에 대한 정보들)
print('영어')
# 3-1) 영어가 가장 어려웠던 연도
d_year = english[english['보도 기사 수']==english['보도 기사 수'].max()]
display(d_year)

# 3-2) 영어가 가장 쉬웠던 연도의 정보
d_year = english[english['보도 기사 수']==english['보도 기사 수'].min()]
display(d_year)
