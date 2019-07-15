package hyeongdo.com.model;

public class Info {
    private String stationName;
    private int pm10Grade;
    private String dataTime;
    private int pm10Value;

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public int getPm10Grade() {
        return pm10Grade;
    }

    public void setPm10Grade(int pm10Grade) {
        this.pm10Grade = pm10Grade;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public int getPm10Value() {
        return pm10Value;
    }

    public void setPm10Value(int pm10Value) {
        this.pm10Value = pm10Value;
    }
}
