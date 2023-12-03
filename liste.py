# listele in Python pot sa cuprinda elemente de tipuri diferite
# au dimensiune dinamica
fructe = ['mar', 'banana', 'portocala', 3, True, 3]

# afisam o lista
print(fructe)

# accesam un element in functie de index
fructe[1] #banana

# adaugam un nou element
fructe.append('rosie')

# suprascriem un elemnt
fructe[0] = 'para'

#afisam noua lista
print(fructe)

# aflam dimensiunea
print(len(fructe)) # 6

# scoate si ne returneaza ultimul element
last = fructe.pop()
print('ultimul element: ', last)
print('noua lista: ', fructe)

# de cate ori apare un element
print('elementul apare de: ', fructe.count(3), ' ori.')

# extindem lista cu o alta lista
fructe_exotice = ['ananas', 'kiwi']
fructe.extend(fructe_exotice)
print(fructe)

'''
        alte tipuri de structuri de date

        SET - lista de elemente in care fiecare element apare o singura data

        COADA - pers1, pers 2, pers 3 - FIFO (First IN, First Out)
        pop - scoate primul element => per2, per3

        STIVA - tip LIFO (Last In, First Out)
        ex: turnul din Hanoi

        cerc1   pop =>  cerc2
        cerc2           cerc3
        cerc3
'''