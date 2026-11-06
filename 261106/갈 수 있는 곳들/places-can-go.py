from collections import deque

n, k = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
points = [tuple(map(int, input().split())) for _ in range(k)]

visited = [[False for _ in range(n)] for _ in range(n)]
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
q = deque()
cnt = 0
# Please write your code here.
for r, c in points:
    if not visited[r-1][c-1] : 
        q.append((r-1, c-1))
        visited[r-1][c-1] = True
        while q:
            curr, curc = q.popleft()
            cnt += 1
            for d in range(4):
                nr = curr + dx[d]
                nc = curc + dy[d]
                if 0 <= nr < n and 0 <= nc < n:
                    if grid[nr][nc] == 0 and not visited[nr][nc]:
                        visited[nr][nc] = True
                        q.append((nr, nc))


print(cnt)