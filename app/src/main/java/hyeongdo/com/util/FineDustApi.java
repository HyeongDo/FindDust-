package hyeongdo.com.util;

import hyeongdo.com.model.FineDust;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FineDustApi {
    /*
    * 한국환경공단 가이드북 18p
    * 시도별 실시간 측정정보 조회
     * http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty
    * */
    String BASE_URL="http://openapi.airkorea.or.kr/";
    String ServiceKey = "xrUPpklOFY%2FBXvSkCst0EbzPWFAkygeMXhwc58QCK5RTFzJr2YNxLE3anoN2SWCkKCK3zRiMn3JPI1LP53LJvQ%3D%3D";

    @GET("openapi/services/rest/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty")
    Call<FineDust> getFineDust(@Query("ServiceKey") String ServiceKey, @Query("numberOfRaws") int numberOfRows,
                               @Query("pageNo") int pageNo, @Query("sidoName") String sidoName,
                               @Query("ver") double ver, @Query("_returnType") String _returnType);

}
