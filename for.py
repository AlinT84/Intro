# for - loop, structura repetitiva
# de unde incepem?
# pana unde mergem?
# pasul pe care il parcurge

# # problema: printam 101 dalmatieni din 2 in 2
# for i in range(1, 102, 2):
#     print(f'Dalmatianul cu nr {i}')
#
# # parcurgere lista cu for prin intermediul indexului
# numere = [3, 7, 10, 15, 32]
# for i in range(0, len(numere)): # i = indexul
#     print(f'indexul curent este {i} iar numarul curent este {numere[i]}')
#
# # for each - parcurge toate elementele si ajunge direct la valoare
# for numar in numere:
#     print(f'Numarul curent este: {numar}')
#
# # parcurgem array de culori
# culori = ['alb', 'rosu', 'galben']
# for culoare in culori:
#     print(f'Culoarea actuala este {culoare}')
#
# # suma (s) numerelor dintr-un array
# s = 0
# for numar in numere:
#     print(f'Numarul curent este {numar}')
#     s = s + numar
# print(f'Suma numerelor este {s}')

# de cate ori apare 3 intr-o lista de numere
lista = [3, 2, 3, 5, 3, 3, 7, 8]
numar_cautat = int(input(f"Introdu numărul pe care dorești să-l cauți în lista urmatoare {lista}: "))
numar_aparitii = 0
for numar in lista:
    if numar == numar_cautat:
        numar_aparitii += 1
print(f"Numărul {numar_cautat} apare de {numar_aparitii} ori în lista.")