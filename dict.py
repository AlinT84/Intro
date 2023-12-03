lista_goala = []
dict_gol = {}

# declaram si initializam un dict (dictionar)
note_elevi = {'Gigel': 10, 'Costel': 9, 'Ana': 10}

# adaugam elemente
note_elevi['Sebi'] = 7

# pritam dict-ul
print(note_elevi)

# aflam elemente din cadrul dictionarului
print(note_elevi['Gigel']) # sau
print(note_elevi.get('Gigel'))

# actualizam valori
note_elevi['Costel'] = 10
print('Costel si-a marit nota la ', note_elevi['Costel']) # sau
print('Costel si-a marit nota la ', note_elevi.get('Costel'))

# stergem valori
note_elevi.pop('Gigel')
print(note_elevi.get('Gigel', 'nu mai avem acest elev'))
print(note_elevi)

# returneaza doar cheile
print(note_elevi.keys())

# returneaza doar valorile
print(note_elevi.values())
