T = int(input())

for tc in range(1, T+1):
    N = int(input())
    if N / 2 == 0:
        break
    value = [list(map(int, input())) for _ in range(N)]
    mid = N//2
    start, end = N //2, N // 2
    ans = 0
    for i in range(N):
        for j in range(start, end+1):
            ans = ans + ans[i][j]
        if i < N//2:
            s = s - 1
            e = e + 1
        else:
            s = s + 1
            e = e - 1
    print("#{} {}".format(tc, ans))