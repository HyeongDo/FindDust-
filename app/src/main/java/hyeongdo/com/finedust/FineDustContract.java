package hyeongdo.com.finedust;

import hyeongdo.com.model.FineDust;

public interface FineDustContract {
    interface View{
       void showFindeDustResult(FineDust fineDust);
       void showLoadError(String message);
       void loadingStart();
       void loadingEnd();
       void reload(double lat,double lng);

    }
    interface UserActionsListener{
        void loadFindDustData();
    }
}
