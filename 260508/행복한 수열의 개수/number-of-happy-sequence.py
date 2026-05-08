n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

def count_sequences(lines, m):
    count = 0
    if m == 1: return len(lines) # m이 1이면 모든 줄이 조건을 만족
    
    for line in lines:
        streak = 1
        for i in range(1, len(line)):
            if line[i] == line[i-1]:
                streak += 1
            else:
                streak = 1
            
            if streak >= m:
                count += 1
                break
    return count

# 가로줄 리스트
rows = grid
# 세로줄 리스트 (zip을 이용한 전치)
cols = list(zip(*grid))

answer = count_sequences(rows, m) + count_sequences(cols, m)
print(answer)