programa
{
	
	funcao inicio()
	{
		cadeia nomeVendedor
		real vendasJaneiro, vendasFevereiro, vendasMarco, vendasAbril, totalVendas, mediaVendas

		escreva("Entre com o nome do vendedor: ")
		leia(nomeVendedor)
		
		escreva("Entre com o total de vendas no mês de Janeiro: ")
		leia(vendasJaneiro)

		escreva("Entre com o total de vendas no mês de Fevereiro: ")
		leia(vendasFevereiro)

		escreva("Entre com o total de vendas no mês de Março: ")
		leia(vendasMarco)

		escreva("Entre com o total de vendas no mês de Abril: ")
		leia(vendasAbril)

		totalVendas = vendasJaneiro + vendasFevereiro + vendasMarco + vendasAbril
		mediaVendas = totalVendas/4

		escreva("O vendedor " + nomeVendedor + " conseguiu vender um total de R$" + totalVendas + " e obteve uma \nmédia de vendas de R$" + mediaVendas)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 787; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */