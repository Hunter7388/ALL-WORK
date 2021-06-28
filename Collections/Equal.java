package Collections;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<CodeE>{
	private String sectionNo;
	private String lectureNo;
	public Code(String sectionNo, String lectureNo) {
		super();
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}
	public String getSectionNo() {
		return sectionNo;
	}
	public String getLectureNo() {
		return lectureNo;
	}
	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}
	@Override
	public int compareTo(CodeE o) {
		String code1 = sectionNo.concat(lectureNo);
		String code2 = o.getSectionNo()+o.getLectureNo();
		return code1.compareTo(code2);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lectureNo == null) ? 0 : lectureNo.hashCode());
		result = prime * result + ((sectionNo == null) ? 0 : sectionNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeE other = (CodeE) obj;
		if (lectureNo == null) {
			if (other.lectureNo != null)
				return false;
		} else if (!lectureNo.equals(other.lectureNo))
			return false;
		if (sectionNo == null) {
			if (other.sectionNo != null)
				return false;
		} else if (!sectionNo.equals(other.sectionNo))
			return false;
		return true;
	}
	
}
 
public class Equal {

	public static void main(String[] args) {
		Map<CodeE,String> lectures = new TreeMap<>();
		lectures.put(new CodeE("S01","L03"), "Generics");
		lectures.put(new CodeE("S01","L01"), "Files under Java");
		lectures.put(new CodeE("S02","L03"), "Network programming");
		lectures.put(new CodeE("S01","L07"), "OOPS");
		lectures.put(new CodeE("S01","L05"), "Methods");
		lectures.put(new CodeE("S01","L03"), "Expressions");
		
		CodeE code1 =  new CodeE("S01","L03");
		CodeE code2 = new CodeE("S01","L03");
		System.out.println(code1.equals(code2));	
	}}