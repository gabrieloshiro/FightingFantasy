package ninja.chaoticgabibo.fightingfantasy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ninja.chaoticgabibo.fightingfantasy.model.Book;
import ninja.chaoticgabibo.fightingfantasy.provider.BookProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BookProvider bookProvider = new BookProvider();
        Book book = bookProvider.createBook(this, "thewarlockoffiretopmountain/thewarlockoffiretopmountain.json");

    }
}
