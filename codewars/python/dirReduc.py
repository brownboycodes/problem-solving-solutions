def dirReduc(arr):
    if len(arr) == 0:
        return []
    for i in range(len(arr)-1):
        if arr[i] == "NORTH" and arr[i+1] == "SOUTH" or arr[i+1] == "NORTH" and arr[i] == "SOUTH":
            return dirReduc(arr[:i]+arr[i+2:])
        if arr[i] == "EAST" and arr[i+1] == "WEST" or arr[i+1] == "EAST" and arr[i] == "WEST":
            return dirReduc(arr[:i]+arr[i+2:])
    return arr


if __name__ == '__main__':
    a = ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"]
    print(dirReduc(a))
    u = ["NORTH", "WEST", "SOUTH", "EAST"]
    print(dirReduc(u))
