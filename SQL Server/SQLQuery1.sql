select * from StatusPedidoItem

select * from PedidoItem

select * from PedidoItemLog

select * from Pedido

select *
from Clientes cli
inner join Pedido ped
on cli.Codigo = ped.CodigoCliente

select	cli.Nome,
		ped.TotalPedido,
		case
			when cli.TipoPessoa = 'F' then 'Física'
			else 'Jurídica'
		end TipoPessoa
from Clientes cli
left join Pedido ped
on cli.Codigo = ped.CodigoCliente

select	*
from	PedidoItem t1
inner join	PedidoItemLog t2
on	t1.CodigoPedido = t2.CodigoPedido
and	t1.CodigoProduto = t2.CodigoProduto
inner join	StatusPedidoItem t3
on	t3.Codigo = t2.CodigoStatusPedidoItem
where Preco between 1 and 2

select	t4.Codigo,
		t4.Descricao,
		sum(t1.Preco * t1.Quantidade) Somatoria
from	PedidoItem t1
inner join	PedidoItemLog t2
on	t1.CodigoPedido = t2.CodigoPedido
and	t1.CodigoProduto = t2.CodigoProduto
inner join	StatusPedidoItem t3
on	t3.Codigo = t2.CodigoStatusPedidoItem
inner join	Produtos t4
on	t4.Codigo = t2.CodigoProduto
group by	t4.Codigo,
			t4.Descricao
having sum(t1.Preco * t1.Quantidade) > 10

select	*
from	Clientes cli
where cli.Codigo not in(select CodigoCliente from Pedido)

select *
from Clientes cli
left join Pedido ped
on cli.Codigo = ped.CodigoCliente
where ped.Codigo is not null

insert Pedido values(getdate(), 0, 10, 1, 1)

select *
from Clientes cli
left join Pedido ped
on cli.Codigo = ped.CodigoCliente

select		cli.Codigo,
			cli.Nome,
			count(ped.Codigo)
from		Clientes cli
left join	Pedido ped
on			cli.Codigo = ped.CodigoCliente
group by	cli.Codigo,
			cli.Nome