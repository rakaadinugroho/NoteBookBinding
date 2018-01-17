package id.privy.notebinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import id.privy.notebinding.databinding.ItemBookBinding;

/**
 * Created by Raka on 1/17/18.
 */

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookHolder> {
    Context context;
    List<Book> books;

    public BookAdapter(Context context, List<Book> books) {
        this.context = context;
        this.books = books;
    }

    @Override
    public BookHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemBookBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(context),
                R.layout.item_book,
                parent,
                false
        );
        return new BookHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(BookHolder holder, int position) {
        Book book   = books.get(position);
        holder.binding.setBook(book);
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class BookHolder extends RecyclerView.ViewHolder{
        ItemBookBinding binding;
        public BookHolder(final View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Book book   = binding.getBook();
                    Toast.makeText(itemView.getContext(), "Book " + book.name, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
