programa
{
	
	funcao inicio()
	{
		inteiro tabuada, contador = 0, limite = 0
		
		escreva("Entre com o numero inteiro que você deseja visualizar a tabuada:")
		leia(tabuada)

		escreva("Entre com o valor limite até onde você deseja que a tabuada seja multiplicada:")
		leia(limite)

		faca {
			escreva(tabuada + " x " + contador + " = " + tabuada*contador + "\n")
			contador++
		} enquanto (contador <= limite)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 418; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */