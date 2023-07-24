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