package kr.co.JH5th.base.to;


import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_pm")
public class ParticulateMatterTo extends BaseTO{

	String dataTime, pm10Value, pm25Value, khaiValue, khaiGrade;

	public String getDataTime() {
		return dataTime;
	}

	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}

	public String getPm10Value() {
		return pm10Value;
	}

	public void setPm10Value(String pm10Value) {
		this.pm10Value = pm10Value;
	}

	public String getPm25Value() {
		return pm25Value;
	}

	public void setPm25Value(String pm25Value) {
		this.pm25Value = pm25Value;
	}

	public String getKhaiValue() {
		return khaiValue;
	}

	public void setKhaiValue(String khaiValue) {
		this.khaiValue = khaiValue;
	}

	public String getKhaiGrade() {
		return khaiGrade;
	}

	public void setKhaiGrade(String khaiGrade) {
		this.khaiGrade = khaiGrade;
	}
}
