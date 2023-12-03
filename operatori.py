'''
Operatori:
   aritmetici: +, -, *, /, % (modulo - ne da restul impartirii)
   de comparare: <, >, ==, != (diferit), <=, >=
   logici: and, or, ! (not - se pune in fata; intoarce rezultatul)
'''

a=3
b=5

print(a + b) # 8
print(a == b) # a este egal cu b? => False
print(a<b and a<4) # True SI True => True
print(a<b or a<4) # True SI False => True

# cu mama sau tata sau (cu bunicu si bunica)
mama = True
tata = False
bunicu = False
bunica = False

print(mama or tata or(bunicu and bunica)) # =>True