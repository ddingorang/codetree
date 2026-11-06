from collections import deque

n, k = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
r, c = map(int, input().split())

q = deque()

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

sr = r - 1
sc = c - 1

for _ in range(k):
    visited = [[False] * n for _ in range(n)]

    q.append((sr, sc))
    visited[sr][sc] = True

    std = grid[sr][sc]

    maxvalue = -1
    maxr = -1
    maxc = -1

    while q:
        curr, curc = q.popleft()

        for d in range(4):
            nr = curr + dx[d]
            nc = curc + dy[d]

            if 0 <= nr < n and 0 <= nc < n:
                if grid[nr][nc] < std and not visited[nr][nc]:
                    visited[nr][nc] = True
                    q.append((nr, nc))

                    if grid[nr][nc] > maxvalue:
                        maxvalue = grid[nr][nc]
                        maxr = nr
                        maxc = nc

                    elif grid[nr][nc] == maxvalue:
                        if nr < maxr or (nr == maxr and nc < maxc):
                            maxr = nr
                            maxc = nc

    if maxr == -1:
        break

    sr = maxr
    sc = maxc

print(sr + 1, sc + 1)