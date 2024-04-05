# https://en.wikipedia.org/wiki/HTML 위의 사이트에서 각 종 태그를 불러오는 예제입니다~

import urllib.request as req
from bs4 import BeautifulSoup as bs

html = req.urlopen('https://en.wikipedia.org/wiki/HTML')
soup = bs(html, 'html.parser')

# 1. span 태그에서 'vector-dropdown-label-text' 클래스인 text 출력 - finsAll() or find_all() 사용
#     출력문
#     Main menu
#     Personal tools
#     Toggle the table of contents
#     133 languages
#     English
#     Tools

# soup.find_all()을 사용하여 특정 클래스가 'vector-dropdown-label-text'인 모든 <span> 요소를 찾음
elements = soup.find_all('span', {'class': 'vector-dropdown-label-text'})
text = []

# 찾은 요소들에 대해 반복문을 사용하여 각 요소의 텍스트를 출력.
for element in elements:
    print(element.getText())
    text.append(element.getText()) # 뒤에 문제들을 위해 리스트를 하나 생성

# 2. 위의 출력문에서 'b'를 포함 한 text 출력 - if문 or for문 사용
#       출력문 - Toggle the table of contents

for t in text:
  if 'b' in t:
    print(t)

# 3. 위의 출력문에서 'a'를 포함하지 않는 text 출력 - if문 or for문 사용
#       출력문 - English
#               Tools
for t in text:
  if 'a' not in t:
    print(t)

# 4. html의 모든 클래스명에서 'vector' 가 포함된 모든 클래스명 출력
vectors = []
for tag in soup.find_all(class_=True):
    classes = tag.get('class')
    # print(type(classes))
    for cl in classes:
      if 'vector' in cl:
        print(cl)
        # for문, if문 작성
        vectors.append(cl)

# 5. 위 출력문에서 15글자 이하인 text만 출력 - if문 작성
for vec in vectors:
  if len(vec) <=15:
    print(vec, len(vec))






