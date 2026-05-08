n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

maxx = -1
for i in range(n-1):
    for j in range(m-1):
        tl = [grid[i][j], grid[i+1][j], grid[i][j+1], grid[i+1][j+1]]
        tempsum = sum(tl)
        minn = min(tl)
        if(tempsum - minn > maxx) : maxx = tempsum - minn

for i in range(n):
    for j in range(m-2):
        tempsum = grid[i][j] + grid[i][j+1] + grid[i][j+2]
        if(tempsum > maxx) : maxx = tempsum

for i in range(m):
    for j in range(n-2):
        tempsum = grid[j][i] + grid[j+1][i] + grid[j+2][i]
        if(tempsum > maxx) : maxx = tempsum

print(maxx)
