package jsc.exam.com.arc.retrofit;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {

    @GET("JustinRoom/CameraMaskDemo/master/output/output.json")
    Observable<String> getVersionInfo();

}
