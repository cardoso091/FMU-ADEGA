package br.com.henrique.appadegafmu.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.com.henrique.appadegafmu.databinding.ProdutoItemBinding;
import br.com.henrique.appadegafmu.model.Produto;

public class ProdutoAdapter extends RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder> {

    private final ArrayList<Produto> produtoList;
    private final Context context;

    public ProdutoAdapter(ArrayList<Produto> produtoList, Context context) {
        this.produtoList = produtoList;
        this.context = context;

    }


    @NonNull
    @Override
    public ProdutoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ProdutoItemBinding listItem;
        listItem = ProdutoItemBinding.inflate(LayoutInflater.from(context),parent,false);
        return new ProdutoViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoViewHolder holder, int position) {
    holder.binding.imgProduto.setBackgroundResource(produtoList.get(position).getImgProduto());
    holder.binding.txtProdutoName.setText(produtoList.get(position).getProdutoName());
    holder.binding.txtProdutoDescricao.setText(produtoList.get(position).getProdutoDescricao());
    holder.binding.txtPrice.setText(produtoList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return produtoList.size();
    }

    public static class ProdutoViewHolder extends RecyclerView.ViewHolder{

    ProdutoItemBinding binding;

        public ProdutoViewHolder(ProdutoItemBinding binding) {
            super(binding.getRoot());
        this.binding = binding;
        }
    }

}
