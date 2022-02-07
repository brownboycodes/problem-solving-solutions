def maxProfit(prices):
    if len(prices)==0:
        return 0
    minPrice = prices[0]
    profit = 0
    for i in range(len(prices)):
       profit = max(profit, prices[i] - minPrice)
       minPrice = min(minPrice, prices[i]) 
    return profit

# print(maxProfit([7,1,5,3,6,4]))