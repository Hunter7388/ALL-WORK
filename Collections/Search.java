package Collections;

import java.util.Map;
import java.util.TreeMap;
class CODEFOUR implements Comparable<CODEFOUR> {
	private String SectionNo;
	private String lectureNo;

	public CODEFOUR(String sectionNo, String lectureNo) {
		super();
		SectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	public String getSectionNo() {
		return SectionNo;
	}

	public String getLectureNo() {
		return lectureNo;
	}

	@Override
	public String toString() {
		return "Code [SectionNo=" + SectionNo + ", lectureNo=" + lectureNo + "]";
	}

	public int compareTo(CODEFOUR o) {
		String code1 = SectionNo.concat(lectureNo);
		String code2 = o.getLectureNo() + o.getSectionNo();
		return code1.compareTo(code2);
	}

}

public class Search {

	public static void main(String[] args) {

		Map<CODEFOUR, String> lectures = new TreeMap<>();

		lectures.put(new CODEFOUR("qw", "qw"), "Generics");
		lectures.put(new CODEFOUR("S01", "L01"), "Files under Java");
		lectures.put(new CODEFOUR("S02", "L03"), "Network programming");
		lectures.put(new CODEFOUR("S01", "L07"), "OOPS");
		lectures.put(new CODEFOUR("S01", "L05"), "Methods");

		CODEFOUR code = null;

		for (Map.Entry<CODEFOUR, String> entry : lectures.entrySet()) {
			System.out.println(entry);
		}

		System.out.println("The key for value \"OOPS\" :" + code);
	}
}