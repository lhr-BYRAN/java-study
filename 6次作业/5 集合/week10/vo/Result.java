package week10.vo;

public class Result {
	private String province;
	private int count;
	private String details;

	public Result() {
		super();
	}

	public Result(String province, int count, String details) {
		super();
		this.province = province;
		this.count = count;
		this.details = details;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return  province + ": " + count +"»À  (" + details + ")";
	}

}
