# 성공
N = int(input())

for _ in range(N):
    score = list(map(int, input().split()))
    score.sort()
    mid = N//2
    
    print(score[mid])