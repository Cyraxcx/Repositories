

name = ["kirill", "alex", "nick"]
bet = [1, 2, 3]
percent = ["10.0%", "20.0%", "30.0%"]


def premium(names: list[str], cash: list[int], percent: list[str]) -> dict[str:float]:
    return {name: money / 100 * perc
            for name, money, perc in zip(names, cash, (float(i[:-1]) for i in percent))}


print(premium(name, bet, percent))