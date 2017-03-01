package ninja.chaoticgabibo.fightingfantasy.provider;

import android.app.Activity;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import ninja.chaoticgabibo.fightingfantasy.model.Book;
import ninja.chaoticgabibo.fightingfantasy.model.Reference;
import ninja.chaoticgabibo.fightingfantasy.model.ReferenceDescription;

public class BookProvider {

    public Book createBook(String json) {
        if (json == null) {
            return null;
        }
        Gson gson = new Gson();
        Book book = gson.fromJson(json, Book.class);
        linkReferences(book);

        return book;
    }

    private void linkReferences(Book book) {
        List<Reference> references = book.getReferences();
        for (Reference reference : references) {
            for (ReferenceDescription referenceDescription : reference.getReferenceDescriptions()) {
                for (Reference searchedReference : references) {
                    if (searchedReference.getId() == referenceDescription.getReferenceId()) {
                        referenceDescription.setReference(searchedReference);
                        break;
                    }
                }
            }
        }
    }

    public Book createBook(InputStream json) {
        return createBook(loadJSONFromAsset(json));
    }

    public Book createBook(Activity activity, String assetsPath) {
        try {
            InputStream inputStream = activity.getAssets().open(assetsPath);
            return createBook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String loadJSONFromAsset(InputStream inputStream) {
        String json;
        try {
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
