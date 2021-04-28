/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 28-04-2021
 *
 * Description of program
 ********************************************/

package dk.awayoflife.whowroteit;

import android.content.AsyncTaskLoader;
import android.content.Context;
import androidx.annotation.Nullable;

public class BookLoader extends AsyncTaskLoader<String> {

    private String mQueryString;

    BookLoader(Context context, String queryString) {
        super(context);
        mQueryString = queryString;
    }

    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(mQueryString);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }


}
