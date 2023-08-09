
stocks = {"AAPL": 10, "GOOGL": 5, "MSFT": 8}
prices = {"AAPL": 150.25, "GOOGL": 2500.75, "MSFT": 300.50}
current_prices = {"AAPL": 155.25, "GOOGL": 2600.75, "MSFT": 800.50}
initial_res = 115.7

"""Расчет общей(изначальной) стоимости портфеля акций"""
def calculate_portfolio_value(x: dict, y: dict) -> float:
    res = dict((k, v * y[k]) for k, v in x.items() if k in y)
    return sum(res.values())


# print(calculate_portfolio_value(stocks, prices))


"""Расчет доходности портфеля"""
def calculate_portfolio_return(initial_value, current_value):
     res = ((initial_value) / current_value) * 100
     return res


# print(f'profitability = {calculate_portfolio_return(initial_res, calculate_portfolio_value(stocks, prices))}')

"""Определение наиболее прибыльной акции"""
def get_most_profitable_stock(stocks: dict, prices: dict) -> str:
    res = dict((k, v * prices[k]) for k, v in stocks.items() if k in prices)
    max_valueable_equity = max(res)
    return max_valueable_equity

# print(get_most_profitable_stock(stocks, current_prices))