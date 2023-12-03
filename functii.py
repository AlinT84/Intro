def printGreeting():
    print('Buna ziua! Bine ati venit!')

def printGreetingByName(nume, prenume):
    print(f'Buna ziua {nume} {prenume}')

def mediaNr(a, b, c):
    return (a + b + c) / 3

def piValue():
    return 3.14

# daca persoana e majora se creaza cont, atfel nu se creaza cont
def creareCont():
    varsta = int(input('introduceti varsta dumneavoastra '))
    if varsta >= 18:
        print('Cont creat. Bine ai venit in aplicatie.') # verifica in functie de True
    else:
        print('Nu ai varsta minima necesara (18) pt a paria.')


# zona de apelare (desktop)
printGreeting()
printGreeting()

printGreetingByName('Popescu', 'Ion')
printGreetingByName('Popescu', 'Gigi')
printGreetingByName('Popescu', 'Sorin')

print(mediaNr(3, 3, 4))

print(piValue())

creareCont() # aici nu mai apelam functia cu print pt ca am folosit print in cadrul functiei, inloc de return (caz in care am fi apelat functia cu print)


# Programare obiectuala (OOP)
# variabile => atribute, proprietati sau fields
# functii => metode