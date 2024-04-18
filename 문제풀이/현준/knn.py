# 문제. 500명의 키와 몸무게, 비만도 라벨을 이용해 비만을 판단하는 모델을 만들어보자
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.neighbors import KNeighborsClassifier
from sklearn.model_selection import train_test_split
from sklearn import metrics
import numpy as np

# 1. bmi데이터 가져오기(카톡방의 csv파일)
bmi = pd.read_csv('./bmi_500.csv', encoding='utf-8')
display(bmi)

# 2. 데이터 시각화하기(산점도로 출력)
plt.figure(figsize=(10, 6))
mglearn.discrete_scatter(bmi['Weight'], bmi['Height'], bmi['Label'], markers='o')
plt.xlabel('Weight')
plt.ylabel('Height')
plt.legend(['Normal', 'Overweight', 'Obesity', 'Extreme Obesity','Overweight','Weak','Extremely Weak'], loc='best')
plt.show()

# 3. 모델링 학습 및 평가 후 예측하기(이웃의 수는 10으로 설정)
X = bmi[['Height', 'Weight']]
y = bmi['Label']

# 훈련용과 검증용 데이터로 나누기
X_train, X_test, y_train, y_test = train_test_split(X, y, random_state=42)
knn = KNeighborsClassifier(n_neighbors=10).fit(X_train,y_train)

# 평가
print(f'훈련용 데이터셋의 점수 = {knn.score(X_train,y_train)}')
print(f'검증용 데이터셋의 점수 = {knn.score(X_test,y_test)}')

# 예측
print("검증용 데이터 예측 : ",knn.predict(X_test))

# 4. 원하는 값 입력해보기(키, 몸무게)

h = int(input('키를 입력하세요'))
w = int(input('몸무게를 입력하세요'))

# 데이터프레임 생성
df = pd.DataFrame({'Height': [h], 'Weight': [w]})

pred = knn.predict(df)
print("입력받은 데이터는 = ", pred[0], '체중')


