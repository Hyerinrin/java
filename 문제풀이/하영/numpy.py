import numpy as np

# 문제 1.
arr2 = np.array([['a','b','c'],[4,5,6],['e','f','g']])
# 1. arr2에서 9를 꺼내기 : 세 번째 행의 세 번째 요소
print(arr2[2][2])

# 2. arr2에서 모든열의 세번째 요소 [c,6,g] 출력
print(arr2[:,2])

# 3. arr2에서 [[a,b], [4,5]] 출력
print(arr2[:2,:2])
print()

# 4. arr2에서 [[5,6], [f,g]] 출력
print(arr2[1:,1:])
m = np.array([[ 'h',  'i',  'j',  'k',  'l'],
              [ 5,  6,  7,  8,  9],
              [10, 11, 12, 13, 14]])

# 5. m 행렬에서 값 7 을 인덱싱.
print(m[1,2])

# 6. m 행렬에서 배열 [6, 7] 을 슬라이싱.
print(m[1, 1:3])

# 7. m 행렬에서 배열 [7, 12] 을 슬라이싱.
print(m[1:,2])

# 8. m 행렬에서 배열 [[j, k], [8, 9]] 을 슬라이싱.
print(m[0, 2:4], m[1,-2:])

# 문제 2. 
# 1) 1차원 배열인덱싱 (블리언)

a = np.array([1,2,3,4,5,6,7,8,9,10])
idx = np.array([False, True,False, True, False, True, False, True, False, True])
print(a[idx])
# 7과 10만 추출

idx = np.array([False,False,False,False,False,False,True,False,False,True])
print(a[idx])

# 짝수만 추출 
a = np.array([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20])
print(a[a%2==0])

# 홀수만 추출 
a = np.array([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20])
print(a[a%2!=0])

#2) 2차원 배열인덱싱(블리언)
a = np.array([
    [1,2,3,4],
    [5,6,7,8],
    [9,10,11,12]
])
print(a)

#  1,5,9,4,8,12만 추출
idx = np.array([
    [True,False,False,True],
    [True,False,False,True],
    [True,False,False,True]
])
print(a[idx])


#  2,5,7,10만 추출하기

idx = np.array([
    [False,True,False,False],
    [True,False,True,False],
    [False,True,False,False]
])
print(a[idx])

# # 문제3. sort()
import numpy as np
arr = np.array([[10,29,84,1,45,16],['f','a','m','g','k','e']])

# # a. 정렬
print('numpy 배열의 정렬 = ', np.sort(arr))

# # b. 첫번째 행만 정렬
print('numpy 배열의 첫번째 행만 정렬 = ', np.sort(arr[0]))


# # c. 열과행 모두 정렬(axis 사용)
print('numpy 배열의 정렬(axis=0) = ', np.sort(arr, axis=0))
print('numpy 배열의 정렬(axis=1) = ', np.sort(arr, axis=1))

# # 문제4. unique()
idols = np.array(['은채','사쿠라','채원','혜린','민지','하니','민지','은채'])

# # 1) 1차원배열 중복제거
print('1차원배열 중복제거 = ', np.unique(idols))

# # 2) 2차원중복제거
numbers = [[11,12],[11,12],[43,38]]
print('2차원배열 중복제거(전체)= ', np.unique(numbers))
print('2차원배열 중복제거(열:axis=0) = ', np.unique(numbers, axis=0))
print('2차원배열 중복제거(행:axis=1) = ', np.unique(numbers, axis=1))
