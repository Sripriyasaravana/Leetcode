class Solution:
    def gcdValues(self, nums: List[int], queries: List[int]) -> List[int]:
        a = max(nums)
        b = [0] * (a + 1)
        for i in nums:
            b[i] += 1
        c  = [0] * (a + 1)
        for i in range(1, a + 1):
            for j in range(i, a + 1, i):
                c[i] += b[j]
        d = [0] * (a + 1)
        for i in range(a, 0, -1):
            k = c[i]
            d[i] = k * (k - 1) // 2
            for j in range(2 * i, a + 1, i):
                d[i] -= d[j]
        e = []
        f = []
        g = 0
        for i in range(1, a + 1):
            if d[i]:
                g += d[i]
                e.append(g)
                f.append(i)
        h = []
        for i in queries:
            j = bisect_left(e, i + 1)
            h.append(f[j])
        return h