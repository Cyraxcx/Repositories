strg = "Словари Python — нечто совершенно иное; они вообще не являются последовательностями и" \
       " взамен известны как отображения. Отображения также представляют собой коллекции других" \
       " объектов, но они хранят объекты по ключам, а не по относительным позициям. " \
       "В действительности отображения не поддерживают какой-либо надежный порядок слева направо;" \
       " они просто отображают ключи на связанные значения. Словари — единственный тип" \
       " отображения в наборе основных объектов Python — являются изменяемыми,’ как и списки," \
       " их можно модифицировать на месте и они способны увеличиваться и уменьшаться по " \
       "требованию. Наконец, подобно спискам словари — это гибкий инструмент для представления" \
       " коллекций, но их мнемонические ключи лучше подходят, когда элементы коллекции именованы" \
       " или помечены, скажем, как поля в записи базы данных."


def ten_popular(text: str) -> list[str]:
    delete = ".,!?;:-[]{}()="
    for i in delete:
        text = text.replace(i, "")
    text = text.lower()
    return sorted(set(text.split()), key=lambda x: text.count(x))[-10:]


print(ten_popular(strg))