def findJudge(n, trust):
    trustedBy = {}
    trusted = {}

    judge = -1
    for i in range(1, n+1):
        trustedBy[i] = 0
        trusted[i] = 0

    for i in range(len(trust)):
        trustedBy[trust[i][1]] += 1
        trusted[trust[i][0]] += 1

    for i in range(1, n+1):
        if trustedBy[i] == n-1 and trusted[i] == 0:
            judge = i
            break

    return judge
