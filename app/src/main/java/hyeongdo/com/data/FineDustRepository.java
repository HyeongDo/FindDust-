package hyeongdo.com.data;

import hyeongdo.com.model.FineDust;
import retrofit2.Callback;

public interface FineDustRepository {
    boolean isAvailable();
    void getFindDustData(Callback<FineDust> callback);
}
