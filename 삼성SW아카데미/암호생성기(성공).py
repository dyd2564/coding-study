T = int(input())

for tc in range(1, T+1):
    a = list(map(int, input().split()))
    while a[-1] != 0:
        for i in range(1, 6):
            a.append(a.pop(0) - i)
            if a[-1] <= 0:
                a[-1] = 0
                break
    print('#{0}'.format(T), *a)