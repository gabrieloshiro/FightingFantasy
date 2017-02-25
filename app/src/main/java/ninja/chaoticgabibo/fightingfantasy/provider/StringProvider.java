package ninja.chaoticgabibo.fightingfantasy.provider;

import android.content.Context;
import android.support.annotation.StringRes;

public class StringProvider {

    private Context context;

    public StringProvider(Context context) {
        this.context = context;
    }

    public String getString(@StringRes int stringId) {
        return context.getString(stringId);
    }

    public String getString(@StringRes int stringId, Object... args) {
        return context.getString(stringId, args);
    }
}
