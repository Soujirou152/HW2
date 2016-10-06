
public class Grade {
	private double[] rdQ;
	private int numRdQ;
	private double[] rvQ;
	private int numRvQ;
	private double[] labs;
	private int numLabs;
	private double[] hw;
	private int numHw;
	private double project;
	private double attendance;
	private final int maxPointHwRdQL = 10;
	private final int maxPointRvQ = 15;

	public Grade() {
		rdQ = new double[12];
		numRdQ = 0;
		rvQ = new double[12];
		numRvQ = 0;
		labs = new double[12];
		numLabs = 0;
		hw = new double[12];
		numHw = 0;
		project = 100;
		attendance = 14;
	}

	public void addRdQ(double score) {
		rdQ[numRdQ] = score;
		numRdQ++;
	}

	public void addRvQ(double score) {
		rvQ[numRvQ] = score;
		numRvQ++;
	}

	public void addLab(double score) {
		labs[numLabs] = score;
		numLabs++;
	}

	public void addHw(double score) {
		hw[numHw] = score;
		numHw++;
	}

	public double calcGradePct() {
		double sumRdQ = 0;
		for (int i = 0; i < numRdQ; i++) {
			sumRdQ = sumRdQ + rdQ[i];
		}
		double rdQWeight = .15 * (sumRdQ / (maxPointHwRdQL * numRdQ));

		double sumRvQ = 0;
		for (int i = 0; i < numRvQ; i++) {
			sumRvQ = sumRvQ + rvQ[i];
		}
		double rvQWeight = .10 * (sumRvQ / (maxPointRvQ * numRvQ));

		double sumLabs = 0;
		for (int i = 0; i < numLabs; i++) {
			sumLabs = sumLabs + labs[i];
		}
		double labsWeight = .15 * (sumLabs / (maxPointHwRdQL * numLabs));

		double sumHw = 0;
		for (int i = 0; i < numHw; i++) {
			sumHw = sumHw + hw[i];
		}
		double hwWeight = .3 * (sumHw / (maxPointHwRdQL * numHw));

		double projWeight = .2 * project / project;

		double attendanceWeight = .1 * attendance / attendance;

		double gradePct = rdQWeight + rvQWeight + labsWeight + hwWeight + projWeight + attendanceWeight;

		return gradePct;
	}

	public String calcCourseGrade() {
		String courseGrade = null;
		double gradePct = calcGradePct();
		if (gradePct >= .93) {
			courseGrade = "A";
		} else if (.90 < gradePct && gradePct < .92) {
			courseGrade = "A-";
		} else if (.87 < gradePct && gradePct < .89) {
			courseGrade = "B+";
		} else if (.83 < gradePct && gradePct < .86) {
			courseGrade = "B";
		} else if (.80 < gradePct && gradePct < .82) {
			courseGrade = "B-";
		} else if (.77 < gradePct && gradePct < .79) {
			courseGrade = "C+";
		} else if (.73 < gradePct && gradePct < .76) {
			courseGrade = "C";
		} else if (.70 < gradePct && gradePct < .72) {
			courseGrade = "C-";
		} else if (.60 < gradePct && gradePct < .69) {
			courseGrade = "D";
		} else {
			courseGrade = "F";
		}

		return courseGrade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade courseGrade = new Grade();
		courseGrade.addHw(10);
		courseGrade.addRdQ(8);
		courseGrade.addRdQ(7.54);
		courseGrade.addRdQ(6.5);
		courseGrade.addRdQ(9);
		courseGrade.addLab(10);
		courseGrade.addLab(10);
		courseGrade.addLab(10);
		courseGrade.addLab(10);
		courseGrade.addRvQ(11.21667);
		courseGrade.addRvQ(14.66667);

		System.out.println(courseGrade.calcGradePct() + " " + courseGrade.calcCourseGrade() + "");
		// courseGrade.calcCourseGrade());
	}

}
