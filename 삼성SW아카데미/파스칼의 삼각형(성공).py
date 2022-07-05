T = int(input())

for t in range(1, T+1):
    n = int(input())
    a = [[0]*n for i in range(n)]
    for j in range(n):
        for k in range(j+1):
            if j == 0 or j == 1:
                a[j][k] = 1
            else:
                a[j][k] = a[j-1][k] + a[j-1][k-1]
    print('#{}'.format(t))

    for list in a:
        result = [x for x in list if x]
        print(*result)