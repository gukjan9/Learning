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