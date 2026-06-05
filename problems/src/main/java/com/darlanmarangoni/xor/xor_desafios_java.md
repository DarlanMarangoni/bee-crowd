# Desafios de XOR em Java

> 5 problemas progressivos para dominar o operador `^` bit a bit.

---

## Desafio 1 — Único sem par (Fácil)

**Enunciado:**
Dado um array onde todo número aparece exatamente 2 vezes, exceto um, encontre esse número único. Resolva em O(n) de tempo e O(1) de espaço — sem HashMap, sem ordenação.

**Assinatura:**
```java
public static int uniqueNumber(int[] arr)
```

**Casos de teste:**
```
[4, 1, 2, 1, 2]     → 4
[2, 2, 3, 4, 4]     → 3
[7]                 → 7
[0, 1, 0]           → 1
```

**Dica:** Todo número XOR com ele mesmo vira 0. Todo número XOR com 0 permanece ele mesmo. Itere o array acumulando XOR — os pares se cancelam e sobra o único.

---

## Desafio 2 — Trocar sem variável temporária (Fácil)

**Enunciado:**
Dado dois inteiros `a` e `b`, troque seus valores sem usar nenhuma variável temporária. Use apenas o operador XOR.

**Assinatura:**
```java
public static int[] swap(int a, int b)
```

**Casos de teste:**
```
a=5,  b=3   → a=3,  b=5
a=0,  b=7   → a=7,  b=0
a=-1, b=10  → a=10, b=-1
a=4,  b=4   → a=4,  b=4
```

**Dica:** A sequência `a ^= b; b ^= a; a ^= b;` realiza a troca. Tente entender por que funciona escrevendo os valores bit a bit.

---

## Desafio 3 — Manipulação de bits na posição i (Médio)

**Enunciado:**
Implemente três métodos para manipular o bit na posição `i` (0-indexed, da direita para a esquerda) de um inteiro `n`:

1. `isSet` — verifica se o bit está ligado (retorna `boolean`)
2. `setBit` — liga o bit (retorna o novo número)
3. `toggleBit` — inverte o bit (retorna o novo número)

**Assinaturas:**
```java
public static boolean isSet(int n, int i)
public static int setBit(int n, int i)
public static int toggleBit(int n, int i)
```

**Casos de teste:**
```
isSet(5, 0)    → true   // 5 = 101, bit 0 = 1
isSet(5, 1)    → false  // 5 = 101, bit 1 = 0
setBit(5, 1)   → 7      // 101 → 111
toggleBit(5,0) → 4      // 101 → 100
toggleBit(5,1) → 7      // 101 → 111
```

**Dica:** Use `1 << i` para criar uma máscara. XOR com essa máscara inverte o bit desejado.

---

## Desafio 4 — Dois únicos (Médio)

**Enunciado:**
Dado um array onde exatamente dois elementos aparecem uma vez e todos os outros aparecem duas vezes, encontre esses dois elementos. Resolva em O(n) de tempo e O(1) de espaço.

**Assinatura:**
```java
public static int[] twoUnique(int[] arr)
```

**Casos de teste:**
```
[1, 2, 3, 2, 1, 4]   → [3, 4]
[5, 7, 5, 9, 7, 3]   → [9, 3]
[10, 20]             → [10, 20]
```

**Dica (passo a passo):**
1. Faça XOR de todos os elementos — o resultado é `a ^ b` (XOR dos dois únicos).
2. Encontre qualquer bit que seja 1 nesse resultado: `bit = xorTotal & (-xorTotal)` (bit menos significativo).
3. Esse bit difere entre `a` e `b`. Divida o array em dois grupos por esse bit e faça XOR em cada grupo — cada grupo entrega um dos únicos.

---

## Desafio 5 — Subarrays com XOR igual a k (Difícil)

**Enunciado:**
Dado um array de inteiros e um valor `k`, conte quantos subarrays contíguos têm o XOR de todos os seus elementos igual a `k`.

**Assinatura:**
```java
public static int countSubarraysXorK(int[] arr, int k)
```

**Casos de teste:**
```
arr=[4, 2, 2, 6, 4], k=6   → 4
arr=[5, 6, 7, 8, 9], k=5   → 2
arr=[1, 1, 1, 1],    k=0   → 4
arr=[3],             k=3   → 1
```

**Dica (prefixXOR + HashMap):**
- Defina `prefixXor[i]` = XOR de `arr[0..i]`.
- Um subarray `arr[l..r]` tem XOR igual a `k` se `prefixXor[r] ^ prefixXor[l-1] == k`, o que equivale a `prefixXor[l-1] == prefixXor[r] ^ k`.
- Use um `HashMap<Integer, Integer>` para contar ocorrências de cada prefixXOR já visto, similar ao problema de "subarray sum equals k".

```java
// Estrutura base
Map<Integer, Integer> freq = new HashMap<>();
freq.put(0, 1); // prefixo vazio
int xor = 0, count = 0;
for (int num : arr) {
    xor ^= num;
    count += freq.getOrDefault(xor ^ k, 0);
    freq.merge(xor, 1, Integer::sum);
}
return count;
```

---

## Resumo das propriedades XOR

| Propriedade | Exemplo |
|---|---|
| `a ^ a = 0` | pares se cancelam |
| `a ^ 0 = a` | neutro é zero |
| Comutativo | `a ^ b == b ^ a` |
| Associativo | `(a^b)^c == a^(b^c)` |
| Toggle de bit i | `n ^= (1 << i)` |
| Bit menos significativo | `n & (-n)` |
