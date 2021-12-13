def maxPower(s):
    if len(s) == 1:
        return 1
    max_power = 0
    previous = ""
    c = 0
    for i in s:
        if i == previous:
            c += 1
        else:
            if c > max_power:
                max_power = c
            c = 1
        previous = i

    if c > max_power:
        max_power = c
    return max_power
