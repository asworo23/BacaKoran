package triasworoms.newspaper.Common;

import retrofit2.Retrofit;
import triasworoms.newspaper.Interface.NewsService;
import triasworoms.newspaper.Remote.RetrofitClient;

/**
 * Created by Tri Asworo MS on 2/6/2018.
 */

public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }
}
