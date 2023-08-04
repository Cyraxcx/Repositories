def matrix():
    transpose = lambda x: list(zip(*x))
    matrix = [[1,2,3], [5,6,7,]]
    return transpose(matrix)



def matrix_1():
    mat = [[1,2,3], [4,5,6]]
    res =[[0,0],[0,0],[0,0]]

    for i in range(len(mat)):
        for j in range(len(mat[0])):
            res[j][i] = mat[i][j]
    return res

print(matrix())
print(matrix_1())