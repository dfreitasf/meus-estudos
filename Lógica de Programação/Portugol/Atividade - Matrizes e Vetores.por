programa
{
	
	funcao inicio()
	{
		cadeia cadastro[3][3]
		inteiro contador1 = 0, contador2 = 0
		
		cadastro[0][0] = "João"
		cadastro[0][1] = "São Paulo"
		cadastro[0][2] = "(11) 9999-5241"
		cadastro[1][0] = "Maria"
		cadastro[1][1] = "Ribeirão Preto"
		cadastro[1][2] = "(16) 9999-8596"
		cadastro[2][0] = "Ana"
		cadastro[2][1] = "Manaus\t"
		cadastro[2][2] = "(92) 9999-8574"

		faca {

			escreva (cadastro[contador1][contador2] + "\t")
			contador2++
			se (contador2 > 2) {
				contador2 = 0
				contador1++
				escreva("\n")
			}
			
		} enquanto (contador1 <= 2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */