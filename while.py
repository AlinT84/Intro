# while  - loop - zona de cod care se repeta atat timp cat o conditie este true

# problema: masina merge cat timp are benzina

litri_benzina = 10;
while litri_benzina > 0:
    # acceleram
    print('Vruuummm Vruuummm')
    # scadem benzina
    litri_benzina = litri_benzina - 1
    # aprindem beculetul rosu
    if  litri_benzina <= 3:
        print('Suntem pe rosu. Alimentati!')
print('Stop. Nu mai avem benzina')