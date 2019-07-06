package kr.co.JH5th.base.to;

import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_pm")
public class DustStatusTO extends BaseTO{
	
	String stationName,mangName,dataTime,pm10Grade,o3Grade,pm10Value,khaiGrade;

	public String getKhaiGrade() {
		return khaiGrade;
	}

	public void setKhaiGrade(String khaiGrade) {
		this.khaiGrade = khaiGrade;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getMangName() {
		return mangName;
	}

	public void setMangName(String mangName) {
		this.mangName = mangName;
	}

	public String getDataTime() {
		return dataTime;
	}

	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}

	public String getPm10Grade() {
		return pm10Grade;
	}

	public void setPm10Grade(String pm10Grade) {
		this.pm10Grade = pm10Grade;
	}

	public String getO3Grade() {
		return o3Grade;
	}

	public void setO3Grade(String o3Grade) {
		this.o3Grade = o3Grade;
	}

	public String getPm10Value() {
		return pm10Value;
	}

	public void setPm10Value(String pm10Value) {
		this.pm10Value = pm10Value;
	}

	
	
}
