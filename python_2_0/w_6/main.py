from work.portfolio import calculate_portfolio_value
from work.portfolio import calculate_portfolio_return
from work.portfolio import get_most_profitable_stock


stocks = {"AAPL": 10, "GOOGL": 5, "MSFT": 8}
prices = {"AAPL": 150.25, "GOOGL": 2500.75, "MSFT": 300.50}
current_prices = {"AAPL": 155.25, "GOOGL": 2600.75, "MSFT": 800.50}


initial_portfolio_sum = calculate_portfolio_value(stocks, prices)
current_portfolio_sum = calculate_portfolio_value(stocks, current_prices)
growth = round(calculate_portfolio_return(initial_portfolio_sum, current_portfolio_sum),2)
max_equity_growth = get_most_profitable_stock(stocks, current_prices)


print(f"Стоимость портфеля - {initial_portfolio_sum}")
print(f"Текущая стоимость портфеля - {current_portfolio_sum}")
print(f'Прирост составляет - {growth}%')
print(f"Максимальный прирост показала акция - {max_equity_growth}")