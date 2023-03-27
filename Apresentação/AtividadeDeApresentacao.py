#Funções de alta ordem
from functools import reduce

def soma(x, y):
    return x + y

numeros = [6, 75, 9, 30]
soma_total = reduce(soma, numeros)
print("soma_total:",soma_total)

#Composição de funções

alunos = [{'nome': 'Julia', 'nota': 10},
          {'nome': 'Julyane', 'nota': 7.0},
          {'nome': 'Lucas', 'nota': 6.0},
          {'nome': 'Ana', 'nota': 9.0},
          {'nome': 'Joao', 'nota': 5.5}]

aprovados = list(filter(lambda x: x['nota'] >= 7, alunos))

print("Aprovados:",aprovados)


# Imutabilidade

numeros = [5, 12, 16, 20]

new_numeros = list(map(lambda x: x * 2, numeros))

print("numeros:",numeros) 
print("new_numeros:",new_numeros)
#Funções puras

lista = [-10, 32, -44, 64, -25]

numeros_positivos = list(filter(lambda x: x > 0, lista))
print("numeros_positivos:",numeros_positivos)

# Recursão

def factorial(n):
    if n == 1:
        return 1
    else:
        return n * factorial(n-1)
print("factorial:",factorial(3))

# Currying

def saudacao(falar):
    def MeuNome(name):
        return f"{falar} {name}!"
    return MeuNome

resultado = saudacao("Oi, meu nome é")("Nayane")
print(resultado)

falarIngles = saudacao("Hi, I am")
falarPortugues = saudacao("Olá, eu sou")

print(falarIngles("José")) 
print(falarPortugues("Maria"))
