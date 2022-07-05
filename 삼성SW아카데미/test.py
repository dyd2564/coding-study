direction = ((0,1),(1,0),(0,-1),(-1,0))#동남서북

n = int(input()) #3->5, 4->7, 5->9
loop = 2*n-1
mtrx = [[0 for _ in range(n)] for _ in range(n)]
row, col = 0,0
val = 1
mtrx[row][col] = 1
for i in range(loop):
  d = i%4
  while True:
    nextRow, nextCol = row+direction[d][0], col+direction[d][1]
    if 0<=nextRow<n and 0<=nextCol<n:
      if mtrx[row][col]!=0:
        break
      else:
        val+=1
        row,col = nextRow, nextCol
        mtrx[row][col]=val
    else:
      break

for i in mtrx:
  print(i)