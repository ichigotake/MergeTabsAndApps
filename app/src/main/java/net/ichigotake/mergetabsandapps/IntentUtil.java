package net.ichigotake.mergetabsandapps;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;

public final class IntentUtil {

    private IntentUtil() {
        throw new RuntimeException();
    }

    @Nullable
    public static Uri extractUri(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.getData();
    }

    public static void share(Context context, CharSequence title, String url) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, url);
        intent.putExtra(Intent.EXTRA_TEXT, url);
        context.startActivity(intent);
    }

}
