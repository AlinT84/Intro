# facem obiectele
from oop.cont_bancar import ContBancar

# initializam obiecte de tip ContBancar
# sunt instante ale clasei ContBancar
cont1 = ContBancar('AlinT','RO001')
cont2 = ContBancar('AdinaA','RO002')

# activam conturile
cont1.activareCont(7777)
cont2.activareCont(3333)
cont2.activareCont(7777)

# alimentam contul
cont1.alimentareCont(300)
cont2.alimentareCont(700)
cont2.alimentareCont(300)

# negative testing (cheltuim mai mult decat avem)
cont1.plataCard(500) # nu, 300 => pass

# positive cu suma exacta
cont1.plataCard(300) # da, 0 => pass

# positive de 2X
cont2.plataCard(100) # da, 900 => pass
cont2.plataCard(200) # da, 700 => pass

cont1.interogareSold()
cont2.interogareSold()

'''
tema
clasa Angajat
nume, prenume, salariu, functie, vechime
constructor: nume, prenume, salariu, functie, vechime
metode:
    descriere
    marire salariu in f de vechime
        daca are vechime sub 5 ani marim cu 300, peste 5 ani cu 500
    actualizare vechime (parametru vechime)
        self.vechime = noua.vechime
'''
