from collections import deque

n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
dx = [0, 1]
dy = [1, 0]
v = [[False for _ in range(m)] for _ in range(n)]
isPossible = False

# Please write your code here.
q = deque()
q.append((0, 0))
while q:
    curx, cury = q.popleft()
    if curx == n-1 and cury == m-1:
        isPossible = True
    for i in range(2):
        nx = curx + dx[i]
        ny = cury + dy[i]
        if 0<=nx<n and 0<=ny<m :
            if not v[nx][ny] and grid[nx][ny] == 1:
                v[nx][ny] = True
                q.append((nx, ny))

if isPossible:
    print(1)
else :
    print(0)