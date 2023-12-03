'''
Flow control - if else
        - evalueaza conditii si bifurca codul in functie de rezultat
'''

# #if
#
# print('pornim radio')
# piesa_faina=True
# if piesa_faina == True:
#     print('dam mai tare')
#     print('fredonam')
# print('oprim radio')
#
# #if else
#
# #daca nr este par printam acest lucru, altfel printam impar
# nr = 3
#
# # ce inseamna par? se imparte exact la 2
# # ce inseamna ca se imparte la 2? ne da restul 0
#
# if nr % 2 == 0:
#     print('nr par')
# else:
#     print('impar')
#
# # este un nr pozitiv?
# if (nr > 0):
#     print('pozitiv')
# else:
#     print('negativ')
#
# # if, else if, else
#
# # cum ne saluta robotelul in functie de ora?
# # luam date de la tastatura
# # ne asiguram ca sunt transformate din string in int
#
# ora = int(input('Introdu ora '))
# if ora < 0:
#     print('ora invalida')
# elif ora <= 11:
#     print('buna dimineata')
# elif ora <= 18:
#     print('buna ziua')
# elif ora <= 21:
#     print('buna seara')
# elif    ora <= 24:
#     print('noapte buna')
# else:
#     print('ora invalida')
    # CTRL + /  - pt a comenta/decomenta mai multe linii

# robotel telefonic (switch din JAVA)
opt = int(input('alege optiunea: '))
if opt == 0:
    print('meniu anterior')
elif opt == 1:
    print('ati ales RO')
elif opt == 2:
    print('ati ales EN')
else:
    print('nu am identificat optiunea. mai incearca')