text = 'sparta'
result1 = text[:3]
print(result1)

phone = '02-123-1234'
#result2 = phone[:2]
result2 = phone.split('-')[0]
print(result2)

a_list = [1,2,3,4,5]
a_list.sort(reverse=True)
print(a_list)

# True / False
result3 = (99 in a_list)
print(result3)

a_dict = {'name' : 'bob', 'age' : 27, 'friend' : ['young', 'chul']}
a_dict['height'] = 180
print('height' in a_dict)

people = [
    {'name':'bob', 'age':27},
    {'name':'john', 'age':30}
]
print(people[1]['age'])

people = [
    {'name': 'bob', 'age': 20, 'score':{'math':90,'science':70}},
    {'name': 'carry', 'age': 38, 'score':{'math':40,'science':72}},
    {'name': 'smith', 'age': 28, 'score':{'math':80,'science':90}},
    {'name': 'john', 'age': 34, 'score':{'math':75,'science':100}}
]
print(people[2]['score']['science'])

people = [
    {'name': 'bob', 'age': 20},
    {'name': 'carry', 'age': 38},
    {'name': 'john', 'age': 7},
    {'name': 'smith', 'age': 17},
    {'name': 'ben', 'age': 27},
    {'name': 'bobby', 'age': 57},
    {'name': 'red', 'age': 32},
    {'name': 'queen', 'age': 25}
]
for person in people :
    name = person['name']
    age = person['age']
    if age > 20:
        print(name, age)

for i, person in enumerate(people):
    name = person['name']
    age = person['age']
    print(i, name, age)
    if i > 2:
        break

# 짝수만 출력
num_list = [1, 2, 3, 6, 3, 2, 4, 5, 6, 2, 4]
for num in num_list:
    if num%2 == 0:
        print(num)

# 짝수가 몇 개인지
count = 0
for num in num_list:
    if num % 2 == 0:
        count += 1
    print(count)

# 모든 요소 합
total = 0
for num in num_list:
    total += num
print(total)

# 자연수 중 가장 큰 수
result = 0
for num in num_list:
    if num > result:
        result = num
print(result)

# 성별 구분
def check_gender(pin):
    gender = int(pin.split('-')[1][:1])
    if(gender == 1 or gender == 3):
        print('Male')
    elif(gender == 2 or gender == 4):
        print('Female')
    else:
        print('Not Human')
check_gender('150101-1012345')
check_gender('150101-2012345')
check_gender('150101-4012345')
check_gender('150101-6012345')

# tuple, set
student_a = ['물리2','국어','수학1','음악','화학1','화학2','체육']
student_b = ['물리1','수학1','미술','화학2','체육']

a_set = set(student_a)
b_set = set(student_b)
print(a_set - b_set)

# f-string
scores = [
    {'name':'영수','score':70},
    {'name':'영희','score':65},
    {'name':'기찬','score':75},
    {'name':'희수','score':23},
    {'name':'서경','score':99},
    {'name':'미주','score':100},
    {'name':'병태','score':32}
]

for s in scores :
    name = s['name']
    score = str(s['score'])
    print(f'{name}의 점수는 {score}점 입니다')

# 예외 처리
people = [
    {'name': 'bob', 'age': 20},
    {'name': 'carry', 'age': 38},
    {'name': 'john', 'age': 7},
    {'name': 'smith', 'age': 17},
    {'name': 'ben', 'age': 27},
    {'name': 'bobby'},
    {'name': 'red', 'age': 32},
    {'name': 'queen', 'age': 25}
]

for person in people:
    try:
        if person['age'] > 20:
            print(person['name'])
    except:
        print(person['name'], 'Error')

# 삼항연산자
num = 3

# 전
if num % 2 == 0:
    result = '짝수'
else:
    result = '홀수'

# 후
result = ('짝수' if num % 2 == 0 else '홀수')

print(f'{num}은 {result}입니다')

# 반복문
a_list = [1,3,2,5,1,2]

# 전
b_list = []
for a in a_list:
    b_list.append(a*2)

# 후
b_list = [a*2 for a in a_list]
print(b_list)

