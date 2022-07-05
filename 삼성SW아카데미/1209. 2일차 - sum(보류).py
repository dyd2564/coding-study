T = 10

for _ in range(1, T+1):
    n = int(input())
    a = [list(map(int, input().split())) for _ in range(3)]
    Max_Sum = 0
    for i in range(3):
        sum1, sum2, sum3 = 0, 0, 0
        for j in range(3):
            sum1 = sum1 + a[j][i]
            sum2 = sum2 + a[i][j]
            sum3 = sum3 + a[j][j]
        Max_Sum = max(sum1, sum2, sum3)    
    print("#{} {}".format(n, Max_Sum))