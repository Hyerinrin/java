#주어진 문자열에서 l이 몇 번 등장하는지 세시오(count)
text = "hello world"
char = "l"
print(text.count(char))

#문자열에서 공백을 모두 제거한 후에 결과를 출력하세요.(replace)
text = "hello world"
print(text.replace(' ',''))

#해당 문자열을 거꾸로 출력하세요.(reverse)
text =  "python"
print(text[::-1])

#주어진 리스트에서 중복된 항목을 제거하고, 결과를 출력하세요.(set)
list = [1, 2, 2, 3, 4, 4, 5]
print(set(list))

#주어진 리스트를 역순으로 정렬한 결과를 출력하세요.(reverse)
list = [3, 1, 4, 1, 5, 9, 2] 
list.reverse()
print(list)

#주어진 리스트에 있는 모든 숫자의 합을 계산하여 출력하세요.(sum)
list = [1, 2, 3, 4, 5]
print(sum(list))

#해당 리스트의 최대값과 최소값을 출력하세요.(min,max)
list = [5, 2, 7, 1, 9] 

print(max(list))
print(min(list))

#해당 리스트에 add리스트를 더하시오(extend)
list = [1, 2, 3, 4, 5]
add = [9, 8, 7]

list.extend(add)
print(list)

# 숫자 4를 리스트 안에 있는 숫자1 뒤에 삽입하시오(insert)
list = [1, 2, 3, 5]
list.insert(1,4)
print(list)
