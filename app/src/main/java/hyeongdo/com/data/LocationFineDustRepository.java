package hyeongdo.com.data;

import hyeongdo.com.model.FineDust;
import hyeongdo.com.util.FineDustUtil;
import retrofit2.Callback;

public class LocationFineDustRepository implements FineDustRepository{
    private FineDustUtil mFineDustUtil;

    private String ServiceKey;
    private int numberOfRows;
    private int pageNo;
    private String sidoName;
    private double ver;
    private String _returnType;

    public LocationFineDustRepository(String serviceKey, int numberOfRows, int pageNo, String sidoName, double ver, String _returnType) {
        this.ServiceKey = serviceKey;
        this.numberOfRows = numberOfRows;
        this.pageNo = pageNo;

        this.sidoName = sidoName;
        this.ver = ver;
        this._returnType = _returnType;
    }

    @Override
    public boolean isAvailable() {
        if(ServiceKey=="xrUPpklOFY%2FBXvSkCst0EbzPWFAkygeMXhwc58QCK5RTFzJr2YNxLE3anoN2SWCkKCK3zRiMn3JPI1LP53LJvQ%3D%3D"){
            return true;
        }
        return false;
    }

    @Override
    public void getFindDustData(Callback<FineDust> callback) {
        mFineDustUtil.getApi().getFineDust(ServiceKey,numberOfRows,pageNo,sidoName,ver,_returnType).enqueue(callback);
    }
}
