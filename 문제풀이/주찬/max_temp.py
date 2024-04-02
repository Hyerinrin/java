# weather_data는 날짜별 기온을 기록한 csv파일 입니다. 최고기온과, 해당 날짜를 출력하도록 코드를 짜주세요
# 출력예시 : 가장 높았던 기온은 2022-01-05 의 30°C 입니다
import pandas as pd

# 날씨 데이터 
data = {
    'date': ['2022-01-01', '2022-01-02', '2022-01-03', '2022-01-04', '2022-01-05'],
    'temp_data': [25, 28, 29, 27, 30]
}

# DataFrame 생성
df = pd.DataFrame(data)

# CSV 파일 저장
df.to_csv('weather_data.csv', index=False)
print("CSV 파일 생성완료.")

# 여기서부터 풀어주세요

# CSV 파일 읽기
df = pd.read_csv('./weather_data.csv', delimiter=',',encoding='utf-8')
df
# 'max_temp' 열에서 가장 높은 온도를 기록한 행 찾기
max = df['temp_data'].max()
d = df.loc[df['temp_data'] == max, 'date'].values[0]

# 결과 출력
print(f"가장 높았던 기온은 {d} 의 {max}°C 입니다")
