
public class TestaEscopo {

    public static void main(String[] args){
        System.out.println("Testando escopo...");

        int idade = 20;
        int quantidadePessoas = 3;   
        
        
        boolean acompanhado;

        //Declarando a variável dentro do bloco {} ela morrerá após o bloco ser finalizado.
        //Devido a isso, a variável acompanhado foi declarada fora do bloco condicional if e else.
        if (quantidadePessoas >= 2) {
            acompanhado = true;
        }
        else {
            acompanhado = false;
        }

        if (idade >=18 || 
        	acompanhado){
			System.out.println("Acesso liberado!");
			System.out.println("Seja bem-vindo!");
        } 
        else {
			System.out.println("Acesso negado!");
			System.out.println("Você não cumpri com os requisitos para o acesso.");
        }
    }
}