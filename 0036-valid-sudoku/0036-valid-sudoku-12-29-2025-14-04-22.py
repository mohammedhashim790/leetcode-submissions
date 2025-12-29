class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = defaultdict(set)
        cols = defaultdict(set)
        sq = defaultdict(set)
        for r, row in enumerate(board):
            print("\t".join(row))
            for c, col in enumerate(row):
                if col == ".":
                    continue

                key = f"{r//3},{c//3}"

                if col in rows[r] or col in cols[c] or col in sq[key]:
                    return False

                rows[r].add(col)
                cols[c].add(col)
                sq[key].add(col)
        return True
