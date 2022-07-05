# 정렬 완료 시 테스트케이스와 카운트 수 출력
# round 1 -> 홀수항과 그 다음항 비교
# round 2 -> 짝수항과 그 다음항 비교
# round 1,2 정렬해도 안될시 한번 더 돈다.
# round 1,2 돌 때마다 cnt 1 증가
# 정렬 완료 시 cnt 출력

T = int(input())

for tc in range(1, T+1):
    a = list(input().split())
    b = sorted(a)
    cnt = 0
    while a != b:
        for index in range(0, len(a)-1, 2):
            if a[index] > a[index+1]:
                a[index], a[index+1] = a[index+1], a[index]
        for index in range(1, len(a)-1, 2):
            if a[index] > a[index+1]:
                a[index], a[index+1] = a[index+1], a[index]
        cnt += 1

    print('#' ' ', tc, cnt)