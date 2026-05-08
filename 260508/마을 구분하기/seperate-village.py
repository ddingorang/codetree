from collections import deque
n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
v = [[0 for _ in range(n)] for _ in range(n)]
q = deque()
r = []

for i in range(n):
    for j in range(n):
        if grid[i][j] == 1 and not v[i][j]:
            q.append((i, j))
            v[i][j] = True
            temp = 0
            while q:
                curx, cury = q.popleft()
                temp += 1
                for k in range(4):
                    nx = curx + dx[k]
                    ny = cury + dy[k]
                    if 0<=nx<n and 0<=ny<n :
                        if not v[nx][ny] and grid[nx][ny] == 1:
                            v[nx][ny] = True
                            q.append((nx, ny))
            r.append(temp)

print(len(r))
r.sort()
for e in r:
    print(e)