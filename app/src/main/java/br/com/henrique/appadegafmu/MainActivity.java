package br.com.henrique.appadegafmu;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.com.henrique.appadegafmu.adapter.ProdutoAdapter;
import br.com.henrique.appadegafmu.databinding.ActivityMainBinding;
import br.com.henrique.appadegafmu.model.Produto;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ProdutoAdapter produtoAdapter;
    private ArrayList<Produto> produtoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewProduto = binding.RecyclerViewProduto;
        recyclerViewProduto.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewProduto.setHasFixedSize(true);
        produtoAdapter = new ProdutoAdapter(produtoList, this);
        recyclerViewProduto.setAdapter(produtoAdapter);
        getProduto();

    }

    private void getProduto(){

        Produto produto1 = new Produto(
                R.drawable.produto1,
                "Red Label",
                "Johnnie Walker Whisky Red Label. O blend pioneiro que lançou o Johnnie Walker para o mundo e hoje é o whisky escocês mais vendido.",
                "$ 120,00"
        );
        produtoList.add(produto1);


        Produto produto2 = new Produto(
                R.drawable.produto2,
                "Catuaba Selvagem",
                "Catuaba Selvagem é uma bebida composta por um mix especial de ervas amazônicas, cujas qualidades foram descobertas pelos índios Tupi-Guarani, há mais de 500 anos, e transmitidas através de gerações. Das cascas e raízes da catuaba e das sementes do guaraná obtemos extratos com propriedades únicas que, quando utilizados na receita especial da Selvagem, proporcionam um sabor de incomparável prazer.",
                "$ 30,00"
        );
        produtoList.add(produto2);


        Produto produto3 = new Produto(
                R.drawable.produto3,
                "Cerveja Corona",
                "Cerveja Corona Coronita Extra não é só uma cerveja, é um estilo de vida. Um convite para se desconectar da rotina e aproveitar mais a vida lá fora, na praia e curtindo um pôr do sol com os amigos. A Corona clássica: gelada e com uma fatia de limão. Produzida com ingredientes de alta qualidade e cuidadosamente selecionados, ela traz o melhor do estilo American Lager para dentro do seu copo. Ao degustar você pode apreciar um sabor marcante com amargor presente. Nesta embalagem você leva 6 unidades de 210ml cada.",
                "$ 50,00"
        );
        produtoList.add(produto3);


        Produto produto4 = new Produto(
                R.drawable.produto4,
                "Coca-cola",
                "Esqueceu sua garrafa retornável em casa? Não se preocupe! Baixe aqui o cupom da Garrafa Virtual e pague somente o líquido.",
                "$ 20,00"
        );
        produtoList.add(produto4);


        Produto produto5 = new Produto(
                R.drawable.produto5,
                "Smirnoff Ice",
                "A Vodka Smirnoff Ice Original é uma bebida mista, com sabor de limão. Ela vem em uma garrafinha long neck de vidro com 275ml, pronta para beber. A marca é pioneira no segmento de bebidas e garante toda a qualidade do produto. É ideal para ser consumida gelada, com teor alcoólico de 5%. Suas notas gustativas possuem um leve toque de limão e não contém glúten. Conserve em temperatura ambiente. A venda de bebidas alcoólicas é proibida para menores de 18 anos. Beba com moderação e evite o consumo excessivo de álcool.",
                "$ 80,00"
        );
        produtoList.add(produto5);

        }

    }
