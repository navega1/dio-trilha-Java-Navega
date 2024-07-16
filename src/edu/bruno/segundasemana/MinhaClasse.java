package edu.bruno.segundasemana;

public class MinhaClasse { // -->> Classe <<-- \\
    public static void main(String[] args) { // -->> Parâmetros do método <<-- \\

        String primeiroNome = "Bruno"; // -->> Declarando variáveis <<-- \\
        String segundoNome = "Peereira";
        //String terceiroNome = "50";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome); // -->> Fórmula <<-- \\

        System.out.println(nomeCompleto); // -->> Imprimindo na tela <<-- \\
    }

    private static String nomeCompleto(String primeiroNome, String segundoNome) { // -->> Parâmetros do método <<-- \\
            return "Resultado do Método " + primeiroNome.concat(" ").concat(segundoNome); // -->> 2 formas de concatenações <<-- \\
        }
    }