public class Operadores {
    public static void main(String[] args) {

  // Operadores Aritméticos
  int a = 10;
  int b = 5;
  int soma = a + b; // 15
  int subtracao = a - b; // 5
  int multiplicacao = a * b; // 50
  int divisao = a / b; // 2
  int modulo = a % b; // 0

  System.out.println("Soma: " + soma);
  System.out.println("Subtração: " + subtracao);
  System.out.println("Multiplicação: " + multiplicacao);
  System.out.println("Divisão: " + divisao);
  System.out.println("Módulo: " + modulo);

  // Operadores de Incremento e Decremento
  int x = 10;
  x++; // Incrementa x em 1 (11)
  x--; // Decrementa x em 1 (10)

  System.out.println("Incremento: " + x);
  x--;
  System.out.println("Decremento: " + x);

  // Operadores de Atribuição
  int y = 5;
  y += 3; // y = y + 3 (8)
  y -= 2; // y = y - 2 (6)
  y *= 2; // y = y * 2 (12)
  y /= 3; // y = y / 3 (4)
  y %= 3; // y = y % 3 (1)

  System.out.println("Atribuição com Adição: " + y);
  y += 3;
  System.out.println("Atribuição com Subtração: " + y);
  y -= 2;
  System.out.println("Atribuição com Multiplicação: " + y);
  y *= 2;
  System.out.println("Atribuição com Divisão: " + y);
  y /= 3;
  System.out.println("Atribuição com Módulo: " + y);
  y %= 3;
  
  // Operadores Relacionais
  boolean igual = (a == b); // false
  boolean diferente = (a != b); // true
  boolean maior = (a > b); // true
  boolean menor = (a < b); // false
  boolean maiorOuIgual = (a >= b); // true
  boolean menorOuIgual = (a <= b); // false

  System.out.println("Igual: " + igual);
  System.out.println("Diferente: " + diferente);
  System.out.println("Maior: " + maior);
  System.out.println("Menor: " + menor);
  System.out.println("Maior ou Igual: " + maiorOuIgual);
  System.out.println("Menor ou Igual: " + menorOuIgual);
        
    }
}
