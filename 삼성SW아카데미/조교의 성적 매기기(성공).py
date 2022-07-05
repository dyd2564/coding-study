T = int(input())
grade = ['A+', 'A0', 'A-', 'B+', 'B0', 'B-', 'C+', 'C0', 'C-', 'D0']

for tc in range(1, T+1):
    N, K = map(int, input().split())
    list = []
    for j in range(N):
        mid, final, hw = map(int, input().split())
        total = (mid*0.35) + (final*0.45) + (hw*0.2)
        list.append(total)

    K_score = list[K-1]

    list.sort(reverse = True)
    div = N // 10
    final_k_score = list.index(K_score) // div

    print('#{} {}'.format(tc, grade[final_k_score]))