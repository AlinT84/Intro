# variabila = zona din memorie care tine date
# variabila = cutiuta in care punem valori

# am declarat si initializat variabilele
marca_masina = ('Volvo')
model_masina = ('XC 60')

# nu putem sa punem spatiu in numele variabilei
# o variabila incepe cu litera mica

#loosely typed - nu trebuie sa specificam tipul de date

print(f'Am cumparat o masina marca: {marca_masina}')
print(f'Este modelul: {model_masina}')

# suprascriere
model_masina = 'XC 60 Facelift'

print(f'Am cumparat o masina marca: {marca_masina}')
print(f'Este modelul: {model_masina}')

nume = 'Tcaciuc'
prenume = 'Alin'
varsta = 34

#concatenare
print(prenume + ' ' + nume) # nu este varianta recomandata

print(f"{prenume} {nume} si am varsta de {varsta}")