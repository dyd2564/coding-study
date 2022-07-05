T = int(input())

for tc in range(1, T+1):
    a = []
    for _ in range(9):
        a.append(list(map(int, input().split())))
    answer = 1

    b = [[[] for _ in range(3)] for _ in range(3)]
    for i in range(9):
        row = []
        col = []
        for j in range(9):

            if (a[i][j] in row) or (a[j][i] in col) or (a[i][j] in b[i//3][j//3]):
                answer = 0
                break

            row.append(a[i][j])
            col.append(a[j][i])
            b[i//3][j//3].append(a[i][j])

        if not answer:
            break
    print('#{} {}'.format(tc, answer))