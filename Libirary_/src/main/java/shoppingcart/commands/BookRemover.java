package shoppingcart.commands;

import librarypackage.Book;
import shoppingcart.ShoppingCart;

public class BookRemover implements ShoppingCartCommand {
    private final Book book;

    public BookRemover(Book book) {
        this.book = book;
    }

    @Override
    public void execute(ShoppingCart shoppingCart) {
        shoppingCart.getBooks().remove(book);
    }
}
