class ContBancar:
    # constructor
    def __init__(self, titularCont, iban):
        # atribute, fielsd
        self.titularCont = titularCont
        self.iban = iban
        self.sold = 0
        self.activ = False
        self.pin = 7777
        self.incercari_activare = 0

    # metode
        # nu se poate defini o metoda in alta metoda
        # se poate apela o metoda in alta metoda

    def salut(self):
        print(f'Buna {self.titularCont}')

    def interogareSold(self):
        print(f'Titular: {self.titularCont}')
        print(f'IBAN: {self.iban}')
        print(f'Sold: {self.sold}')
        print(f'Activ: {self.activ}')
        print(f'Nr de incercari gesite: {self.incercari_activare}')
        print('--------------------------------')

    def activareCont(self, pin_utilizator):
        # modifica activ in true doar daca pinul este corect
        self.salut()
        if pin_utilizator == self.pin:
            print(f'Activat cu succes.')
            self.activ = True
        else:
            print(f'PIN gresit')
            self.incercari_activare += 1 # incrementeaza (este operator de atribuire)
                # se poate scrie si self.incercari_activare = self.incercari_activ1
        print('--------------------------------')

    def alimentareCont(self, suma):
        self.sold += suma # se ia suma si se adauga la sold
        self.salut()
        print(f'Ai depus cu succes suma de {suma}. Ai in cont suma de {self.sold}')
        print('--------------------------------')

    def plataCard(self, suma): # numconteaza faptul ca au aceeasi denumire - fiecare activeaza doar in metoda ei si nu stiu una de cealalta
        self.salut()
        # pot sa cheltuiesc doar ce am
        # daca suma cheltuita <= sold
        if suma <= self.sold:
            self.sold -= suma # se ia soldul si se scade suma
                # se poate scrie si self.sold = self.sold - suma
            print(f'Ai cheltuit {suma}')
            print(f'Mai ai in cont {self.sold}')
        else:
            print(f'Fonduri insuficiente')
        print('--------------------------------')