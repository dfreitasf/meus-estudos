programa
{
	
	funcao inicio()
	{
		cadeia frutas[4]
		inteiro contador = 0
		
		frutas[0] = "Maçã"
		frutas[1] = "Pêra"
		frutas[2] = "Uva"
		frutas[3] = "Jaca"

		faca {
			escreva (frutas[contador] + "\n")
			contador++
		} enquanto (contador<=3)

		cadeia cesta[][]={{"Pêra","100"},{"Jaca","200"},{"Maçã","900"},{"Uva","89"}}
		contador = 0
		faca {
			escreva("\nProduto: " + cesta[contador][0] + " - Quantidade: " + cesta[contador][1])	
			contador++
		} enquanto(contador<=3)
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 496; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */