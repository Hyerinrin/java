# < 1 >
e = [1, 'a', [5,6,7,[7,8,9,[10,11,12]]], print, (), {}, {1}] 

1) print(e[2][3][3][1]) = 10

2) print(type(e[0]), type(e[1]), type(e[2]), type(e[3]), type(e[4]), type(e[5]), type(e[6])) 
= <class ‘int’> <class ‘str'> <class 'list'> <class 'builtin_function_or_method'> <class 'tuple'> <class 'dictionary'> <class 'set'> <- 빈칸채우기

3) print(e[0] + e[1]) = error인 이유?
    답 : e[0]은 정수이고 e[1]은 문자열이기에 정수와 문자열은 합연산을 할 수 없어서 에러가 발생합니다.



< 2 >
a = [1,2,3,4,5,]

1) print(a[0:], a[:5]) = 1,2,3,4,5 , 1,2,3,4,5

2) print(type('12345'[0:2]), '12345'[0:2]) = <class 'str'>, 12



< 3 >
다차원슬라이싱 - 중첩된 list자료형의 슬라이싱
a = [1,2,3,['a','b','c'],4,5]

1) print(a[2:5])
답 : 3,['a','b','c'],4

2) print(a[3:4]) 
답 : 3

3) print(a[3:4][2]) = 무슨error?
답 : list의 인덱스 범위를 벗어 났다는 에러


< 4 >
a = [1,2,3]
a[1:2] = ['x', 'y', 'z']

print(a) = [1, 'x', 'y', 'z', 3]



< 5 >
sample = 'show how to index into sequences'.split()

1) print(sample[::2]) = 'show', 'to', 'into'

2) print(sample[::-2]) = 'sequences', 'index', 'show'



< 6 >

c = ['x','z','y', 1,4,3,2]

c.sort() = Error?
답 : c라는 리스트 안에 정수형이 아난 문자열이 포함되어 있어야 정렬할 수 없기에 에러가 발생함.



< 7 >
a = [1,2,'a',3,'a','b']

1) print(a.index('a', 3)) = 4

2) print(a.index('a', 3, 1000)) = 4



< 8 >
a = [1,2,3,4]

print(a.pop(), a) = 4, [1,2,3]



< 9 >
a = [1,2,3]

1) a.append([4,5])
print(a) = [1, 2, 3, [4, 5]]

2) a.extend([4,5])
print(a) = [1, 2, 3, [4, 5], 4, 5]

3) a.extend('hello')
print(a) = [1, 2, 3, [4, 5], 4, 5, 'h', 'e', 'l', 'l', 'o']

4) a.extend({'name':'홍길동', 'age':1000}) # dict 자료형, key만 확장
print(a) = [1, 2, 3, [4, 5], 4, 5, 'h', 'e', 'l', 'l', 'o', 'name', 'age']
