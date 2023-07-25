
list_a = [1, 2, 3, 1, 2, 4, 5]
list_res = filter(lambda x: list_a.count(x) > 1, list_a)

list_res = list(set(list_res))

print(list_res)