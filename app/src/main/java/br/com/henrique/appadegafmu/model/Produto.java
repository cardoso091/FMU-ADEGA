package br.com.henrique.appadegafmu.model;

public class Produto {
    int imgProduto;
    String produtoName;
    String produtoDescricao;
    String price;

    public Produto(int imgProduto, String produtoName, String produtoDescricao, String price) {
        this.imgProduto = imgProduto;
        this.produtoName = produtoName;
        this.produtoDescricao = produtoDescricao;
        this.price = price;
    }

    public int getImgProduto() {
        return imgProduto;
    }

      public String getProdutoName() {
        return produtoName;
    }

     public String getProdutoDescricao() {
        return produtoDescricao;
    }


    public String getPrice() {
        return price;
    }


}
